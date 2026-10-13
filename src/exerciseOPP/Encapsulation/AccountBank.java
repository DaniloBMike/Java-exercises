package exerciseOPP.Encapsulation;

public class AccountBank {

    //Attributes

    private String ownerName;
    private double balance;

    //Getter and Setter - Standard methods to get and to modify attributes


    //Method to GET an Attribute

    public String getOwnerName() {
        return ownerName;
    }

    //Method SET to modify an attribute

    public void changeOwnerName(String newOwnerName) {
        this.ownerName = newOwnerName;
        
    }


}
