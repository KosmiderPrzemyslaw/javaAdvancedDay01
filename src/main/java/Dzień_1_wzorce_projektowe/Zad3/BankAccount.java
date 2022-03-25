package Dzień_1_wzorce_projektowe.Zad3;

class BankAccount {

    private int depo;

    void deposit(int amount) {
        depo += amount;
    }

    void payOut(int amount) {
        if (depo >= amount) {
            depo -= amount;
            System.out.println("Wypłacono: " + amount);
            System.out.println("Stan konta: " + depo);
        } else {
            System.out.println("Za mało środków na koncie");
        }
    }
}
