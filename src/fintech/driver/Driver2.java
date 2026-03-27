package fintech.driver;

import fintech.model.Account;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author 12S24038 Nicolas J Grace Butarbutar
 */

public class Driver2 {

    public static void main(String[] _args) {
        Scanner scanner = new Scanner(System.in);
        List<Account> accounts = new ArrayList<>();
        List<Transaction> transactions = new ArrayList<>();
        int transactionId = 1;
    
        while(true) {
            if (!Scanner.hasNextLine()) {
                break;
            }

            String input = scanner.nextLine().trim();
            if ("---".equals(input)) {
                break;
            }

            String[] data = input.split("#");
            String data = data [0];

            switch (data) {
                case "create-account":
                    if (data.length == 3) {
                        Account acc = newAccount(data[1], data[2]);
                        account.put(data[2], acc);
                    }
                    break;
                
                case "deposit":
                    if (data.length == 5) {
                        String user = data[1];
                        double amount = Double.parseDouble(data [2]);
                        String time =  data[3];
                        String desc = data[4];
                    }
                    break;
                case "withdraw":
                    if (data.length == 5) {
                        String user = data[1];
                        double amount = Double.parseDouble(data [2]);
                        String time = data[3];
                        String desc = data[4];
                    }
                    break;
            } 
        }

        for (Account acc : accounts) {
            System.out.println(acc);
        }
        for (Transaction t : transactions) {
                System.out.println(t);

        scanner.close();
        
    }
    
    }
