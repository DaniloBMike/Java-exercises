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

        double[] salary = new double[7];
        salary[1] = 500.00;
        salary[3] = 600.00;
        salary[6] = 900.00;
        salary[2] = 550.00;
        salary[0] = 100.00;
        salary[5] = 1000.00;
        salary[4] = 750.00;

        for (int position = 0; position< salary.length; position++) {
            System.out.println(salary[position]);
        }

    }
}