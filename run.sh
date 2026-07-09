# Ensure build output directory exists
mkdir -p build/classes

# Compile the plugin with Java 8 compatibility
# Compile all Java sources under src/ so package classes (e.g. GUI) are included
find src -name "*.java" > /tmp/sources.txt
javac --release 8 -cp lib/ij.jar -d build/classes @/tmp/sources.txt

echo "Running ImageJ plugin..."
java -cp build/classes:lib/ij.jar SPTurbo_
