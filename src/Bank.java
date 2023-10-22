import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accountList;

    public Bank() {
        this.accountList = new ArrayList<>();
    }

    public void addAccount(Account account) {
        this.accountList.add(account);
    }

    public void removeAccount(int accountNumber) {
        for (int i = 0; i < accountList.size(); i++) {
            if (accountList.get(i).getAccountNumber() == accountNumber) {
                accountList.remove(i);
                break;
            }
        }
    }

    public Account getAccount(int accountNumber) {
        for (Account account : accountList) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null; // Jika akun tidak ditemukan
    }

    public List<Account> getAllAccounts() {
        return this.accountList;
    }
}

