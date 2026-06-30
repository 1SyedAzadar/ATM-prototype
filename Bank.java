import java.util.HashMap;

public class Bank {

    HashMap<Integer, Accounts> accounts = new HashMap<>();

    public void addAccount(Accounts acc) {
        accounts.put(acc.getAccountNumber(), acc);
    }

    public Accounts getAccount(int accountNumber) {

        return accounts.get(accountNumber);
    }
}

