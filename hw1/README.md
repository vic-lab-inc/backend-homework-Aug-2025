Submit your hw1 in this folder
1. What is Maven?
   Maven is a build automation and project management tool for Java projects. It helps manage dependencies, build processes, documentation, and reporting using a standardized project structure.

2. What is a POM file in Maven?
   POM (Project Object Model) is an XML file (pom.xml) that contains project configuration details such as dependencies, plugins, build settings, and metadata. It is the core unit of Maven.

3. What is the difference between dependencies and dependencyManagement?

    dependencies: Directly adds the required libraries to your project.

    dependencyManagement: Defines versions and configurations for dependencies but doesn’t include them automatically. Child modules must explicitly declare them.

4. What is a transitive dependency in Maven?
   A transitive dependency is a dependency that your project needs indirectly because it is required by one of your direct dependencies. Maven automatically downloads and manages these.

5. What is the difference between a snapshot and a release in Maven?

    Snapshot: Development version that can change over time (1.0-SNAPSHOT). Useful during active development.

    Release: A fixed, stable version (1.0). Immutable once published.

6. What are some commonly used Maven plugins?

    maven-compiler-plugin → Compiles Java code

    maven-surefire-plugin → Runs unit tests

    maven-jar-plugin → Creates JAR files

    maven-war-plugin → Builds WAR files for web apps

    maven-deploy-plugin → Deploys artifacts to repositories

    maven-clean-plugin → Cleans target directory

7. What is Maven lifecycle?
   A Maven lifecycle is a sequence of build phases that define the order of tasks (e.g., compile, test, package). Maven has three built-in lifecycles: default (build), clean, site.

8. What are some common lifecycle phases?

    validate → Validate project structure

    compile → Compile source code

    test → Run tests

    package → Package compiled code into JAR/WAR

    install → Install artifact into local repository

    deploy → Deploy to remote repository

   9. What is the difference between mvn package and mvn install?

       mvn package: Compiles, tests, and packages the code (JAR/WAR) in the target/ directory.

       mvn install: Does everything package does, plus installs the artifact into the local Maven repository (~/.m2/repository) for reuse.

10. What are some commonly used Maven plugins?
 🔹 Build & Compilation

    maven-compiler-plugin → Compiles Java source code.

    maven-jar-plugin → Builds JAR files.

    maven-war-plugin → Builds WAR files for web applications.

    maven-assembly-plugin → Packages project with dependencies (e.g., into a fat JAR).

  🔹 Testing

    maven-surefire-plugin → Runs unit tests.

    maven-failsafe-plugin → Runs integration tests (usually after packaging).

  🔹 Packaging & Deployment

    maven-install-plugin → Installs the artifact into the local repository.

    maven-deploy-plugin → Deploys the artifact to a remote repository.

    maven-shade-plugin → Creates an uber/fat JAR with all dependencies.

  🔹  Build Management

    maven-clean-plugin → Cleans up (target/ folder).

    maven-resources-plugin → Handles resources (copying, filtering).

Git Questions

1. What is the difference between git fetch and git pull?

    git fetch: Downloads commits and branches from remote but doesn’t merge.

    git pull: Fetches and immediately merges into your current branch (git fetch + git merge).

2. What is the difference between git merge and git rebase? Pro and Cons?

    Merge: Combines histories, creates a new "merge commit".

    ✅ Preserves history, safe

    ❌ History can get cluttered

    Rebase: Re-applies commits on top of another branch.

    ✅ Cleaner, linear history

    ❌ Can rewrite history (dangerous if already pushed)

3. How do you resolve merge conflicts in Git?

    Identify conflict (git status).

    Open conflicting files, look for <<<<<<<, =======, >>>>>>>.

    Edit and resolve manually.

    Mark as resolved (git add <file>).

    Commit (git commit).

4. What is the purpose of .gitignore?
   .gitignore specifies intentionally untracked files (e.g., logs, build artifacts, IDE configs) that Git should ignore.

   5. How do you undo a commit that has already been pushed?

      If others haven’t pulled: git reset --hard <commit> then git push --force.

      If others have pulled (safer): git revert <commit> → Creates a new commit that undoes changes.

6. Can you give me some common git commands?

    git clone <repo> → Clone repo

    git status → Show changes

    git add <file> → Stage changes

    git commit -m "msg" → Commit changes

    git log --oneline → View history

    git branch → List branches

    git checkout -b new-branch → Create & switch branch

    git push origin branch → Push to remote

    git pull origin branch → Pull from remote