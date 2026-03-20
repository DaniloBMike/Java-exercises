public class whileloop {
    public static void main (String[] args) {

            //while structure

            int number = 10;

            while (number<=100) {
                System.out.println("The number is " + number);
                number++;
            }

            //Do while structure

        do {
            System.out.println("Number = " + number);
            number++;
            }
        while (number <=15);

           // For structure

           for(int numero = 0; numero < 10; numero+=3) {
               System.out.println("Numbers : " + numero);
           }

        int x = 10;

        while (x > 0) {
            if (x == 5) {
                x--;
                continue;
            }
            System.out.println(x);
            x--;
        }

    }
    }