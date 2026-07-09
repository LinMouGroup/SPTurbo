@echo off
setlocal

rem Ensure build output directory exists
if not exist build\classes mkdir build\classes

rem Run the Maven project using the system java executable with a direct classpath
mvn -q compile exec:exec -Dexec.executable=java -Dexec.args="-cp target/classes;lib\ij.jar com.spturbo.SPTurbo_"
