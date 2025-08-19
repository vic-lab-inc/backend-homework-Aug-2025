Submit your hw1 in this folder
```
1. What is Maven?
Maven is a build automation and project management tool used primarily for Java projects.

2. What is a POM file in Maven?
It’s the core configuration file that tells Maven how to build your project — 
such as what dependencies to download, what plugins to use, and how to compile, test, and package your application. 

3. What is the difference between dependencies and dependencyManagement?
dependencies = What you use. download
dependencyManagement = How they should be used. parent DOM to set up version, scope.

4. What is a transitive dependency in Maven?
They are not declared in your pom.xml directly, but are pulled in by the libraries you do declare.

5. What is the difference between a snapshot and a release in Maven?
A snapshot is a changing development version (-SNAPSHOT), while a release is a fixed, stable version that never changes.

6. What are some commonly used Maven plugins?
maven-compiler-plugin, maven-surefire-plugin, maven-jar-plugin, maven-install-plugin, maven-deploy-plugin.

7. What is Maven lifecycle?
sequence of predefined phases to build java projects
clean → validate → compile → test → package → verify → install → site → deploy

8. What are some common lifecycle phases?
clean, compile, test, package, install, and deploy

9. What is the difference between mvn package and mvn install?
install will add the built artifact to your local Maven repository, 
while package just creates the artifact in the target directory.




1. What is the difference between git fetch and git pull?
fetch - download changes
pull - fetch + merge current branch

2. What is the difference between git merge and git rebase? Pro and Cons?
Merge → combines histories with a merge commit.
✅ Preserves full history, safer.
❌ Creates extra merge commits, history can look messy.

Rebase → rewrites commits on top of another branch.
✅ Creates a clean, linear history.
❌ Rewrites history (dangerous if used on shared branches).

3. How do you resolve merge conflicts in Git?
edit → add → commit.

4. What is the purpose of .gitignore?
tells Git which to ignore and not track

5. How do you undo a commit that has already been pushed?
revert = safe, reset = risky.

6. Can you give me some common git commands?
init → clone → add → commit → push/pull
branch, checkout, merge, rebase, status