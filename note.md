hw1
1. What is Maven?
Maven is a build automation and project management tool for Java projects. It uses a Project Object Model (POM) file (pom.xml) to manage project dependencies, build configuration, plugins, and reporting. Its main goals are:
•	Dependency management
•	Standardized project structure
•	Automated builds (compile, test, package, deploy)
________________________________________
2. What is a POM file in Maven?
POM stands for Project Object Model. It is an XML file (pom.xml) that contains project information and configuration details such as:
•	Project coordinates (groupId, artifactId, version)
•	Dependencies
•	Plugins and build settings
•	Profiles
•	Parent project references
It acts as the blueprint of a Maven project.
________________________________________
3. What is the difference between dependencies and dependencyManagement?
•	dependencies: Declares the libraries that the project directly needs. Maven will download and include them.
•	dependencyManagement: Defines versions and scopes of dependencies in a parent POM. Submodules can declare the dependency without specifying version, and they will inherit it.
Think of dependencies as actual usage and dependencyManagement as a catalog of rules.
________________________________________
4. What is a transitive dependency in Maven?
If your project depends on Library A, and Library A depends on Library B, then Library B is a transitive dependency.
Maven automatically resolves transitive dependencies, so you don’t have to explicitly declare them unless you want to override the version.
________________________________________
5. What is the difference between a snapshot and a release in Maven?
•	Release: A fixed, stable version (e.g., 1.0.0) — immutable once deployed.
•	Snapshot: A development version (e.g., 1.0.0-SNAPSHOT) — can change over time. Maven checks the remote repository for updates to snapshots more often.
________________________________________
6. What are some commonly used Maven plugins?
•	maven-compiler-plugin → compiles Java source code
•	maven-surefire-plugin → runs unit tests
•	maven-jar-plugin → builds JAR files
•	maven-war-plugin → builds WAR files for web apps
•	maven-dependency-plugin → analyzes/copies dependencies
•	maven-site-plugin → generates project documentation
________________________________________
7. What is Maven lifecycle?
The Maven build lifecycle is a sequence of steps/phases that define how a project is built and deployed. Maven has three built-in lifecycles:
1.	default → handles build and deployment
2.	clean → removes old build output
3.	site → generates project documentation
________________________________________
8. What are some common lifecycle phases?
Some important phases in the default lifecycle are:
•	validate → validate project structure
•	compile → compile source code
•	test → run unit tests
•	package → package code into JAR/WAR
•	verify → run integration tests
•	install → copy package into local Maven repo (~/.m2/repository)
•	deploy → copy package to remote repo
________________________________________
9. What is the difference between mvn package and mvn install?
•	mvn package → compiles, tests, and packages the project into a JAR/WAR file (but does NOT make it available to other projects).
•	mvn install → does everything in package and also installs the artifact into your local repository, so other projects on your machine can use it as a dependency.
________________________________________
10. What are some commonly used Maven plugins?
(This looks like a repeat of Q6, so I'll add a few extra beyond the basics):
•	maven-assembly-plugin → builds “fat JARs” with dependencies included
•	maven-failsafe-plugin → runs integration tests (complements Surefire)
•	maven-resources-plugin → copies and filters resource files
•	maven-checkstyle-plugin → enforces coding style rules
•	maven-pmd-plugin → static code analysis

1. What is the difference between git fetch and git pull?
•	git fetch: Downloads changes from the remote repository, but does not update your working branch. It just updates your remote-tracking branches (origin/main, etc.).
•	git pull: Does git fetch + merge (or rebase, if configured) into your current branch.
Use fetch when you want to see what changed first; use pull when you want to update your branch immediately.
________________________________________
2. What is the difference between git merge and git rebase?
•	Merge: Combines two branches, keeping the history of both.
•	git checkout main
•	git merge feature
Creates a merge commit. History is non-linear but preserves context.
•	Rebase: Moves commits from one branch on top of another branch.
•	git checkout feature
•	git rebase main
Rewrites history to be linear, as if the feature branch started from the tip of main.
Pros of Merge:
•	History preserved (good for auditing).
•	Safer (doesn’t rewrite history).
Cons of Merge:
•	History can get messy with many merge commits.
Pros of Rebase:
•	Cleaner, linear history.
•	Easier to follow git log.
Cons of Rebase:
•	Rewrites commit history (dangerous if branch already pushed/shared).
•	Risky for team workflows if misused.
________________________________________
3. How do you resolve merge conflicts in Git?
Steps:
1.	Run merge/rebase → conflict happens.
2.	Git marks conflict areas in files:
3.	<<<<<<< HEAD
4.	Your changes
5.	=======
6.	Incoming changes
7.	>>>>>>> branch-name
8.	Open the file(s), decide which version (or both) to keep, then remove conflict markers.
9.	Mark resolved:
10.	git add <file>
11.	git commit   # (if merge)
12.	git rebase --continue   # (if rebase)
________________________________________
4. What is the purpose of .gitignore?
The .gitignore file tells Git which files or directories to ignore when tracking changes. Common examples:
•	Build artifacts (/target, /dist)
•	IDE settings (.idea/, *.iml, .vscode/)
•	Logs (*.log)
•	Secrets (.env)
________________________________________
5. How do you undo a commit that has already been pushed?
Several ways depending on intent:
•	Revert (safe, keeps history):
•	git revert <commit-hash>
•	git push
Creates a new commit that undoes the changes.
•	Reset (dangerous, rewrites history):
•	git reset --hard <commit-hash-before>
•	git push --force
Removes commits entirely. Only use if you are sure no one else has pulled the bad commit.
________________________________________
6. Can you give me some common git commands?
•	Repo setup
•	git init                 # initialize new repo
•	git clone <url>          # clone repo
•	Staging & committing
•	git status               # show changes
•	git add <file>           # stage file
•	git commit -m "msg"      # commit staged files
•	Branching
•	git branch               # list branches
•	git branch feature       # create new branch
•	git checkout feature     # switch branch
•	git switch feature       # alternative to checkout
•	git merge feature        # merge branch into current
•	git rebase main          # rebase branch
•	Remote
•	git fetch                # fetch from remote
•	git pull                 # fetch + merge
•	git push                 # push commits
•	git remote -v            # list remotes
•	Undo / fix
•	git log --oneline        # compact commit history
•	git diff                 # show unstaged changes
•	git reset HEAD~1         # uncommit last commit
•	git revert <hash>        # undo commit safely
•	git stash                # save uncommitted changes
•	git stash pop            # reapply stashed changes





hw2
1. Primitive data types in Java
Java has 8 primitive data types (stored directly in memory, not as objects):
•	byte (8-bit)
•	short (16-bit)
•	int (32-bit)
•	long (64-bit)
•	float (32-bit decimal)
•	double (64-bit decimal)
•	char (16-bit Unicode character)
•	boolean (true/false)
________________________________________
2. Difference between == and equals()
•	== → Compares references (memory addresses) for objects, values for primitives.
•	equals() → Compares content/data of objects (unless overridden).
Example:
String s1 = new String("Java");
String s2 = new String("Java");

System.out.println(s1 == s2);      // false (different objects)
System.out.println(s1.equals(s2)); // true  (same content)
________________________________________
3. String Pool
•	A special memory area in the heap where Java stores string literals for reuse.
•	Example:
String s1 = "Hello";
String s2 = "Hello"; // points to same object in String Pool
________________________________________
4. Final, Finally, Finalize
•	final → Keyword used for constants, methods (cannot override), and classes (cannot extend).
•	finally → Block used in exception handling, always executes (used to close resources).
•	finalize() → Method called by Garbage Collector before destroying an object (not reliable, rarely used).
________________________________________
5. Static
•	Belongs to the class, not instance.
•	Shared across all objects.
•	Can apply to variables, methods, blocks, and nested classes.
•	Example: static int count;
________________________________________
6. OOP (4 Principles)
1.	Encapsulation → Wrapping data + methods together, using access modifiers.
2.	Abstraction → Hiding implementation details, exposing only functionality (via abstract classes, interfaces).
3.	Inheritance → Child class inherits properties/methods from parent class.
4.	Polymorphism → One action, different implementations (method overloading & overriding).
________________________________________
7. Polymorphism
•	Compile-time (Overloading): Multiple methods with same name, different parameters.
•	Runtime (Overriding): Subclass provides specific implementation of parent’s method.
________________________________________
8. Method Overriding vs Overloading
•	Overloading: Same method name, different parameter list (compile-time).
•	Overriding: Same method signature in subclass, runtime binding.
________________________________________
9. Abstract Class vs Interface
•	Abstract Class:
o	Can have abstract & non-abstract methods.
o	Supports variables, constructors, and access modifiers.
o	Single inheritance.
•	Interface:
o	Only abstract methods (till Java 7), default & static methods (Java 8+).
o	Only public, static, final variables.
o	Multiple inheritance possible.
________________________________________
10. Exception vs Error
•	Exception: Recoverable, occurs due to program logic (e.g., NullPointerException).
•	Error: Unrecoverable, system-level (e.g., OutOfMemoryError).
________________________________________
11. Difference between throw and throws
•	throw → Used to throw an exception inside a method.
•	throws → Declares exceptions a method might throw.
________________________________________
12. StringBuilder vs StringBuffer
•	Both are mutable strings.
•	StringBuffer: Thread-safe (synchronized), slower.
•	StringBuilder: Not synchronized, faster, preferred in single-threaded use.
________________________________________
13. Access Modifiers in Java
1.	public → Accessible everywhere.
2.	protected → Accessible within package & subclasses.
3.	default (package-private) → Accessible within same package only.
4.	private → Accessible only within the same class.

