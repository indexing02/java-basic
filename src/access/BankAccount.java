package access;

public class BankAccount {
    private int balance;

    public BankAccount() {
        this.balance = 0;
    }

    //Public 메서드 : 입금
    public void deposit(int amount) {
        if(isAmountValid(amount)) {
            balance += amount;
        }else{
            System.out.println("유효하지 않은 금액입니다");
        }
    }

    private boolean isAmountValid(int amount) {
        //금액이 0보다 커야함
        return amount > 0;
    }

    //public 메서드 : 출금
    public void withdraw(int amount) {
        if(isAmountValid(amount)&&balance-amount>=0) {
            balance -= amount;
        }else{
            System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
        }
    }

    //public 메서드 : 잔고확인
    public int getBalance() {
        return balance;
    }
}
