package oopc;

public class MyBanking {

    public static void main(String[] args) {
        Bank b = new Bank();
        b.assignValues("HDFC", "Vastrapur", 15000, 5000);
        b.display();
    }
}

class Bank {

    String name;
    String address;
    int deposit;
    int credit;
    int balance;

    void assignValues(String name, String address, int deposit, int credit) {
        this.name = name;
        this.address = address;
        this.deposit = deposit;
        this.credit = credit;
        this.balance = this.deposit - this.credit;
    }
    
    void debit(int deposit) {
        this.balance = this.balance + deposit;
    }
    
    void credit(int credit) {
        this.balance = this.balance - credit;
    }

    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Address: " + this.address);
        System.out.println("Balance: " + this.balance);
    }
}
