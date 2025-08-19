## Maven

1. What is Maven?
    1. Maven is a build automation and project management tool for Java. It helps you manage dependencies, build your code, run tests, and package the project in a consistent way.
    2. Maven is a popular build and project management tool mainly used in Java projects. It automates the whole build lifecycle—compiling code, running tests, packaging into JAR/WAR files, and even deploying. One of its biggest strengths is **dependency management**: you just declare dependencies in the `pom.xml`, and Maven automatically downloads them from central repositories. It also enforces a standard project structure, which makes projects easier to maintain and share across teams.
2. What is a POM file in Maven?
    1. A POM file (`pom.xml`) is the core configuration file in Maven. It defines the project details, dependencies, plugins, and build settings.
    2. The POM file, which stands for *Project Object Model*, is basically the heart of a Maven project. It’s the `pom.xml` file in the root of your project. Inside it, you define the project’s metadata (like groupId, artifactId, version), dependencies your project needs, plugins to use, and build configurations. Maven then reads this file to know how to build, test, package, and manage your project. For example, if I need JUnit, I just add it as a dependency in the POM, and Maven automatically downloads it from the repository.
3. What is the difference between dependencies and dependencyManagement?
    1. `dependencies` actually brings libraries into your project, while `dependencyManagement` just defines versions and settings for dependencies, usually in a parent POM.
    2. In Maven, the `dependencies` section lists the libraries your project will directly use. For example, if you add JUnit in `dependencies`, Maven downloads it and makes it available in your build.

       `dependencyManagement`, on the other hand, is more like a **central place to define dependency versions and scopes**, usually in a parent POM in multi-module projects. It doesn’t bring in a dependency by itself. Instead, it acts as a reference: child projects just declare the dependency name, and Maven will apply the version and scope from the parent’s `dependencyManagement`.

       **Example:**

        - If I put JUnit in `dependencies`, my project will actually get JUnit.
        - If I only put it in `dependencyManagement`, my project won’t get JUnit unless I explicitly add it under `dependencies` in the child module.

       So basically: `dependencies` = “include it now,” `dependencyManagement` = “define how to include it when needed.”

4. What is a transitive dependency in Maven?
    1. A transitive dependency is an indirect dependency that your project gets because one of your direct dependencies needs it. For example, if you add Spring, and Spring needs Jackson, Maven will pull Jackson in automatically.
    2. In Maven, dependencies can bring along their own dependencies. These are called **transitive dependencies**. You don’t declare them directly in your `pom.xml`, but Maven includes them automatically so everything compiles and runs.

       For example, let’s say I add **Spring Boot** as a dependency. Spring Boot itself depends on **Jackson** and **Logback**. I didn’t write those in my POM, but Maven will still download them because they’re required.

       This makes life easier since you don’t have to list every single library manually, but it can also cause version conflicts (called “dependency hell”). That’s why Maven has features like **dependency management** and the `dependency:tree` command to help you control versions when conflicts happen.

5. What is the difference between a snapshot and a release in Maven?
    1. In Maven, a snapshot like `1.0-SNAPSHOT` is basically a development version that can still change, while a release like `1.0` is a stable, final version that never changes once it’s published.
    2. A snapshot in Maven, for example `1.0-SNAPSHOT`, means the project is still in development. Maven treats it as something dynamic, so every time you build, it might pull a newer version from the repository. A release, like `1.0`, is different—it’s a finalized, stable version that doesn’t change once it’s published. So in short, snapshots are for ongoing work, and releases are for production.

6. What are some commonly used Maven plugins?
    1. Some commonly used Maven plugins are the **Compiler plugin** for compiling source code, the **Surefire plugin** for running unit tests, and the **Clean plugin** for cleaning the target directory.
    2. There are quite a few Maven plugins that people use all the time. For example, the **Maven Compiler plugin** is used to compile your Java source code. The **Surefire plugin** is very common for running unit tests, and the **Failsafe plugin** is often used for integration tests. The **Clean plugin** helps clean up the target directory before a new build, and the **Install plugin** installs the build artifact into the local repository. These are the ones you’ll see in almost every project.
7. What is Maven lifecycle?
    1. The Maven lifecycle is basically the sequence of steps Maven goes through to build and manage a project, like **clean**, **compile**, **test**, **package**, **install**, and **deploy**.
    2. The Maven lifecycle defines the standard phases Maven runs through in order to build and manage a project. Each phase has a specific purpose, and they run in sequence.

       For example:

        - **clean** → removes previous build outputs (`target/` folder).
        - **compile** → compiles the source code.
        - **test** → runs unit tests.
        - **package** → packages the code into a JAR or WAR.
        - **install** → puts the artifact into the local repository so other projects can use it.
        - **deploy** → pushes the artifact to a remote repository for sharing.

       The nice part is you don’t have to run all phases manually. If you run `mvn install`, Maven will automatically go through **compile → test → package → install** in order.

8. What are some common lifecycle phases?
    1. Some common Maven lifecycle phases are: **validate**, **compile**, **test**, **package**, **install**, and **deploy**.
    2. Maven has a lot of lifecycle phases, but the ones we use most often are:
        - **validate** → check the project structure and make sure everything is correct before building.
        - **compile** → compile the source code.
        - **test** → run the unit tests.
        - **package** → bundle the code into a JAR or WAR file.
        - **install** → install the artifact into your local Maven repo (`~/.m2/repository`).
        - **deploy** → copy the artifact to a remote repo so others can use it.

       The nice thing is Maven runs them in order. For example, if I type `mvn install`, it will automatically do **validate → compile → test → package → install** in sequence.

9. What is the difference between mvn package and mvn install?
    1. `mvn package` just builds your project and creates the artifact, like a JAR or WAR, while `mvn install` does that **and** also puts the artifact into your local Maven repository so other projects on your machine can use it.
    2. When you run `mvn package`, Maven compiles the code, runs the tests, and then packages the project into an artifact such as a JAR or WAR file inside the `target` folder. On the other hand, `mvn install` goes one step further—it not only builds the artifact, but also installs it into your **local Maven repository** (usually `~/.m2/repository`). That way, other projects on your machine can reference it as a dependency. So basically, `package` is about creating the file, and `install` is about making it available locally for reuse.

## Git

1. What is the difference between git fetch and git pull?
    1. git fetch just downloads the latest changes from the remote, but it doesn’t update your working branch. git pull does a fetch and automatically merges those changes into your current branch.
    2. The difference is that git fetch only brings down the latest commits and branches from the remote to your local repo, but it leaves your working branch as-is. It’s kind of like “checking what’s new” without touching your code. git pull, on the other hand, is basically git fetch plus git merge—it fetches the changes and then immediately tries to merge them into your current branch. So if you just want to see what’s new, you fetch; if you want your branch updated with remote changes, you pull.
2. What is the difference between git merge and git rebase? Pro and Cons?
    1. Merge combines another branch into yours with a merge commit, keeping the original history.
       Rebase rewrites your commits on top of another branch, creating a clean, linear history.
       Pros/Cons: Merge = preserves context, safer for shared branches, but history gets “branchy.” Rebase = cleaner history, easier bisects, but rewrites history (dangerous on shared branches).
    2. What they do
       git merge: Brings changes from feature into main and creates a merge commit. It preserves the exact history and branching structure.
       **Example:**
       git checkout main
       git merge feature
       git rebase: “Lifts” your feature commits and replays them on top of another branch (e.g., main), rewriting commit SHAs for a straight line.
       **Example:**
       git checkout feature
       git rebase main
   # then fast-forward main
   git checkout main
   git merge --ff-only feature
   **Pros**
   Merge
   Preserves true history and context of how work happened.
   Safer on shared branches (no rewritten history).
   Better when multiple teams collaborate and you need auditability.
   Rebase
   Produces a linear, clean history; git log and git blame are tidier.
   Easier to follow and often simpler to revert a single feature line.
   Reduces “merge commit noise”; good before opening a PR (local cleanup).
   **Cons**
   Merge
   History can get cluttered with many merge commits.
   Harder to trace a single feature’s commits when the graph gets busy.
   Rebase
   Rewrites history (new SHAs). If you rebase commits that others pulled, you’ll cause conflicts for your teammates.
   Requires more discipline; mistakes during interactive rebase can drop or reorder commits unintentionally.
   When to use which (practical)
   Use rebase to update your feature branch with the latest main before opening a PR (local only): git fetch; git rebase origin/main.
   Use merge to integrate a feature into a shared branch (e.g., merging PRs into main) so you don’t rewrite public history.
   Team rule of thumb: “Rebase locally; merge publicly.”
   Safety tips
   Never rebase public/shared branches.
   After a rebase, you’ll need git push --force-with-lease (safer than --force).
   If a rebase gets messy: git rebase --abort and fall back to a merge.
3. How do you resolve merge conflicts in Git?
    1. When a merge conflict happens, I open the file, look for the conflict markers, decide which changes to keep, edit it, then mark it as resolved with git add and finish the merge with git commit.
    2. A merge conflict happens when Git can’t automatically decide which version of code to keep. To resolve it, I first run git status to see which files are in conflict. Then I open those files — Git marks the conflicts with <<<<<<<, =======, and >>>>>>>. I manually edit the file to choose or combine the changes that make sense. Once I’m done, I run git add <file> to mark the conflict as resolved. Finally, I either complete the merge with git commit, or if I was rebasing, I use git rebase --continue.

   In practice, I often use IDE tools or Git GUIs to make it easier, but the idea is the same: decide on the correct code, mark it resolved, and commit.
4. What is the purpose of .gitignore?
    1. The .gitignore file tells Git which files or folders it should ignore, so things like build outputs, logs, or local configs don’t get committed to the repo.
    2. The purpose of .gitignore is to make sure unnecessary or sensitive files don’t get tracked by Git. For example, you usually don’t want to commit target/ build folders, .log files, or IDE settings like .idea/ or .vscode/. By listing them in .gitignore, Git won’t include them in commits. This keeps the repo clean, avoids pushing machine-specific files, and reduces merge conflicts. It’s especially important in team projects so everyone’s repo stays consistent.
5. How do you undo a commit that has already been pushed?
    1. If I need to undo a pushed commit, the safest way is git revert, which creates a new commit that reverses the changes. If I really need to remove it from history, I can use git reset and then force-push, but that’s risky on shared branches.
    2. There are two main approaches:

   git revert (safe way): This makes a new commit that undoes the changes from the bad commit, so the history stays intact. For example:

   git revert <commit-hash>
   git push origin main

   This is the preferred approach when the commit is already public or shared, since it won’t mess up other people’s history.

   git reset + force push (risky way): You can reset the branch to a previous commit with

   git reset --hard <commit-hash>
   git push origin main --force

   This rewrites history, which can break things if teammates have already pulled the bad commit. It’s only safe if you’re sure no one else is working on that branch.

   In practice: For team/shared branches, I’d use revert. For my own feature branch that nobody else uses, I might use reset.
6. Can you give me some common git commands?
    1. Some common Git commands are:
        1. git clone to copy a repo,
        2. git status to check changes,
        3. git add and git commit to stage and save changes,
        4. git push and git pull to sync with remote,
        5. git branch and git checkout (or git switch) to work with branches.
    2. There are a lot of Git commands I use every day. For example:

   **Repository setup & info**

   git clone <url> → clone a repository

   git status → see what’s changed

   git log → view commit history

   **Working with changes**

   git add <file> → stage changes

   git commit -m "message" → commit them

   git diff → compare what changed

   **Syncing with remote**

   git fetch → check remote updates without merging

   git pull → fetch + merge into current branch

   git push → push local commits to remote

   **Branching & merging**

   git branch → list/create branches

   git checkout or git switch → move between branches

   git merge → merge another branch into the current one

   git rebase → replay commits on top of another branch

   **Fixing mistakes**

   git reset → undo staged changes or reset history

   git revert → safely undo a commit by creating a new one

   git stash → save work temporarily without committing

   These cover most of the real-world daily workflow.