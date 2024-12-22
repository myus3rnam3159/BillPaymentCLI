# Bill Payment Application Guide

### Prerequisites
- **Install Java 8+** (current version: `23.0.1`) to run this application.

---


#### **Make JAR File**
```bash
jar cvfe BillPayment.jar BillPayment -C target .
```

#### **Compile**
```bash
javac -d target BillPayment.java
```

#### **Command for testing output befor compression**
```bash
java -cp target BillPayment <COMMAND> <value...>
```
Example
```bash
java -cp target BillPayment CASH_IN 100
```

#### **Run programm using shell with entry points**
```bash
$path/to/program ./run.sh
```

Sample results:
```bash
annt@antienng:/mnt/d/mm$ ./run.sh CASH_IN 100
Your available balance: 997650200

annt@antienng:/mnt/d/mm$ ./run.sh LIST_BILL
Bill No    Type       Amount     Due Date        State      PROVIDER  
1          ELECTRIC   200000     25/10/2020      NOT_PAID   EVN HCMC  
2          WATER      175000     30/10/2020      NOT_PAID   SAVACO HCMC
3          INTERNET   800000     30/11/2020      NOT_PAID    VNPT

annt@antienng:/mnt/d/mm$ ./run.sh PAY 1
Your current balance: 997450200
annt@antienng:/mnt/d/mm$ ./run.sh PAY 10
Sorry! Not found a bill with such id
annt@antienng:/mnt/d/mm$ ./run.sh PAY 2 3
Your current balance: 996475200
annt@antienng:/mnt/d/mm$ ./run.sh EXIT
Good bye!
```
#### **Test using shell**
```bash
$path/to/program ./test.sh
```

Sample results:
```bash
annt@antienng:/mnt/d/mm$ ./test.sh

💚 Thanks for using JUnit! Support its development at https://junit.org/sponsoring

╷
├─ JUnit Platform Suite ✔
├─ JUnit Jupiter ✔
│  └─ BillPaymentTest ✔
│     ├─ listBillOk() ✔
│     └─ cashInOk() ✔
└─ JUnit Vintage ✔
└─ JUnit Vintage ✔
```