package exerciseOPP.Encapsulation;

public class ClientsAccount {
    public static void main(String[] args) {


        NewAccountBank client01 = new NewAccountBank("Danilo", "7525-67",25);

        client01.deposit(1000.0);
        if (client01.withdraw(750.0)) {
            System.out.println("Withdraw successfully");
        }
        else {
            System.out.println("Withdraw failed");
        }

        client01.isActive();

        System.out.println(" balance : " + client01.getBalance());

    }
}
