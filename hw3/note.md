# Collections & Concurrency

---

## Question
Difference between `ArrayList` and `LinkedList`?

## Answer
- **Internal structure**
    - `ArrayList`: dynamic array (contiguous memory).
    - `LinkedList`: doubly linked list (nodes with `prev/next`).
- **Access**
    - `ArrayList`: random access `O(1)` by index.
    - `LinkedList`: by index is `O(n)` (must traverse).
- **Insert/Delete**
    - Middle insert/delete:
        - `ArrayList`: `O(n)` (shifts elements).
        - `LinkedList`: `O(1)` *after* you have the node; locating it is `O(n)`.
    - Ends:
        - Append at end: `ArrayList` amortized `O(1)`; `LinkedList` `O(1)` if you have tail.
        - Insert/remove at head: `ArrayList` `O(n)`; `LinkedList` `O(1)`.
- **Iteration**
    - Both `O(n)`, but `ArrayList` is usually faster due to CPU cache locality.
- **Memory**
    - `ArrayList` stores only elements; `LinkedList` stores elements **plus** two pointers per node (higher overhead).
- **Use when**
    - `ArrayList`: frequent reads, infrequent mid-list insertions.
    - `LinkedList`: frequent insert/remove at ends or via iterators while traversing.

---

## Question
Difference between `Vector` and `ArrayList`?

## Answer
- **Thread safety**
    - `Vector`: methods are synchronized (legacy, coarse-grained).
    - `ArrayList`: not synchronized.
- **Performance**
    - `ArrayList` is faster in single-threaded contexts; `Vector`’s synchronization adds overhead.
- **Growth policy**
    - `Vector`: historically grows by **doubling** its capacity unless a capacity increment is set.
    - `ArrayList` (modern JDKs): grows by about **1.5×** when expanding.
- **Recommendation**
    - Prefer `ArrayList`. If you need a thread-safe list, use `Collections.synchronizedList(new ArrayList<>())` or `CopyOnWriteArrayList` depending on write frequency. `Vector` is maintained for legacy compatibility.

---

## Question
Time complexity of `HashMap`?

## Answer
- **Average case**: `put`, `get`, `remove` — **O(1)**.
- **Worst case**:
    - Pre–Java 8: a bucket could degrade to a linked list → **O(n)**.
    - Java 8+: heavily collided buckets are **treeified** (red–black tree) → **O(log n)** for those buckets.
- **Iteration**: over all entries is **O(n)**.

---

## Question
Java `HashMap` implementation?

## Answer
- **Core structure**: array of buckets `Node<K,V>[] table`. Index = (spread hash) & (table.length - 1).
- **Bucket representation**:
    - Starts as a singly linked list of nodes.
    - If a bucket becomes too large (default threshold ≈ 8) **and** table capacity ≥ 64, it **treeifies** into a red–black tree; if it shrinks, it may untreeify.
- **Hash spreading**: mixes high bits into low bits to reduce collisions before indexing.
- **Resize policy**: expands when `size > capacity × loadFactor` (default load factor **0.75**). Resize roughly doubles capacity and rehashes/splits buckets.
- **Key comparison**: locate bucket by hash; within bucket use `equals()` to find the exact key.
- **Iterators**: fail-fast (best-effort `ConcurrentModificationException`) in face of structural modifications.

---

## Question
What happens if a hash collision occurs?

## Answer
- The entry goes into the same bucket as the collided key.
- Within the bucket:
    - If using a **list**, the map scans nodes and compares keys with `equals()`; if the key exists, the value is replaced; otherwise, a new node is appended/inserted.
    - If the bucket is **treeified**, nodes are stored in a red–black tree ordered by hash (and tie-broken deterministically); lookups/inserts are **O(log n)**.
- Heavy collision patterns may trigger resize or treeification thresholds.

---

## Question
What are `hashCode()` and `equals()`?

## Answer
- **`equals(Object)`**: tests **logical equality** between two objects.
- **`hashCode()`**: returns an `int` hash used by hash-based containers to choose a bucket.
- **Contract**:
    - If `a.equals(b)` is **true**, then `a.hashCode() == b.hashCode()` **must** be true.
    - If `a.equals(b)` is **false**, their hash codes **may** be equal (collisions allowed).
    - `equals` must be reflexive, symmetric, transitive, and consistent; `hashCode` must be consistent during an object’s lifetime while it’s in a hash-based collection.

---

## Question
Why need to implement `hashCode()` when implementing `equals()`?

## Answer
Because hash-based collections (e.g., `HashMap`, `HashSet`) first use the **hash code** to find a bucket and then **equals** to confirm a match.  
If you override `equals` but **don’t** override `hashCode` consistently, **equal objects can produce different hash codes**, end up in different buckets, and:
- duplicates may appear in a `HashSet`,
- `contains`, `get`, `remove` may **fail** to find logically equal keys/values.

Always override both together to uphold the contract.

---

## Question
`HashMap` vs `TreeMap` vs `Hashtable`

## Answer
- **Ordering**
    - `HashMap`: no ordering guarantees (iteration order is unspecified).
    - `TreeMap`: **sorted** by natural order or provided `Comparator`.
    - `Hashtable`: no ordering (legacy).
- **Nulls**
    - `HashMap`: allows **one null key** and multiple null values.
    - `TreeMap`: **does not allow null keys** (for natural ordering); null values are allowed.
    - `Hashtable`: **no null keys or values**.
- **Complexity**
    - `HashMap`: avg **O(1)** ops; worst-case up to **O(log n)** per bucket (treeified).
    - `TreeMap`: **O(log n)** for `put/get/remove`.
    - `Hashtable`: avg **O(1)**, similar to `HashMap` but legacy.
- **Thread safety**
    - `HashMap`: not synchronized.
    - `TreeMap`: not synchronized.
    - `Hashtable`: synchronized methods (coarse-grained; generally avoid).
- **When to use**
    - `HashMap`: general-purpose lookups without ordering.
    - `TreeMap`: need **sorted keys**, range views (`subMap`, `headMap`, `tailMap`).
    - `Hashtable`: rarely; prefer `ConcurrentHashMap` or synchronization wrappers.

---

## Question
How does `ConcurrentHashMap` work?

## Answer
- **Concurrency model (Java 8+)**
    - Uses a bucket array of nodes; **reads are lock-free** (volatile reads).
    - **Writes** use CAS (compare-and-set) and, when needed, synchronize **only on a bucket** (bin) head — **no global map lock**.
    - Buckets can be **treeified** (red–black tree bins) under heavy collisions, similar to `HashMap`.
- **Resizing**
    - Performed **concurrently**: threads help move buckets to a new table using forwarding nodes to mark migrated bins.
- **Nulls**
    - Does **not** allow null keys or null values (avoids ambiguity with “absent”).
- **Iteration**
    - **Weakly consistent**: reflects some (not necessarily all) updates that occur during iteration; never throws `ConcurrentModificationException`.
- **Atomic operations**
    - Methods like `putIfAbsent`, `compute`, `merge`, `replace` provide atomic, race-safe updates.
- **Performance**
    - High read concurrency, good write scalability due to fine-grained bin-level locking and CAS.

---

## Question
HW3 Collections & Concurrency1

## Answer
This looks like an assignment title. If you’re studying for “Collections & Concurrency”, focus on:
- Picking the **right collection** for access patterns (read-heavy → `ArrayList`/`HashMap`; sorted/range queries → `TreeMap`; write-heavy concurrent reads → `ConcurrentHashMap`).
- Respecting the **`equals`/`hashCode` contract** for all map/set keys.
- Understanding **iterator characteristics**: fail-fast vs weakly consistent.
- Applying **atomic composite operations** in concurrency: prefer `compute/merge/putIfAbsent` over read-then-write patterns.
- Avoiding unsafe publication and visibility bugs: rely on **volatile**, **final**, or concurrent collections to ensure memory visibility.

---
