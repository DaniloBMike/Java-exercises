package exerciseOPP.Encapsulation;

public class NewAccountBank {

        //Attributes

        private String accountNumber;
        private String ownerName;
        private int ownerAge;
        private double balance;
        private boolean active;
        private boolean hasCreditCard;


        //Constructor

        public NewAccountBank (String accountNumber, String ownerName, int ownerAge, boolean active, boolean hasCreditCard) {

                this.accountNumber = accountNumber;
                this.ownerName = ownerName;
                this.ownerAge = ownerAge;
                this.balance = 0;
                this.active = active;
                this.hasCreditCard = hasCreditCard;

        }


}
