package exerciseOPP.Constructor;

public class Employeebase {

        //Attributes

        String name;
        int age;
        double salary;
        int hoursDayWorked;
        int hourWeekWorked;

        //Constructor

        public Employeebase(String name, int age, double salary, int hoursDayWorked, int hourWeekWorked) {

            this.name = name;
            this.age = age;
            this.salary = salary;
            this.hoursDayWorked = hoursDayWorked;
            this.hourWeekWorked = hourWeekWorked;

            //methods

        }

            public double monthlyHourWorked() {

            return (hoursDayWorked * hourWeekWorked);

            }

            public void allElements() {
            System.out.println( " Employee name: " + name + " Employee age: " + age + " Employee salary: " + salary );
            }

            public void hoursMonthlyWorked() {
            System.out.println(" The employee hours worked in monthly employee salary " + monthlyHourWorked());
            }

}
