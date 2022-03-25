package Dzień_1_wzorce_projektowe.Zad3;

public class Main {
    public static void main(String[] args) {
        ATMApi atmApi = new ATMApi(new BankAccount(), new Loan(), new PhoneCard(), new Transfer());
        atmApi.deposit(20);
        BankAccount bankAccount = atmApi.getBankAccount();
        bankAccount.deposit(90);
        bankAccount.payOut(10);

    }
}
