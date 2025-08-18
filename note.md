Write your tech question answers here
1. What is Maven?

Maven is a build automation and project management tool used primarily for Java projects.

2. What is a POM file in Maven?

The pom.xml file in a Maven project stands for Project Object Model. 
It’s the core configuration file that tells Maven how to build your project — 
including what dependencies to download, what plugins to use, and how to compile, test, and package your application.

3. What is the difference between dependencies and dependencyManagement?

### Dependencies

A POM can **declare other artifacts as dependencies**, which Maven resolves from local or remote repositories.

### Dependency Management

**<dependencyManagement>** is a special section in the Maven pom.xml used to **control and 
centralize dependency versions** and scopes **without actually including them** in the build.

4. What is a transitive dependency in Maven?

### Transitive Dependencies

They are not declared in your pom.xml directly, but are pulled in by the libraries you do declare.

5. What is the difference between a snapshot and a release in Maven?

Name — 命名
SNAPSHOT: version ends with -SNAPSHOT (e.g., 1.2.0-SNAPSHOT)
RELEASE: fixed version (e.g., 1.2.0)
快照版： 版本号以 -SNAPSHOT 结尾（如 1.2.0-SNAPSHOT）
发布版： 固定版本号（如 1.2.0）

Mutability — 是否可变
SNAPSHOT: mutable; same version may change over time
RELEASE: immutable once published
快照版： 可变；同一版本随时间可能变
发布版： 不可变；发布后不应再变化

Repositories & Updates — 仓库与更新策略
SNAPSHOT: goes to snapshot repos; Maven checks frequently (per updatePolicy)
RELEASE: goes to release repos; Maven won’t update an existing release
快照版： 部署到快照仓库；Maven 会按 updatePolicy 频繁检查更新
发布版： 部署到发布仓库；已发布版本默认不再更新

Use Cases — 适用场景
SNAPSHOT: in-progress development for teammates/CI
RELEASE: stable, production-ready builds
快照版： 持续开发中给团队/CI 使用
发布版： 稳定、可用于生产的版本

Reproducibility — 可复现性
SNAPSHOT: weaker; version can point to newer bits
RELEASE: strong; bits are fixed
快照版： 较弱；相同版本可能对应不同构件
发布版： 较强；构件固定不变

Publishing Rules — 发布规则
SNAPSHOT: not allowed in release repos (e.g., Central’s release)
RELEASE: requires proper release flow (signing, staging, tagging)
快照版： 不能发布到“发布仓库”（如 Maven Central 的 release 库）
发布版： 需走正式流程（签名、staging、打标签等）

TL;DR — 一句话总结
Use SNAPSHOT during development; when it’s stable, drop -SNAPSHOT and publish a RELEASE.
开发阶段用 SNAPSHOT；稳定后去掉 -SNAPSHOT 发布 RELEASE。

6. What are some commonly used Maven plugins?

maven-compiler-plugin, maven-surefire-plugin, maven-jar-plugin, maven-clean-plugin, maven-install-plugin.


7. What is Maven lifecycle?

The **Maven life cycle** is a **set of well-defined phases** that manage the **build process** of a project

There are three built-in build lifecycles: **default**, **clean** and **site**. 

The `default` lifecycle handles your project deployment, 
the `clean` lifecycle handles project cleaning, 
while the `site` lifecycle handles the creation of your project's web site.

8. What are some common lifecycle phases?

- `validate` - validate the project is correct and all necessary information is available
- `compile` - compile the source code of the project
- `test` - test the compiled source code using a suitable unit testing framework. These tests should not require the code be packaged or deployed
- `package` - take the compiled code and package it in its distributable format, such as a JAR.
- `verify` - run any checks on results of integration tests to ensure quality criteria are met
- `install` - install the package into the local repository, for use as a dependency in other projects locally
- `deploy` - done in the build environment, copies the final package to the remote repository for sharing with other developers and projects.

9. What is the difference between mvn package and mvn install?

mvn package: Compiles, tests, and packages the code.
mvn install: Does package + installs the package into the local repository.

- **Use mvn package** when you’re just building and testing your project.
- **Use mvn install** when you want to **use this project as a dependency** in another local project.

10. What are some commonly used Maven plugins?

maven-compiler-plugin, maven-surefire-plugin, maven-jar-plugin, maven-clean-plugin, maven-install-plugin.



1. What is the difference between git fetch and git pull?

git fetch: Downloads new commits from remote but doesn’t merge.
git pull: Fetches + automatically merges into current branch.

2. What is the difference between git merge and git rebase? Pro and Cons?

**`merge`**:

- Combines two branches **by creating a new merge commit**
- **Preserves** full branching history

**`rebase`**:

- Moves your branch’s commits to the top of another branch’s latest commit
- **Rewrites** history to be linear

3. How do you resolve merge conflicts in Git?

Open conflicting files → edit to keep desired changes → mark as resolved with git add → commit.

4. What is the purpose of .gitignore?

Lists files/directories Git should ignore (e.g., build files, logs, secrets).

5. How do you undo a commit that has already been pushed?

git revert <commit> (creates new commit reversing changes).
A more dangerous way is: git reset --hard <commit> + force push (git push -f) — avoid on shared branches.

6. Can you give me some common git commands?

git clone, git status, git add, git commit, git push, git pull, git fetch, git merge, git rebase, git log, git branch, git checkout, git reset.