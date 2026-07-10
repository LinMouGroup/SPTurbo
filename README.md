# 项目：SPTurbo

SPTurbo 是一个基于 Maven 标准目录结构的小型 Java 项目，主要源码位于 `src/main/java`，构建结果输出到 `target/`。

## 目录结构

- `src/main/java/` — Java 源代码
- `src/test/java/` — 测试源码（如果有）
- `target/` — Maven 构建输出
- `pom.xml` — Maven 项目描述文件
- `run.bat` — Windows 运行脚本
- `run.sh` — macOS/Linux 运行脚本

## 快速开始

1. 克隆或下载仓库到本地。
2. 使用命令行进入项目根目录。
3. 使用 Maven 编译项目：

```bash
mvn compile
```

4. 运行项目：

```bash
mvn exec:java
```

或者使用项目内脚本：

macOS/Linux:

```bash
./run.sh
```

Windows:

```powershell
.\run.bat
```

## 依赖与环境

- 使用 JDK 8 编译和运行
- 依赖在 `pom.xml` 中声明，Maven 会自动下载 `ij` 等库

## IDE 使用

将 `pom.xml` 导入到 IntelliJ IDEA、Eclipse、VS Code 等 IDE 中，即可直接构建和运行。

## 贡献

欢迎提交 issue 或 pull request。请保持修改粒度小、描述清晰。

## 许可证

本项目当前未指定许可证。若计划公开发布，请添加合适的 `LICENSE` 文件。