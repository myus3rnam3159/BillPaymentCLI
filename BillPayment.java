import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

import model.Account;
import model.Bills;

public class BillPayment {
    private static final Map<String, Consumer<String[]>> map = new HashMap<>();

    public static void main(String[] args) {

        final String command = args[0];
        String[] cmdArgs = Arrays.copyOfRange(args, 1, args.length);

        if (map.containsKey(command)) {
            map.get(command).accept(cmdArgs);;
        }
    }

    static {
        map.put("CASH_IN", BillPayment::cashIn);
        map.put("LIST_BILL", BillPayment::listBill);
        map.put("PAY", BillPayment::pay);
        map.put("EXIT", BillPayment::exit);
    }

    private static void cashIn(String[] args) {
        int newAmount = Integer.parseInt(args[0]);

            Account acc = new Account();
            acc.addBalance(newAmount);

            System.out.println(String.format("Your available balance: %s\n", acc.getBalance()));
    }

    private static void listBill(String[] args) {
        Bills bills = new Bills();
        bills.list();
    }

    private static void pay(String[] args) {
        Bills bills = new Bills();

        int am = 0;
        for(String billId: args){
            int id = Integer.parseInt(billId);

            if(!bills.billExisted(id)){
                System.out.println("Sorry! Not found a bill with such id");
                return;
            }
            am += bills.getBillAmount(id);
        }

        Account acc = new Account();
        int balance = acc.getBalance();

        if(balance < am){
            System.out.println("Sorry! Not enough fund to proceed with payment");
            return;
        }
        acc.setBalance(balance - am);
        System.out.println(String.format("Your current balance: %s", acc.getBalance()));
    }

    private static void exit(String[] args){
        System.out.println("Good bye!");
    }
}