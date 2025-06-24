#!/usr/bin/env sh

##############################################################################
##
##  Gradle start up script for UN*X
##
##############################################################################

# set -o errexit
# set -o nounset

APP_NAME="Gradle"
APP_BASE_NAME=$(basename "$0")

# Resolve the location of the Gradle distribution
# This includes resolving any symbolic links
# based on: https://github.com/gradle/gradle/blob/master/gradlew

DIR="$(cd "$(dirname "$0")" && pwd)"
DEFAULT_JAR="$DIR/gradle/wrapper/gradle-wrapper.jar"

if [ ! -f "$DEFAULT_JAR" ]; then
  echo "ERROR: gradle-wrapper.jar not found at $DEFAULT_JAR"
  exit 1
fi

exec java -jar "$DEFAULT_JAR" "$@"
