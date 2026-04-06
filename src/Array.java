public class Array {
    public static void main (String[] args) {

        //Ways of initialization, Arrays

        //Initialization in line

        int [] name = {10,34,84,82,675};

        String[] fruts = {"banana","aple","orange"};


        //Initialization after and add "new type" like String, int, double.

        String[] nameFamily;
        nameFamily = new String[] {"Danilo","Vanessa","Silvana"};

        //Another way of initialization

        double [] salaryIncome = new double [7];

        salaryIncome[0] = 700.00;
        salaryIncome[5] = 800.00;
        salaryIncome[6] = 900.00;
        salaryIncome[2] = 100.00;
        salaryIncome[1] = 400.00;
        salaryIncome[4] = 200.00;
        salaryIncome[3] = 600.00;


        for ( int number = 0; number < salaryIncome.length; number ++ ) {
            System.out.println(salaryIncome[number] = salaryIncome[number] + 1000);
        }

        for ( double salary : salaryIncome) {
            System.out.println(salary);
        }



    }
}