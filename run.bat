@echo off
setlocal

rem Ensure build output directory exists
if not exist build\classes mkdir build\classes

rem Compile the plugin with Java 8 compatibility
rem Compile all Java sources under src\ so package classes (e.g. GUI) are included
javac --release 8 -cp lib\ij.jar -d build\classes src\*.java src\GUI\*.java
if errorlevel 1 (
    echo Compilation failed.
    exit /b 1
)

echo Running ImageJ plugin...
java -cp build\classes;lib\ij.jar SPTurbo_
