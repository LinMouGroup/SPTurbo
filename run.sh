#!/usr/bin/env bash
set -e

mvn -q compile exec:exec -Dexec.executable=java -Dexec.args='-cp target/classes:lib/ij.jar com.spturbo.SPTurbo_'
