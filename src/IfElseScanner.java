import java.util.Scanner;

public class IfElseScanner {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Your age is greater than 18?");
        int age = scanner.nextInt();

        if (age >= 18){
          System.out.println("Adult");
        }
        else {
            System.out.println("Minor");
        }

        scanner.close();

    }
}