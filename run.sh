# Ensure build output directory exists
mkdir -p build/classes

# Compile the plugin with Java 8 compatibility
javac --release 8 -cp lib/ij.jar -d build/classes src/SPTurbo_.java

echo "Running ImageJ plugin with Java $JAVA_VERSION..."
java -cp build/classes:lib/ij.jar SPTurbo_
