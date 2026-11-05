package exerciseOPP.Encapsulation;

public class AccountBank {

    //Attributes

    private String ownerName;
    private double balance;

    //Getter and Setter - Standard methods to get and to modify attributes


    //Method to READ an Attribute use GET

    public String getOwnerName() {
        return ownerName;
    }

    //Method to modify or add value an attribute use SET

    public void changeOwnerName(String newOwnerName) {
        this.ownerName = newOwnerName;

    }

    public double getBalance() {
        return balance;
    }

    public void setOwnerName(String newOwnerName) {
        this.ownerName = newOwnerName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public AccountBank(String ownerName) {
        this.ownerName = ownerName;
        this.balance = 0;
    }

    public double addBalance(double newbalance) {

        return balance = balance + newbalance;

    }

    public void showResult() {

        System.out.println(" The owner name: " + ownerName                                                                                                                                                                                        );
        System.out.println(" The owner balance: " + balance);
    }
}
