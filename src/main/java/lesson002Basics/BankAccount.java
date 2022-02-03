package lesson002Basics;

import java.math.BigDecimal;

public class BankAccount {
    private int accountNumber;
    private BigDecimal balance;

    public BankAccount(int accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = new BigDecimal(0);
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getBalance() {
        return this.balance;
    }

    public void credit(BigDecimal amount) {
        balance = balance.add(amount);
    }

    public void debit(BigDecimal amount) {
        if (amount.compareTo(balance) != 1) {
            balance = balance.subtract(amount);
        }
        else {
            System.out.println("Сумма снятия больше, чем остаток на счету!");
        }
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(0001);
        account1.setBalance(new BigDecimal(1000));
        account1.credit(new BigDecimal(500));
        account1.debit(new BigDecimal(500));
        account1.debit(new BigDecimal(1000.01));
        System.out.println(account1.getBalance());
    }
}
