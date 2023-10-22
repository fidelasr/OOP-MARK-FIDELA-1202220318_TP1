import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Pembuatan objek Bank
        Bank bank = new Bank();

        // Penambahan akun
        Account account1 = new Account("Pietro Maximoff", 1001, 1000.0);
        Account account2 = new Account("Wanda Maximoff", 1234567890, 1500.0);
        Account account3 = new Account("Fidela_SI4607", 1202220318, 3000.0);

        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);

        // Penampilan semua akun
        List<Account> accounts = bank.getAllAccounts();
        System.out.println("Daftar Akun:");
        for (Account account : accounts) {
            System.out.println("Saldo Akun " + account.getName() + ": " + account.getBalance());
        }

        // Penyetoran saldo
        System.out.println("\n" + account3.getName() + " Menyetor 500.0");
        account3.deposit(500.0);
        System.out.println("\nSaldo akun " + account3.getName() + " setelah menyetor: " + account3.getBalance());

        // Penarikan saldo
        boolean withdrawalResult = account3.withdraw(200.0);
        System.out.println("\n" + account3.getName() + " Menarik 200.0");
        if (withdrawalResult) {
            System.out.println("\nSaldo Akun " + account3.getName() + " setelah menarik: " + account3.getBalance());
        } else {
            System.out.println("\nPenarikan gagal. Saldo tidak mencukupi.");
        }

        // Penghapusan akun
        bank.removeAccount(1001);
        System.out.println("\n" + account1.getName() + " telah dihapus.");
        
        System.out.println("\nDaftar Semua Akun Dalam Bank:");
        for (Account account : accounts) {
            System.out.println("Nama: " + account.getName() + ", Nomor Akun: " + account.getAccountNumber() + ", Saldo: " + account.getBalance());
        }
    }
}
