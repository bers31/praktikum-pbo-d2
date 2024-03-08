public class BankApp {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500.0);

        try {
            // Deposit
            account.deposit(200.0);
            System.out.println("Saldo saat ini: $" + account.getBalance());

            // Penarikan yang berhasil
            account.withdraw(300.0);
            System.out.println("Saldo saat ini: $" + account.getBalance());

            // Penarikan yang gagal karena saldo tidak mencukupi
            account.withdraw(400.0);
        } catch (InsufficientFundsException e) {
            System.out.println("Pengecualian saat menarik dana: " + e.getMessage());
        }
    }
}