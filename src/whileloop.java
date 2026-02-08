public class whileloop {
    public static void main (String[] args) {



               int number = 100;

        while (number <=10) {
            System.out.println("The number is: " + number);
            number--;
        }


        do {
            System.out.println("Number = " + number);
            number++;
            }
        while (number <=15);

            for (;number >=10; number--){
                System.out.println("number : " + number);
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