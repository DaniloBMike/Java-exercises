public class ifelsestructure {
    public static void main (String[] args) {

         int danilo = 87;
        int mike = 75;
        int evelyn = 68;

        if (danilo <= 50) {
            System.out.println("Not pass");
        } else if (danilo == 70) {
            System.out.println("Final test");
        } else {
            System.out.println("Pass");
        }


        boolean haveMoney = true;
        boolean dontHavemoney = false;

        if (haveMoney && dontHavemoney) {
            System.out.println("You got money");
        } else if (haveMoney || !dontHavemoney) {
            System.out.println("You don't have money, but I have");
        } else  {
            System.out.println("Stay at home");
        }

        String message = (haveMoney) ? "your rich " : "Stay at home bro";
        System.out.println(message);

        if (haveMoney) {
            System.out.println("your rich");
        } else {
            System.out.println("Stay at home bro");
        }



    }
}
