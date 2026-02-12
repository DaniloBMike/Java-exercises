public class Array {
    public static void main (String[] args) {

        //Array declaration and initialization

        //2 types of Array initialization

        int[] number = {10,20,85,5,64};
        String[] names = {"Danilo, Vanessa, Silvana"};

        double[] salary = new double[5];
        salary[4] = 300.00;
        salary[3] = 100.00;
        salary[1] = 900.00;
        salary[2] = 700.00;
        salary[0] = 400.00;

        for(int position = 0; position <salary.length; position++) {
            System.out.println(salary[position]);

        }


    }
}