package exerciseOPP.Encapsulation;

public class NewAccountBank {

        //Attributes

        private String ownerName;
        private String accountNumber;
        private int ownerAge;
        private double balance;
        private boolean active;
        private boolean hasCreditCard;


        //Constructor

        public NewAccountBank (String ownerName, String accountNumber, int ownerAge, boolean active, boolean hasCreditCard) {

                this.ownerName = ownerName;
                this.accountNumber = accountNumber;
                this.ownerAge = ownerAge;
                this.balance = 0;
                this.active = active;
                this.hasCreditCard = hasCreditCard;

        }

        private String getAccountNumber() {
                return accountNumber;
        }

        private String getOwnerName() {
                return ownerName;
        }

        private int getOwnerAge() {
                return ownerAge;
        }

        private double getBalance() {
                return balance;
        }

        private String setOwnerName(String ownerName) {
                return ownerName;
        }

        private void Empty() {

                if (ownerName.isEmpty())
                        System.out.println("There is no owner name!");
                else {
                        System.out.println(ownerName);
                }
        }

        public boolean isActive() {
            return !ownerName.isEmpty() && !accountNumber.isEmpty() && balance > 0;
        }

        public void deposit(double amount) {

                if (amount > 0) {
                        balance += amount;
                } else {
                        System.out.println("Invalid input!");
                }
        }

        public boolean withdraw(double amount) {

                if (amount > 0 && balance >= amount) {
                        balance -= amount;
                        return true;
                } else {
                        return false;
                }

        }

        public void showAccount() {
                System.out.println(" The account Name : " + ownerName + " The account name : " +  accountNumber + " The balance account : " + balance);
        }
}
