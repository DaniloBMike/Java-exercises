package exerciseOPP.Encapsulation;

public class ClientsAccount {
    public static void main(String[] args) {


        //Client01

        NewAccountBank client01 = new NewAccountBank("Danilo", "7525-67",25);

        System.out.println();

        System.out.println("========Client01========");
        client01.setOwnerName("");
        client01.setOwnerName("Danilo Bernardo Alves");
        client01.deposit(1000.0);

        if (client01.withdraw(750.0)) {
            System.out.println("Withdraw successfully");
        }
        else {
            System.out.println("Withdraw failed");
        }


        if (client01.withdraw(400.0)) {
            System.out.println("withdraw successfully");
        }
        else {
            System.out.println("withdraw failed! insufficient funds!");
            System.out.println("Your balance amount : " + client01.getBalance());
        }

        client01.showAccount();

        client01.isActive();

        //Client02
        System.out.println();

        System.out.println("========Client02========");

        NewAccountBank client02 = new NewAccountBank("Silvana", "8747-89", 30);

        client02.deposit(2500.0);

        client02.deposit(-100.0);

        client02.deposit(2500.0);

        if (client02.withdraw(3000.0)) {
            System.out.println("Withdraw successfully");
        }
        else {
            System.out.println("Withdraw failed");
        }

        if (client02.withdraw(4000.0)) {
            System.out.println("withdraw successfully");
        }

        else {
            System.out.println("Withdraw failed insufficient funds!");
        }

        System.out.println("balance : " + client02.getBalance());

        client02.setOwnerName("");
        client02.setOwnerName("Silvana Bernardo Alves");
    }
}
