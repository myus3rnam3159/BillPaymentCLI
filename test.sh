#!/bin/bash

# Compile the test file
javac -d target -cp ".:.:lib/*" test/BillPaymentTest.java

# Run JUnit test
java -jar lib/junit-platform-console-standalone-1.11.4.jar --class-path target --select-class test.BillPaymentTest