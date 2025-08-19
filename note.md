1. What is Maven?
   Maven is a build automation and project management tool used mainly for Java projects.

2. What is a POM file in Maven?
   The pom.xml file in a Maven project stands for Project Object Model. It’s the core configuration file that tells Maven how to build your project — including what dependencies to download, what plugins to use, and how to compile, test, and package your application.

3. What is the difference between dependencies and dependencyManagement?
   dependencies is where you actually list the libraries your project needs. Maven will download and include them in your build.
   But dependencyManagement is different, it’s like a "template" for dependencies, usually in a parent POM. It doesn’t add dependencies by itself, but it sets default versions and scopes. Then, in child projects, you can just declare the dependency without the version, and Maven will use the one from dependencyManagement.

4. What is a transitive dependency in Maven?
   A transitive dependency is when Maven automatically pulls in extra libraries that your direct dependencies need. They are not declared in your pom.xml directly, but are pulled in by the libraries you do declare.

5. What is the difference between a snapshot and a release in Maven?
   For SNAPSHOT: These are development versions where Maven automatically checks the remote repository for updates during each build. Development teams use these to share the latest code changes.
   For RELEASE: These are official stable releases. Maven will use exactly this specified version without checking for updates. Once published, these versions cannot be modified and are intended for production use.

6. What are some commonly used Maven plugins?
   maven-compiler-plugin: Compiles your Java source code. Lets you specify Java versions
   maven-surefire-plugin: Runs unit tests during the test phase. Supports JUnit and TestNG
   maven-jar-plugin: Packages your code into a JAR file. Can configure the manifest
   maven-install-plugin: Installs the artifact to your local repository.
   maven-deploy-plugin: Deploys artifacts to remote repositories.

7. What is Maven lifecycle?
   The Maven life cycle is a set of well-defined phases that manage the build process of a project

8. What are some common lifecycle phases?
   validate → compile → test → package → verify → install → deploy

9. What is the difference between mvn package and mvn install?
   Use mvn package** when you’re just building and testing your project.
   Use mvn install** when you want to use this project as a dependency in another local project.

1. What is the difference between git fetch and git pull?
   git fetch downloads changes from remote but doesn't merge them (safe)
   git pull = git fetch + git merge (can cause unexpected merges)

2. What is the difference between git merge and git rebase? Pro and Cons?
   Merge keeps all history but makes messy branch commits. Rebase makes cleaner history by rewriting commits, but can cause problems if others are using the branch. Use merge for shared branches, rebase for your own work

3. How do you resolve merge conflicts in Git?
   When you get conflicts, Git marks the problem spots in files. You edit to keep what you want, remove the markers, then add and commit. It's like choosing which changes to keep when two people edit the same file.

4. What is the purpose of .git ignore?
   This file tells Git what to ignore, like temporary files, logs, or IDE settings. Stops you from accidentally committing stuff that shouldn't be in version control 
5. How do you undo a commit that has already been pushed?
                                                                                                                                                                        Best way is git revert, it makes a new commit that undoes the old one. Don't use reset on shared branches, it rewrites history and can mess up others' work 
6. Can you give me some common git commands?
                                                                                                                                                                                                                                                                                                                                      git add -A         
                                                                                                                                                                                                                                                                                                                                      git commit -m "msg"     
                                                                                                                                                                                                                                                                                                                                      git commit --amend     
                                                                                                                                                                                                                                                                                                                                      git branch              
                                                                                                                                                                                                                                                                                                                                      git switch -c feature/x  
                                                                                                                                                                                                                                                                                                                                      git switch main          
