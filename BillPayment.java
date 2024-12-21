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
}