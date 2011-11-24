#!/bin/bash

## Just for making sure junit is installed and functional
#javac -cp .:/usr/share/java/junit4.jar SimpleTest.java
#java -cp .:/usr/share/java/junit4.jar org.junit.runner.JUnitCore SimpleTest

## Testing Customer
echo 'Testing CustomerTest...'
javac -Xlint:all -cp .:..:/usr/share/java/junit4.jar CustomerTest.java && java -cp .:..:/usr/share/java/junit4.jar org.junit.runner.JUnitCore CustomerTest
