package exerciseOPP.Constructor;

public class Employee01 {
    public static void main(String[] args){

        //Danilo Employee
        Employeebase Employee01 = new Employeebase("Danilo", 30, 50.000,6, 25);

        //Victor Employee
        Employeebase Employee02 = new Employeebase("Victor", 25, 30.000, 8, 30);

        Employee01.allElements();
        Employee02.allElements();

        Employee01.hoursMonthlyWorked();
        Employee02.hoursMonthlyWorked();
    }
}
