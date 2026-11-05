package exerciseOPP.Encapsulation;

public class Bankagency {
    public static void main(String[] args) {

        AccountBank client01 = new AccountBank("Danilo");

        client01.addBalance(50000.0);

        client01.setOwnerName("Mike");
        client01.setBalance(client01.getBalance() + 50000.0);
        client01.setOwnerName("Danilo Bernardo Alves");
        client01.setBalance(client01.getBalance() - 25000.000);

        client01.getBalance();
        client01.getBalance();

        System.out.println("The owner account: " + client01.getOwnerName());
        System.out.println(" The balance of the owner account: " + client01.getBalance());


        AccountBank client02 = new AccountBank("Silvana");

        client02.addBalance(250000.0);
        client02.setOwnerName("Silvana Bernardo");
        client02.setBalance(client02.getBalance() + 250000.0);

        System.out.println("The owner account: " + client02.getOwnerName());
        System.out.println(" The balance of the owner account: " + client02.getBalance());
    }
}
