# 项目：SPTurbo

简要说明：这是一个小型 Java 插件项目，已迁移到 Maven 标准目录结构，源码位于 `src/main/java`，依赖库位于 `lib/`。

## 目录结构

- `src/main/java/` — Java 源代码
- `lib/` — 本地依赖库（`ij.jar`）
- `target/` — Maven 构建输出
- `pom.xml` — Maven 项目描述文件
- `run.bat` — Windows 运行脚本
- `run.sh` — macOS/Linux 运行脚本

## 快速开始

1. 克隆或下载仓库到本地。
2. 使用命令行进入项目根目录。
3. 使用 Maven 编译并运行：

```bash
./run.sh
```

Windows:

```powershell
.\run.bat
```

## 构建与运行

- 通过 Maven 编译：

```bash
mvn compile
```

- 通过 Maven 运行：

```bash
mvn exec:java
```

- 若使用 IDE（如 IntelliJ IDEA 或 VS Code），请将 `pom.xml` 导入为 Maven 项目。

> 注意：本项目使用 JDK 8 编译，因为 `ij.jar` 依赖旧版 Java API。

## 贡献

欢迎提交 issue 或 pull request。请保持修改粒度小、描述清晰。

## 许可证

本项目未指定许可证。若打算公开，请添加合适的许可证文件（例如 `LICENSE`）。
