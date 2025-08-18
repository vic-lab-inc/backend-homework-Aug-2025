Write your tech question answers here
1. What is Maven?
   <br /> A Java-based build automation and dependency management tool that uses `pom.xml` to define project configuration.

2. What is a POM file in Maven?
   <br /> `pom.xml` (Project Object Model) defines the project’s configuration — dependencies, plugins, build settings, and metadata.

3. Difference between dependencies and dependencyManagement?
   <br /> dependencies: Directly adds dependencies to the project.
   <br /> dependencyManagement: Defines versions and scopes for dependencies so child modules can reference them without repeating details.

4. What is a transitive dependency in Maven?
   <br /> An indirect dependency automatically pulled in because another dependency needs it.

5. Difference between snapshot and release in Maven?
   <br /> Snapshot: Development version, mutable, may change over time.
   <br /> Release: Fixed, immutable version for production.

6. Commonly used Maven plugins?
   <br />`maven-compiler-plugin`, `maven-surefire-plugin`, `maven-jar-plugin`, `maven-clean-plugin`, `maven-install-plugin`.

7. What is Maven lifecycle?
   <br />A sequence of build phases that define the steps to build and deploy a project.

8. Common lifecycle phases?
   <br />`validate`, `compile`, `test`, `package`, `verify`, `install`, `deploy`.

9. Difference between mvn package and mvn install?
   <br />`mvn package`: Compiles, tests, and packages the code.
   <br />`mvn install`: Does package + installs the package into the local repository.

10. Commonly used Maven plugins?
    <br />`maven-compiler-plugin`, `maven-surefire-plugin`, `maven-jar-plugin`, `maven-clean-plugin`, `maven-install-plugin`.

Git Questions:
1. Difference between git fetch and git pull?
   <br />`git fetch`: Downloads new commits from remote but doesn’t merge.
   <br />`git pull`: Fetches + automatically merges into current branch.

2. Difference between git merge and git rebase? Pros/Cons?
   <br />`merge`: Combines branches, keeps history, may create messy merge commits.
   <br />`rebase`: Reapplies commits on top of another branch, creates linear history, can rewrite history (riskier).
3. How to resolve merge conflicts in Git?
   <br />Open conflicting files → edit to keep desired changes → mark as resolved with git add → commit. 

4. Purpose of .gitignore?
   <br />Lists files/directories Git should ignore (e.g., build files, logs, secrets). 
5. How to undo a commit already pushed?
   <br />`git revert <commit>` (creates new commit reversing changes).
   <br />A more dangerous way is: git `reset --hard <commit> + force push (git push -f) `— avoid on shared branches. 
6. Common Git commands?
   <br />`git clone`, `git status`, `git add`, `git commit`, `git push`, `git pull`, `git fetch`, `git merge`,` git rebase`, `git log`, `git branch`, `git checkout`, `git reset`.

