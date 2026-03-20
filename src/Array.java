public class Array {
    public static void main (String[] args) {

        //Ways of array initialization

                int [] numbers = {10,9,35,68,99};

                String [] names = {"Danilo","Vanessa","Silvana"};

                String [] fruts;

                fruts = new String [] {"Banana","Maçâ","Manga"};

        double [] monthlySalary = new double[7];

        monthlySalary[1] = 500.00;
        monthlySalary[3] = 900.00;
        monthlySalary[5] = 100.00;
        monthlySalary[0] = 400.00;
        monthlySalary[2] = 700.00;
        monthlySalary[6] = 300.00;
        monthlySalary[4] = 200.00;

        for (int quantity = 0; quantity <monthlySalary.length; quantity++) {
            System.out.println(monthlySalary[quantity]);
        }

    }
}