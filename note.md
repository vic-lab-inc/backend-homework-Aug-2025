# Maven and Git Notes

## Maven

1.  **What is Maven?**\
    Maven is a build automation and project management tool primarily
    used for Java projects. It simplifies project setup, builds,
    dependency management, and reporting.

2.  **What is a POM file in Maven?**\
    A POM (Project Object Model) file is an XML file (`pom.xml`) that
    contains information about the project and configuration details
    used by Maven to build the project. It defines dependencies,
    plugins, goals, build profiles, etc.

3.  **What is the difference between dependencies and
    dependencyManagement?**

    -   `dependencies`: Lists actual dependencies for the current
        project. They are automatically included in the build.
    -   `dependencyManagement`: Provides a central place to define
        versions and configuration for dependencies. Submodules can
        reference them without explicitly stating versions.

4.  **What is a transitive dependency in Maven?**\
    Transitive dependencies are dependencies that your direct
    dependencies rely on. Maven automatically includes these so you
    don't need to explicitly declare them.

5.  **What is the difference between a snapshot and a release in
    Maven?**

    -   **Snapshot**: A development version that is still under active
        changes (e.g., `1.0-SNAPSHOT`). Maven updates snapshots
        frequently.
    -   **Release**: A stable, immutable version intended for production
        (e.g., `1.0.0`).

6.  **What are some commonly used Maven plugins?**

    -   `maven-compiler-plugin` -- compiles Java code
    -   `maven-surefire-plugin` -- runs unit tests
    -   `maven-failsafe-plugin` -- runs integration tests
    -   `maven-jar-plugin` -- builds JAR files
    -   `maven-war-plugin` -- builds WAR files
    -   `exec-maven-plugin` -- runs Java classes

7.  **What is Maven lifecycle?**\
    Maven lifecycle is a sequence of build phases that define the order
    of execution for tasks such as compiling, testing, packaging, and
    deployment.

8.  **What are some common lifecycle phases?**

    -   `validate` -- validate project structure
    -   `compile` -- compile source code
    -   `test` -- run tests
    -   `package` -- package compiled code (JAR/WAR)
    -   `verify` -- run checks
    -   `install` -- install artifact into local repository
    -   `deploy` -- deploy artifact to remote repository

9.  **What is the difference between mvn package and mvn install?**

    -   `mvn package`: Compiles the code and packages it into a
        distributable format (like JAR/WAR) in the `target/` directory.
    -   `mvn install`: Does everything `package` does, and also installs
        the artifact into the local Maven repository
        (`~/.m2/repository`) so other local projects can use it.

------------------------------------------------------------------------

## Git

1.  **What is the difference between git fetch and git pull?**

    -   `git fetch`: Downloads changes from the remote repository but
        does not merge them into your local branch.
    -   `git pull`: Fetches changes from the remote and immediately
        merges them into your current branch.

2.  **What is the difference between git merge and git rebase? Pro and
    Cons?**

    -   **Merge**: Combines two branches, preserving history with a
        merge commit.
        -   Pros: Keeps full history, simple to understand.
        -   Cons: History can become cluttered with many merge commits.
    -   **Rebase**: Moves or "replays" commits onto another branch,
        creating a linear history.
        -   Pros: Cleaner, linear history.
        -   Cons: Can rewrite history, more dangerous if not used
            carefully (especially on shared branches).

3.  **How do you resolve merge conflicts in Git?**

    -   Identify conflicted files (`git status`).
    -   Manually edit the files to resolve conflicts.
    -   Mark as resolved (`git add <file>`).
    -   Commit the resolution (`git commit`).

4.  **What is the purpose of .gitignore?**\
    `.gitignore` specifies files and directories that Git should ignore.
    Common examples include build artifacts, IDE configs, logs, and
    environment-specific files.

5.  **How do you undo a commit that has already been pushed?**

    -   Use `git revert <commit-hash>` to create a new commit that
        undoes the changes. (Safe for shared repos.)
    -   Use `git reset --hard <commit-hash>` to move branch pointer (not
        safe if already pushed). Must use `git push --force`.

6.  **Can you give me some common git commands?**

    -   `git init` -- initialize a repo
    -   `git clone <url>` -- clone repo
    -   `git status` -- show working tree status
    -   `git add <file>` -- stage changes
    -   `git commit -m "msg"` -- commit changes
    -   `git log` -- view commit history
    -   `git branch` -- list branches
    -   `git checkout <branch>` -- switch branch
    -   `git merge <branch>` -- merge branch
    -   `git rebase <branch>` -- rebase commits
    -   `git push` -- push changes to remote
    -   `git pull` -- fetch + merge remote changes
