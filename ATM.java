import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        Bank bank = new Bank();
        Accounts acc1 = new Accounts(123, 345, 5000, "Azadar Hussain");
        bank.addAccount(acc1);
        Accounts acc2 = new Accounts(789, 702, 10000, "Hanan Umrani");
        bank.addAccount(acc2);
        Accounts acc3 = new Accounts(819, 890, 2000, "Adil Soomro");
        bank.addAccount(acc3);
        Accounts acc4 = new Accounts(913, 970, 1500, "Hamza Dp");
        bank.addAccount(acc4);
        Accounts acc5 = new Accounts(1013, 670, 4000, "Saif Ali Samo");
        bank.addAccount(acc5);


        Scanner scanner = new Scanner(System.in);
        int userInput1;
        int userInput2 = 0;
        int choice = 0;


        while (true) {
            System.out.println("Enter Account Number : ");
            userInput1 = scanner.nextInt();
            Accounts acc = bank.getAccount(userInput1);

            if (acc != null) {
                boolean pinCorrect = false;
                for (int i = 0; i < 3; i++) {
                    System.out.println("Enter 4 digit PIN : ");
                    userInput2 = scanner.nextInt();

                    if (userInput2 == acc.getPin()) {
                        pinCorrect = true;
                        break;
                    } else {
                        System.out.println("Wrong PIN! Attempts remaining: " + (2 - i));
                        continue;
                    }
                }
                if (pinCorrect) {

                    while (acc.verifyPin(userInput2)) {
                        System.out.println("** Press 1 for Deposit **");
                        System.out.println("** Press 2 for WITHDRAW **");
                        System.out.println("** Press 3 for CheckBAlance **");
                        System.out.println("** Press 4 for logout **");
                        choice = scanner.nextInt();

                        if (choice == 1) {
                            System.out.println("Enter Amount : ");
                            double amount = scanner.nextDouble();
                            try {
                                acc.deposit(amount);
                                System.out.println("Deposit successful!");
                            } catch (IllegalArgumentException e) {
                                System.out.println("Error: " + e.getMessage());
                            }
                        } else if (choice == 2) {
                            System.out.println("Enter Amount : ");
                            double amount = scanner.nextDouble();
                            try {
                                acc.withdraw(amount);
                                System.out.println("Withdraw successful!");
                            } catch (IllegalArgumentException e) {
                                System.out.println("Error: " + e.getMessage());
                            }
                        } else if (choice == 3) {
                            acc.balanceInfo();
                        } else if (choice == 4) {
                            System.out.println("Logging out");
                            break;
                        }
                    }
                } else {
                    System.out.println("Account Blocked! Too many wrong attempts.");
                }
            } else {
                System.out.println("Account not found!");
            }

        }
    }
}


