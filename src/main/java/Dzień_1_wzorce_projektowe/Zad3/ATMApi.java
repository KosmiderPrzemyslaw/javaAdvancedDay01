package Dzień_1_wzorce_projektowe.Zad3;

public class ATMApi {
    private BankAccount bankAccount;
    private Loan loan;
    private PhoneCard phoneCard;
    private Transfer transfer;

    public ATMApi() {
    }

    ATMApi(BankAccount bankAccount, Loan loan, PhoneCard phoneCard, Transfer transfer) {
        this.bankAccount = bankAccount;
        this.loan = loan;
        this.phoneCard = phoneCard;
        this.transfer = transfer;
    }

    public void deposit(int amount){
        this.bankAccount.deposit(amount);
    }
    public void payOut(int amount){
        this.bankAccount.payOut(amount);
    }
    public void transferMoney(int amount){
        this.transfer.transferMoney(amount);
    }
    public void recharge(){
        this.phoneCard.recharge();
    }
    public void getLoan(int amount){
        this.loan.getLoan(amount);
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public Loan getLoan() {
        return loan;
    }

    public void setLoan(Loan loan) {
        this.loan = loan;
    }

    public PhoneCard getPhoneCard() {
        return phoneCard;
    }

    public void setPhoneCard(PhoneCard phoneCard) {
        this.phoneCard = phoneCard;
    }

    public Transfer getTransfer() {
        return transfer;
    }

    public void setTransfer(Transfer transfer) {
        this.transfer = transfer;
    }
}
