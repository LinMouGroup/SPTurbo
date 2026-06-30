@echo off
setlocal

rem Ensure build output directory exists
if not exist build\classes mkdir build\classes

rem Compile the plugin with Java 8 compatibility
javac --release 8 -cp lib\ij.jar -d build\classes src\SPTurbo_.java
jar cf build\SPTurbo_.jar -C build\classes .
if errorlevel 1 (
    echo Compilation failed.
    exit /b 1
)

echo Running ImageJ plugin...
java -cp build\classes;lib\ij.jar SPTurbo_
