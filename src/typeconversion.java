public class typeconversion {
    public static void main (String[] args){

        int number = 15;
        double change = number;

        double changeAgain = 50.50;
        int othernumber = (int) changeAgain;

        System.out.println(change);
        System.out.println(othernumber);

        Integer numero = 30;
        String changenumber = numero.toString();

        System.out.println(numero + " " + changenumber);

        String numero2 = "90";
        Integer number2 = Integer.parseInt(numero2);

        System.out.println( numero2 + " " + number2);
    }
}