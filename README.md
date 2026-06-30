# 项目：SPTurbo

简要说明：这是一个小型 Java 插件项目示例，包含源码位于 `src/`，编译产物位于 `build/classes/`，并带有启动脚本 `run.bat`。

## 目录结构

- `src/` — 源代码（示例：`My_Plugin.java`）
- `lib/` — 项目依赖库
- `build/classes/` — 编译输出
- `run.bat` — 启动脚本

## 快速开始

1. 克隆或下载仓库到本地。
2. 使用命令行进入项目根目录。
3. 如果需要编译（示例使用 `javac`）：

```powershell
javac -d build/classes -cp "lib/*" src\*.java
```

4. 运行项目（Windows）：

```powershell
.\run.bat
```

## 构建与运行

- 若使用 IDE（如 IntelliJ IDEA 或 VS Code），请将 `src/` 添加为源代码目录，`lib/` 添加到类路径。
- 可按需修改 `run.bat` 以传入运行参数或设置 classpath。

## 贡献

欢迎提交 issue 或 pull request。请保持修改粒度小、描述清晰。

## 许可证

本项目未指定许可证。若打算公开，请添加合适的许可证文件（例如 `LICENSE`）。
