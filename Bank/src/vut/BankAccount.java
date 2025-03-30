package vut;

public class BankAccount {
    private String name;
    private double balance;

    public BankAccount() {
        this("",0);
    }

    public BankAccount(String name, double balance) {
        setName(name);
        setBalance(balance);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length()>3){
            this.name = name;
        }else{
            throw new IllegalArgumentException("Invalid values entered");
        }

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (this.balance>0){
            this.balance = balance;
        }else{
            throw new IllegalArgumentException("Invalid values entered");
        }

    }
    public double withdrawal(double withdrawalAmt){
        double total;
        if (withdrawalAmt>=50 && withdrawalAmt<this.balance ){

            total = getBalance()-withdrawalAmt;
            return total;
        }else{
            throw new IllegalArgumentException("invalid withdrawal amount");
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + getName() + '\'' +
                ", balance=" + String.format("%5.2f",getBalance())
                ;
    }
}
