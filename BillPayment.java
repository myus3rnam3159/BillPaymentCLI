import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import model.Account;

public class BillPayment {
    private static final Map<String, Function<String[], String>> map = new HashMap<>();

    public static void main(String[] args) {

        final String command = args[0];
        String[] cmdArgs = Arrays.copyOfRange(args, 1, args.length);

        if (map.containsKey(command)) {
            System.out.println(map.get(command).apply(cmdArgs));
        }
    }

    static {
        map.put("CASH_IN", BillPayment::cashIn);
    }

    private static String cashIn(String[] args) {
        int newAmount = Integer.parseInt(args[0]);

            Account acc = new Account();
            acc.addBalance(newAmount);

            return String.format("Your available balance: %s\n", acc.getBalance());
    }
}