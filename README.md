***PLEASE INSTALL JDK 14+ TO RUN THIS APP***

chương 4 java core 1

jar cvfe BillPayment.jar main.BillPayment main/*.class

run.sh với command java jar

phải somehow xài scanner, xài file để lưu db

1 file csv/text cho bill
1 file csv/text cho payment 
1 text cho blance

javac -d . -cp "lib\*;." test\BillPaymentTest.java - win 

java -jar lib/junit-platform-console-standalone-1.11.4.jar --class-path . --select-class test.BillPaymentTest

javac -d . -cp lib/*.jar  test/BillPaymentTest.java - linux