Write your tech question answers here

## Maven

### 1. What is Maven?
Maven is a build automation and project management tool for Java projects.  
It handles compiling, packaging, testing, and dependency management. Think of it as a smart project manager that knows how to build and organize your code.


### 2. What is a POM file in Maven?
POM (Project Object Model) is the `pom.xml` file in a Maven project.  
It defines:
- Project info (name, version, packaging type)
- Dependencies (libraries your project needs)
- Plugins (tools to run during build)
- Build configuration

Basically, it’s the blueprint of your project.


### 3. What is the difference between dependencies and dependencyManagement?
- **dependencies**: Declares the actual libraries your project needs. These get pulled in automatically.
- **dependencyManagement**: Defines the *version rules* for dependencies (like a parent POM setting rules), but does not pull them in unless explicitly listed in `dependencies`.


### 4. What is a transitive dependency in Maven?
When your dependency brings its own dependencies.  
Example: You add library A, but A depends on library B, so Maven pulls B automatically. That’s a transitive dependency.



### 5. What is the difference between a snapshot and a release in Maven?
- **Snapshot**: A development version (changes frequently, like a draft).
- **Release**: A stable, fixed version (no changes).

Snapshots are for ongoing work; releases are for production.

### 6. What are some commonly used Maven plugins?
- **maven-compiler-plugin** → compiles Java code
- **maven-surefire-plugin** → runs unit tests
- **maven-jar-plugin** → builds JAR files
- **maven-war-plugin** → builds WAR files
- **maven-deploy-plugin** → deploys artifacts to remote repo  

### 7. What is Maven lifecycle?
A lifecycle is the sequence of build steps Maven follows.  
It ensures tasks like compile → test → package → install happen in the right order.

### 8. What are some common lifecycle phases?
- **validate** → check project structure
- **compile** → compile source code
- **test** → run tests
- **package** → create JAR/WAR
- **verify** → run checks
- **install** → put package in local repo
- **deploy** → release to remote repo 

### 9. What is the difference between mvn package and mvn install?
- **mvn package** → compiles code and builds the artifact (like JAR/WAR).
- **mvn install** → does everything package does, plus puts it in your *local Maven repo* so other projects on your machine can use it.  

### 10. What are some commonly used Maven plugins?
same as Q6

----
## Git

### 1. What is the difference between git fetch and git pull?
- **git fetch** → downloads changes from remote but doesn’t merge. Safe.
- **git pull** → does fetch + merge (or rebase). Updates your local branch immediately. 

### 2. What is the difference between git merge and git rebase? Pros and Cons?
- **merge** → combines history, creates a merge commit.
    - Keeps full history intact
    - Can get messy with lots of branches  
- **rebase** → rewrites commits on top of another branch.
    -  Cleaner history
    -  Dangerous if rebasing shared branches (rewrites history)


### 3. How do you resolve merge conflicts in Git?
1. Run `git status` to see conflicts
2. Open conflicted files → fix manually (choose correct code)
3. `git add <file>` after fixing
4. `git commit` to finalize merge  

### 4. What is the purpose of .gitignore?
To tell Git which files/folders to ignore.  
Examples: logs, build artifacts, IDE files. Prevents junk files from going into the repo.

### 5. How do you undo a commit that has already been pushed?
- If others already pulled:  
  Use `git revert <commit>` (creates a new commit that cancels it). Safe.
- If only you:  
  Use `git reset --hard <commit>` then `git push --force` (dangerous, rewrites history).  

### 6. Can you give me some common git commands?
- `git init` → start a repo
- `git clone <url>` → copy a repo
- `git status` → check status
- `git add <file>` → stage changes
- `git commit -m "msg"` → save changes
- `git push` → send to remote
- `git pull` → fetch + merge remote changes
- `git branch` → list branches
- `git checkout <branch>` → switch branch
- `git merge <branch>` → merge a branch
- `git log --oneline --graph` → view history