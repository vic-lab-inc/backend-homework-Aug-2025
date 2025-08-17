# Maven & Git Interview Questions - Study Notes

## Maven Questions

### 1. What is Maven?
Maven is a build automation and project management tool for Java projects. It uses an XML file (POM) to describe the project structure, dependencies, build configuration, and plugins. Maven follows the "Convention over Configuration" principle, providing standard directory layouts and build lifecycles.

**Key Features:**
- Dependency management
- Standardized project structure
- Build lifecycle management
- Plugin-based architecture
- Repository system for artifact sharing

### 2. What is a POM file in Maven?
POM (Project Object Model) is an XML file (`pom.xml`) that contains project information and configuration details. It's the fundamental unit of work in Maven.

**Key Elements:**
- `groupId`: Organization identifier
- `artifactId`: Project name
- `version`: Project version
- `dependencies`: External libraries needed
- `plugins`: Build tools configuration
- `properties`: Custom variables

### 3. What is the difference between dependencies and dependencyManagement?

| **dependencies** | **dependencyManagement** |
|------------------|---------------------------|
| Actually includes dependencies in the project | Only declares dependency versions (doesn't include them) |
| Direct inclusion in classpath | Provides version management for child modules |
| Used in regular modules | Used in parent POMs |
| Immediate effect | Acts as a template for child POMs |

**Example:**
```xml
<!-- dependencyManagement (parent POM) -->
<dependencyManagement>
    <dependencies>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.12</version>
        </dependency>
    </dependencies>
</dependencyManagement>

<!-- dependencies (child POM) -->
<dependencies>
    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <!-- version inherited from parent -->
    </dependency>
</dependencies>
```

### 4. What is a transitive dependency in Maven?
A transitive dependency is a dependency of your dependency. Maven automatically resolves and includes these indirect dependencies.

**Example:** If your project depends on Spring Framework, and Spring depends on Apache Commons, then Apache Commons becomes a transitive dependency of your project.

**Management:**
- Use `<exclusions>` to exclude unwanted transitive dependencies
- Use `mvn dependency:tree` to view dependency hierarchy
- Conflicts resolved by "nearest definition" rule

### 5. What is the difference between a snapshot and a release in Maven?

| **SNAPSHOT** | **RELEASE** |
|--------------|-------------|
| Development version (e.g., 1.0-SNAPSHOT) | Stable, immutable version (e.g., 1.0) |
| Can be updated/overwritten | Cannot be modified once deployed |
| Downloaded on every build (if newer available) | Downloaded once and cached |
| Used during active development | Used for production releases |
| Stored in snapshot repositories | Stored in release repositories |

### 6. What are some commonly used Maven plugins?

**Core Plugins:**
- **maven-compiler-plugin**: Compiles Java source code
- **maven-surefire-plugin**: Runs unit tests
- **maven-failsafe-plugin**: Runs integration tests
- **maven-jar-plugin**: Creates JAR files
- **maven-war-plugin**: Creates WAR files for web applications

**Additional Plugins:**
- **maven-dependency-plugin**: Manages dependencies
- **maven-assembly-plugin**: Creates custom distributions
- **maven-release-plugin**: Manages project releases
- **spring-boot-maven-plugin**: Spring Boot specific tasks

### 7. What is Maven lifecycle?
Maven lifecycle is a sequence of named phases that define the order of goal execution. There are three built-in lifecycles:

1. **Default Lifecycle**: Handles project deployment
2. **Clean Lifecycle**: Cleans up artifacts created by the build
3. **Site Lifecycle**: Creates project documentation

### 8. What are some common lifecycle phases?

**Default Lifecycle Phases:**
- `validate`: Validates project structure
- `compile`: Compiles source code
- `test`: Runs unit tests
- `package`: Creates JAR/WAR files
- `verify`: Runs integration tests
- `install`: Installs package to local repository
- `deploy`: Copies package to remote repository

**Clean Lifecycle:**
- `pre-clean`, `clean`, `post-clean`

**Site Lifecycle:**
- `pre-site`, `site`, `post-site`, `site-deploy`

### 9. What is the difference between mvn package and mvn install?

| **mvn package** | **mvn install** |
|-----------------|-----------------|
| Creates JAR/WAR in `target/` directory | Creates JAR/WAR AND copies to local repository |
| Only builds the project | Builds + makes available to other local projects |
| Doesn't affect local repository | Updates `~/.m2/repository/` |
| Good for testing builds | Good for local development with multiple projects |

**When to use:**
- `mvn package`: When you just want to build and test
- `mvn install`: When other local projects depend on this one

### 10. Commonly used Maven plugins (Extended List)

**Build Plugins:**
- `maven-clean-plugin`: Cleans build directory
- `maven-resources-plugin`: Copies resources
- `maven-compiler-plugin`: Compiles code
- `maven-surefire-plugin`: Unit testing
- `maven-jar-plugin`: JAR creation

**Reporting Plugins:**
- `maven-javadoc-plugin`: Generates documentation
- `maven-checkstyle-plugin`: Code style checking
- `maven-pmd-plugin`: Static code analysis

**Integration Plugins:**
- `docker-maven-plugin`: Docker integration
- `flyway-maven-plugin`: Database migrations
- `jacoco-maven-plugin`: Code coverage

---

## Git Questions

### 1. What is the difference between git fetch and git pull?

| **git fetch** | **git pull** |
|---------------|--------------|
| Downloads changes from remote repository | Downloads changes AND merges them |
| Updates remote-tracking branches only | Updates current working branch |
| Safe operation (doesn't modify working directory) | Can cause merge conflicts |
| `fetch` = download only | `pull` = `fetch` + `merge` |

**Commands:**
```bash
git fetch origin          # Downloads latest changes
git pull origin main      # Downloads and merges changes
```

**Best Practice:** Use `git fetch` first to review changes, then `git merge` or `git rebase` manually.

### 2. What is the difference between git merge and git rebase? Pros and Cons?

| **git merge** | **git rebase** |
|---------------|----------------|
| Combines branches with a merge commit | Moves commits to new base, no merge commit |
| Preserves branch history | Creates linear history |
| Non-destructive operation | Rewrites commit history |

**Git Merge:**
```bash
git checkout main
git merge feature-branch
```

**Pros:**
- Preserves complete history
- Safe for shared branches
- Shows when features were integrated

**Cons:**
- Creates complex, non-linear history
- Merge commits can clutter history

**Git Rebase:**
```bash
git checkout feature-branch
git rebase main
```

**Pros:**
- Clean, linear history
- Easier to understand project progression
- No merge commits

**Cons:**
- Rewrites history (dangerous for shared branches)
- Loses context of when features were merged
- Can be confusing for beginners

**Rule:** Use merge for shared branches, rebase for private feature branches.

### 3. How do you resolve merge conflicts in Git?

**Steps to resolve merge conflicts:**

1. **Identify conflicted files:**
```bash
git status  # Shows files with conflicts
```

2. **Open conflicted files and look for conflict markers:**
```
<<<<<<< HEAD
Your changes
=======
Incoming changes
>>>>>>> branch-name
```

3. **Resolve conflicts manually:**
- Edit the file to keep desired changes
- Remove conflict markers (`<<<<<<<`, `=======`, `>>>>>>>`)

4. **Mark as resolved and commit:**
```bash
git add conflicted-file.txt
git commit -m "Resolve merge conflict"
```

**Tools for conflict resolution:**
- Built-in editor
- `git mergetool` (launches configured merge tool)
- IDE integrations (IntelliJ, VSCode)
- External tools (Beyond Compare, KDiff3)

### 4. What is the purpose of .gitignore?

`.gitignore` file specifies intentionally untracked files that Git should ignore. It prevents sensitive, temporary, or generated files from being committed.

**Common patterns:**
```gitignore
# Compiled files
*.class
*.jar
target/

# IDE files
.idea/
*.iml
.vscode/

# OS files
.DS_Store
Thumbs.db

# Environment files
.env
application-local.properties

# Dependencies
node_modules/
```

**Rules:**
- `*.log` - ignores all .log files
- `temp/` - ignores temp directory
- `!important.log` - exception (don't ignore this file)
- `*.jar` - ignores all JAR files

### 5. How do you undo a commit that has already been pushed?

**Method 1: Revert (Recommended for shared repositories)**
```bash
git revert <commit-hash>
git push origin main
```
- Creates a new commit that undoes changes
- Safe for shared repositories
- Preserves history

**Method 2: Reset (Use with caution)**
```bash
git reset --hard <previous-commit-hash>
git push --force origin main
```
- **WARNING:** Dangerous for shared repositories
- Rewrites history
- Use only on private branches

**Method 3: Interactive rebase (for recent commits)**
```bash
git rebase -i HEAD~3  # Edit last 3 commits
# Mark commits to drop or edit
git push --force origin main
```

**Best Practice:** Always use `git revert` for public branches to maintain safe collaboration.

### 6. Common Git Commands

**Repository Setup:**
```bash
git init                          # Initialize new repository
git clone <url>                   # Clone remote repository
git remote add origin <url>       # Add remote repository
```

**Basic Operations:**
```bash
git status                        # Show working directory status
git add <file>                    # Stage files
git add .                         # Stage all changes
git commit -m "message"           # Commit staged changes
git push origin <branch>          # Push to remote
git pull origin <branch>          # Pull from remote
```

**Branching:**
```bash
git branch                        # List branches
git branch <name>                 # Create branch
git checkout <branch>             # Switch branch
git checkout -b <branch>          # Create and switch branch
git merge <branch>                # Merge branch
git branch -d <branch>            # Delete branch
```

**History and Information:**
```bash
git log                           # Show commit history
git log --oneline                 # Compact log
git diff                          # Show changes
git show <commit>                 # Show specific commit
git blame <file>                  # Show who changed what
```

**Undoing Changes:**
```bash
git checkout -- <file>            # Discard working directory changes
git reset HEAD <file>             # Unstage file
git reset --soft HEAD~1           # Undo last commit (keep changes)
git reset --hard HEAD~1           # Undo last commit (discard changes)
git revert <commit>               # Create reverse commit
```

**Stashing:**
```bash
git stash                         # Save current changes temporarily
git stash pop                     # Apply and remove latest stash
git stash list                    # Show all stashes
git stash apply stash@{0}         # Apply specific stash
```

---

## Quick Interview Tips

1. **Maven:** Emphasize understanding of dependency management and build lifecycles
2. **Git:** Focus on collaborative workflows and conflict resolution
3. **Practice:** Be ready to explain commands and their use cases
4. **Real scenarios:** Prepare examples from your actual project experience