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

        //Methods

        private String setOwnerName(String ownerName) {
                return ownerName;
        }

        public void deposit(double amount) {

                if (amount > 0) {
                        balance += amount;
                } else {
                        System.out.println(" Invalid input! ");
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
                System.out.println(" The account Name : " + ownerName + " The account name : " +  accountNumber + " The balance account : " + balance + " The owner age " + ownerAge);
        }

        public boolean active() {

                return !ownerName.isEmpty() && !accountNumber.isEmpty() && balance > 0 && ownerAge > 18;
        }

        public void isActive() {

                if (active()) {
                        System.out.println(" Active and verify account ");
                }
                else {
                        System.out.println(" Verify account, not active ");
                }

        }



}
