package exerciseOPP.Encapsulation;

public class NewAccountBank {

        //Attributes

        private String ownerName;
        private String accountNumber;
        private int ownerAge;
        private double balance;


        //Constructor

        public NewAccountBank (String ownerName, String accountNumber, int ownerAge) {

                this.ownerName = ownerName;
                this.accountNumber = accountNumber;
                this.ownerAge = ownerAge;
                this.balance = 0;

        }

        //Methods getter and setter

        public String getAccountNumber() {
                return accountNumber;
        }

        public String getOwnerName() {
                return ownerName;
        }

        public int getOwnerAge() {
                return ownerAge;
        }

        public double getBalance() {
                return balance;
        }

        public void setOwnerName(String newOwnerName){
                this.ownerName = newOwnerName;
        }

        //Methods

        public void deposit(double amount) {

                if (amount > 0) {
                        balance += amount;
                } else {
                        System.out.println("Invalid input balance! ");
                }
        }

        public boolean withdraw(double amount) {

                if (amount > 0 && balance >= amount) {
                        balance -= amount;
                        return true;
                }
                else {
                        return false;
                }

        }

        public void showAccount() {
                System.out.println("The owner name : " + ownerName);
                System.out.println("The account number : " + accountNumber);
                System.out.println("The owner age : " + ownerAge);
        }

        public boolean active() {

                return !ownerName.isEmpty() && !accountNumber.isEmpty() && balance > 0 && ownerAge > 18;
        }

        public void isActive() {

                if (active()) {
                        System.out.println("Active and verified account ");
                }
                else {
                        System.out.println("Verified account, not active ");
                }

        }



}
