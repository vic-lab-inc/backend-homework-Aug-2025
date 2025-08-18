W# Sec 4 八股练习

## 准备以下八股题目答案, 写在`note.md`里write your tech question answers here
1. What is Maven?

 Maven is a useful tool help developer to manager packages.


2. What is a POM file in Maven?

Project Object Model, is the fundamental configuration file for a Maven project. It is an XML file named pom.xml.
The POM file contains all the necessary information and configuration details Maven uses to build, manage, and report on a project. Key elements defined within a POM include:
3. What is the difference between dependencies and dependencyManagement?

dependencies directly add libraries to the project, while dependencyManagement defines version and scope defaults that child modules can inherit.
4. What is a transitive dependency in Maven?

A transitive dependency in Maven is a library the project needs indirectly because it's required by another dependency you added.
5. What is the difference between a snapshot and a release in Maven? 

A snapshot is a work-in-progress version that can change over time.

A release is a final, stable version that won’t change.
6. What are some commonly used Maven plugins?

maven-compiler-plugin

7. What is Maven lifecycle?

Maven lifecycle is the set of steps that Maven follows to build and manage a project.

8. What are some common lifecycle phases?

validate, compile, test, package, install, deploy
9. What is the difference between mvn package and mvn install?
   
mvn package → build only

mvn install → build + install locally
10. What are some commonly used Maven plugins?

maven-compiler-plugin


1. What is the difference between git fetch and git pull?

Git fetch gets updates without changing your code, git pull gets updates and merges them into your current branch.
2. What is the difference between git merge and git rebase? Pro and Cons?

Merge keeps history as is with extra merge commits, rebase makes history cleaner by replaying changes on top; rebase is cleaner but riskier.
3. How do you resolve merge conflicts in Git?

Open the conflicted files, fix the changes manually, then git add and git commit to finish.
4. What is the purpose of .gitignore?

Tells Git which files or folders to skip from tracking.
5. How do you undo a commit that has already been pushed?

Use git revert to undo safely
6. Can you give me some common git commands?

git init, git clone, git add, git commit, git status, git push, git pull
