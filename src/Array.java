public class Array {
    public static void main(String[] args) {

        //Array Declaration

        //Two types of array initialization
        int[] numbers = {20,39,15,55,9};
        String[] names;

        names = new String[] {"Danilo","Vanessa","Silvana"};

        double[] salary = new double[5];
        salary[3] = 900.00;
        salary[2] = 200.00;
        salary[1] = 300.00;
        salary[0] = 700.00;
        salary[4] = 400.00;

        //Interaction with for

        for (int position = 3; position < salary.length; position++) {
            System.out.println(salary[position]);
        }

        for (double income : salary) {
            System.out.println(income);
        }

        salary[4] = 650.00;
        System.out.println(salary[4]);
    }
}