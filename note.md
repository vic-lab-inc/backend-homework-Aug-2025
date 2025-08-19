Write your tech question answers here
1. What is Maven?
   <br /> Maven is a Java-based build automation and project management tool. It manages project dependencies, builds, and deployments using a standard lifecycle and a configuration file (`pom.xml`). It also enforces a standard project structure.

2. What is a POM file in Maven?
   <br /> `pom.xml` (Project Object Model) is the main configuration file for a Maven project. It defines project metadata (like name, version), dependencies, plugins, build instructions, and repository information.

3. Difference between dependencies and dependencyManagement?
   <br /> dependencies: Directly adds dependencies to the project.
   <br /> dependencyManagement: Defines versions and configurations for dependencies, but does not add them directly. It allows child projects to inherit these settings without needing to specify versions again.

5. What is a transitive dependency in Maven?
   <br /> A transitive dependency is a dependency pulled in automatically because one of your direct dependencies relies on it. Maven resolves these automatically to avoid manual downloads.

5. Difference between snapshot and release in Maven?
   <br /> Snapshot: A development version that can change over time. Used for ongoing development.
   <br /> Release: A stable, immutable version that should not change. Typically used in production.

6. Commonly used Maven plugins?
   <br />`maven-compiler-plugin`, `maven-surefire-plugin`, `maven-jar-plugin`, `maven-clean-plugin`, `maven-install-plugin`,`maven-deploy-plugin`.

7. What is Maven lifecycle?
   <br />Maven lifecycle is a sequence of build phases that defines the steps to build, test, package, and deploy a project. Each phase triggers the next in a standard order.

8. Common lifecycle phases?
   <br />`validate` → validate the project is correct and all necessary information is available,
   <br />`compile` → compiles source code,
   <br />`test` → runs unit tests,
   <br />`package` → bundles code (jar/war),
   <br />`verify` → runs integration tests,
   <br />`install` → install the package into the local repository,
   <br />`deploy` → done in the build environment, copies the final package to the remote repository.

9. Difference between mvn package and mvn install?
   <br />`mvn package`: Compiles, tests, and packages the code into jar/war but doesn’t install it locally.
   <br />`mvn install`: Does everything `package` does plus installs the artifact into your local Maven repository for use in other projects.

10. Commonly used Maven plugins?
    <br />`maven-compiler-plugin`, `maven-surefire-plugin`, `maven-jar-plugin`, `maven-clean-plugin`, `maven-install-plugin`, `maven-deploy-plugin`.

Git Questions:
1. Difference between git fetch and git pull?
   <br />`git fetch`: Downloads commits, branches, and tags from the remote into your local repo, but doesn’t change your working branch. Safe for review before merging.
   <br />`git pull`: Does a `fetch` and immediately merges (or rebases) those changes into your current branch.

2. Difference between git merge and git rebase? Pros/Cons?
   <br />`merge`: Combines two branches by creating a new merge commit.
   <br />Pros: Keeps full history of branch merges, preserves context.
   <br />Cons: Can create a messy history with multiple merge commits.

   <br />`rebase`: Moves your branch commits on top of another branch, creating a linear history.
   <br />Pros: Cleaner history, easier to follow.
   <br />Cons: Can lose context of branch merges, riskier if not careful with shared branches.

3. How to resolve merge conflicts in Git?
   <br />To resolve merge conflicts in Git, we can manually edit the files to keep the correct changes, then run `git add <file>` to mark them resolved.
   <br />After fixing all conflicts, finish with `git commit` (or `git merge --continue` if rebasing).

4. Purpose of .gitignore?
   <br />A file that tells Git which files or directories to ignore in version control. Common examples: build artifacts (target/, bin/), log files, .env configs, and OS files like .DS_Store.
5. How to undo a commit already pushed?
   <br />`git revert <commit>` creates a new commit that undoes the changes (safe for shared branches).
   <br />A more dangerous way is: git `reset --hard <commit> + force push (git push -f) `rewrites history (should only be used on private branches). 
6. Common Git commands?
   <br />`git clone`, `git status`, `git add`, `git commit`, `git push`, `git pull`, `git fetch`, `git merge`,` git rebase`, `git log`, `git branch`, `git checkout`, `git reset`.

