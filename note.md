Write your tech question answers here

# maven
1. What is Maven?

   Maven is a **build automation and project management tool** for Java (and JVM languages).
   It helps developers **compile, package, test, and manage dependencies** easily.

2. What is a POM file in Maven?

   POM stands for **Project Object Model**.
   It’s an **XML file named** pom.xml at the root of every Maven project.

3. What is the difference between dependencies and dependencyManagement?

   **dependencies:**

        * Declares the actual libraries a project needs.

        * Maven will download them and put them in the project’s classpath.

        * Must specify groupId, artifactId, version (unless managed by parent).

   **dependencyManagement:**

        * Works like a central place to define versions of dependencies.

        * Usually placed in a parent POM.

        * Does NOT pull in the dependency automatically — it only tells Maven “if a child module declares this dependency, use this version.”
4. What is a transitive dependency in Maven?

   A **transitive dependency** in Maven is a **dependency of your dependency**.

        You don’t declare it directly in your pom.xml.

        Maven automatically downloads it for you so your project can compile and run.
   Suppose your project depends on **Library A**, and Library A itself depends on **Library B**.

        Library B is a transitive dependency.

        Maven will download both A and B even if you only declared A.
5. What is the difference between a snapshot and a release in Maven?

   Maven distinguishes between development versions and stable/released versions using the concepts of snapshot and release.

        Snapshots = mutable, in-progress versions (-SNAPSHOT)

        Releases = immutable, stable versions (1.0.0)

6. What are some commonly used Maven plugins?

        Some of the most common Maven plugins are:

        Compiler → compile code

        Surefire → run tests

        Jar → package project

        Install / Deploy → local/remote repository

        Exec → run Java classes

        Clean → remove old builds

        Shade → create fat JARs

        Dependency → analyze dependencies
7. What is Maven lifecycle?

        Maven lifecycle = sequence of phases that define how a project is built.

        Three main lifecycles: default, clean, site

        Running a phase automatically executes all previous phases in that lifecycle.

        Plugins (compiler, surefire, jar, etc.) are bound to these phases.

8. What are some common lifecycle phases?

   The most commonly used lifecycle phases are:

        clean → remove old builds

        compile → compile code

        test-compile → compile tests

        test → run tests

        package → create JAR/WAR

        install → install locally

        deploy → upload remotely

9. What is the difference between mvn package and mvn install?

   mvn package → create artifact locally.

   mvn install → create artifact + install it in local repo for other projects.

10. What are some commonly used Maven plugins?

    Some of the most common Maven plugins are:

        Compiler → compile code

        Surefire → run tests

        Jar → package project

        Install / Deploy → local/remote repository

        Exec → run Java classes

        Clean → remove old builds

        Shade → create fat JARs

        Dependency → analyze dependencies
# git

1. What is the difference between git fetch and git pull?

   fetch = update remote-tracking info, no changes to local work.

   pull = **fetch + merge**, updates your current branch.

   Good practice: git fetch + inspect + merge manually to avoid surprises, especially on shared branches.

2. What is the difference between git merge and git rebase? Pro and Cons?

   Merge: combines branches, adds a merge commit, keeps full history.

   Rebase: moves commits onto another branch, rewrites history, makes linear history.

   ✅ Pros of Merge

        Preserves full history; you can see when and where branches were merged.

        Simple, safe, no rewriting of commits.

   ⚠️ Cons of Merge

        Produces extra merge commits, which can clutter history.

        History can look less linear.

   ✅ Pros of Rebase

        Produces a clean, linear history (easy to read).

        Avoids unnecessary merge commits.

        Great for preparing pull requests.

   ⚠️ Cons of Rebase

        Rewrites commit history, so you must never rebase shared branches.

        If conflicts occur, you must resolve them commit by commit.

3. How do you resolve merge conflicts in Git?

   🔹 What is a Merge Conflict?

        Merge conflict happens when Git cannot automatically merge changes because two branches have modified the same part of a file differently.

   Summary:
   Merge branches (git merge feature)

        Identify conflicts (git status)

        Open conflicted files, resolve manually

        Stage the resolved files (git add <file>)

        Complete merge (git commit)
4. What is the purpose of .gitignore?

   Purpose of .gitignore:

        `.gitignore` tells Git to ignore files and directories that shouldn’t be committed, such as build artifacts, IDE files, OS files, or secrets.
5. How do you undo a commit that has already been pushed?

   Use git revert for any commit that has already been pushed.

   Only use force push on private or feature branches where you’re the only contributor.

6. Can you give me some common git commands?

   status, add, commit, log, branch, checkout, merge are the core workflow commands.

   fetch, pull, push handle remote updates.

   reset, revert, stash help fix mistakes.