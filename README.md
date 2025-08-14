# Homework

We will post homework here in this repo.

Checkout the branch and create a pull request for each homework.
- Please include your name and homework number in the branch name. You can name it like `hw1-joey`

Do NOT merge the pull request. Leave it open.

```
Git 的基本操作：（从git下载项目）`

1. 新建文件夹 命令是mkdir <projectName>
2. 进入文件夹cd <projectName>
3. 下载项目
   1. Git页面点code, 复制https链接
   2. 在<projectName>下，git clone <https 链接>
4. 创建hw branch并修改
   1. git branch <firstname_lastname_hw1> 创建hw branch在本地
   2. git checkout <firstname_lastname_hw1> 切换到hw branch
   3. 在hw branch上写作业
5. 上传修改
   1. 打开IntelliJ 的commit tab
   2. 选上所有的changes, 右键add to VCS
   3. 打开 Terminal , git commit -m “<commit message>” commit 当前的change
   4. git push origin <firstname_lastname/hw1> 把当前本地hw branch的commit 上传到远程
6. 交pr
   1. 打开git，有个 compare & pull request，点击进去
   2. Compare branch选 hw branch， base branch选 notes branch
   3. 点击create pull request
```