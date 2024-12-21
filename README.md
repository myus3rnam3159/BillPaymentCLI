chương 4 java core 1

jar cvfe BillPayment.jar BillPayment -C target .

run.sh với command java jar

xài file để lưu db


Tat ca dang tu root

javac -d . -cp "lib\*;." test\BillPaymentTest.java - win 

java -jar lib/junit-platform-console-standalone-1.11.4.jar --class-path target --select-class test.BillPaymentTest

javac -d target -cp ".:.:lib/*" test/BillPaymentTest.java - linux

javac -d target BillPayment.java

java -cp target BillPayment CASH_IN 100

java -jar BillPayment.jar CASH_IN 100