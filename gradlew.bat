@echo off
set DIR=%~dp0
set DEFAULT_JAR=%DIR%gradle\wrapper\gradle-wrapper.jar

if not exist "%DEFAULT_JAR%" (
    echo ERROR: gradle-wrapper.jar not found at %DEFAULT_JAR%
    exit /b 1
)

java -jar "%DEFAULT_JAR%" %*
