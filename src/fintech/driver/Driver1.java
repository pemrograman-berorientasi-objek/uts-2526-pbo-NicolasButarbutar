package fintech.driver;

import fintech.model.Account;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author 12S24038 Nicolas J Grace Butarbutar
 */
//OK
public class Driver1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Account> accounts = new ArrayList<>();

        while (true) {
            if (!scanner.hasNextLine()) {
                break;
            }

            String input = scanner.nextLine().trim();

            if ("---".equals(input)) {
                break;
            }

            if (input.startsWith("create-account#")) {
                String[] data = input.split("#");

                if (data.length == 3) {
                    Account newAccount = new Account(data[1], data[2]);
                    accounts.add(newAccount);
                }
            }
        }

        for (Account acc : accounts) {
            System.out.println(acc);
        }

        scanner.close();
    }
}
