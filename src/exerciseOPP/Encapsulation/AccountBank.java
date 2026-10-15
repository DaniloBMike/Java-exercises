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


}
