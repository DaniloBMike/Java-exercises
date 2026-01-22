public class ifelsestructure {
    public static void main (String[] args) {

        int john = 75;
        int maria = 80;
        int evelyn = 67;
        int danilo = 100;

        boolean gradepass = true;

        if (john <= 50) {
            System.out.println("Denial");
        }
        else if (john <= 70){
            System.out.println("Final test");
        }
        else {
            System.out.println("Pass");
        }
    }
}
