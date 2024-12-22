# Bill Payment Application Guide

### Prerequisites
**Install Java *8+* (current version: `23.0.1`) to run this application.**

**Junit testing libary version (for avoiding conflict)**
```bash
unit-jupiter-5.11.3.jar
junit-jupiter-api-5.11.4.jar
unit-platform-commons-1.11.4.jar
junit-platform-console-standalone-1.11.4.jar
junit-platform-engine-1.11.4.jar
junit-platform-launcher-1.11.4.jar
junit-platform-suite-commons-1.11.4.jar
pentest4j-1.3.0.jar
```
---
#### **Run programm using shell with entry points**

```bash
$path/to/program> chmod +x run.sh
$path/to/program> ./run.sh <COMMAND> <value ...>
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
$path/to/program> chmod +x test.sh
$path/to/program> ./test.sh
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