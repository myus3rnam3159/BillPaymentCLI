#!/bin/bash

JAR_NAME="BillPayment.jar"

javac -d target BillPayment.java

jar cvfe BillPayment.jar BillPayment -C target .

# Pass all arguments to the Java application
java -jar "$JAR_NAME" "$@"
