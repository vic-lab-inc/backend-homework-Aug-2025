1. What is Maven?
Maven is a build automation and project management tool used primarily for Java projects.

2. What is a POM file in Maven?
The pom.xml file in a Maven project stands for Project Object Model. It’s the core configuration file that tells Maven how to build your project — including what dependencies to download, what plugins to use, and how to compile, test, and package your application. 

3. What is the difference between dependencies and dependencyManagement?
A POM can declare other artifacts as dependencies, which Maven resolves from local or remote repositories.
<dependencyManagement> is a special section in the Maven pom.xml used to control and centralize dependency versions and scopes without actually including them in the build. You declare dependency versions and scopes once in the parent POM under <dependencyManagement>. Dependencies in <dependencyManagement> are not added automatically.

4. What is a transitive dependency in Maven?
In Maven, a transitive dependency is a dependency that your project does not declare directly, but is pulled in automatically because it is required by another dependency.

5. What is the difference between a snapshot and a release in Maven?
snapshot: Version in development
release: Final, stable version, No -SNAPSHOT suffix

6. What are some commonly used Maven plugins?
Lifecycle Phase	Plugin
compile	  maven-compiler-plugin
test	  maven-surefire-plugin
package	  maven-jar-plugin
install	  maven-install-plugin
deploy	  maven-deploy-plugin

7. What is Maven lifecycle?
The Maven life cycle is a set of well-defined phases that manage the build process of a project

8. What are some common lifecycle phases?
validate, compile, test, package, verify, install, deploy

9. What is the difference between mvn package and mvn install?
**Use mvn package** when you’re just building and testing your project.
**Use mvn install** when you want to **use this project as a dependency** in another local project.



1. What is the difference between git fetch and git pull?
git fetch: only download codes from the remote repository
git pull: not only download codes, but merge codes to the local repository

2. What is the difference between git merge and git rebase? Pro and Cons?
**`merge`**:

- Combines two branches **by creating a new merge commit**
- **Preserves** full branching history

**`rebase`**:

- Moves your branch’s commits to the top of another branch’s latest commit
- **Rewrites** history to be linear


3. How do you resolve merge conflicts in Git?
git merge <branch-name>: If there are conflicts, Git will stop and mark the files that need attention.
git status: Conflicted files will be shown as unmerged.
Open the Conflicted File(s) & Edit and Resolve the Conflict
git add <filename>: Mark Conflicts as Resolved
git commit: Complete the Merge


4. What is the purpose of .gitignore?
The .gitignore file tells Git which files and directories to ignore—meaning they won’t be tracked, staged, or committed.

5. How do you undo a commit that has already been pushed?
git reset --hard HEAD~1
git push origin <branch> --force

6. Can you give me some common git commands?
git init             # Initialize a new Git repository
git clone <url>      # Clone a remote repository
git status           # Show status of working directory and staging area
git log              # Show commit history
git diff             # Show changes not staged
git add <file>       # Stage a file
git add .            # Stage all changes
git commit -m "msg"  # Commit staged changes with message
git branch           # List branches
git branch <name>    # Create a new branch
git checkout <name>  # Switch to a branch
git checkout -b <name>  # Create and switch to a new branch
git merge <branch>   # Merge a branch into current branch
git rebase <branch>  # Reapply commits on top of another branch
git remote -v        # Show remotes
git remote add origin <url>  # Add a remote repo
git fetch            # Download changes without merging
git pull             # Fetch + merge changes from remote
git push origin <branch>     # Push changes to remote branch
git push -u origin <branch>  # Push and set upstream