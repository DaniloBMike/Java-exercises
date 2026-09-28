package exerciseOPP.Constructor2;

public class MotorcycleBase {

    //Attributes

    String model;
    int year;
    double mileage;

    //Constructor

    public MotorcycleBase(String model, int year, double mileage) {
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }

    public boolean needsRevision() {
        if(mileage >= 3000.0) {
            return true;
        }
        else {
            return false;
        }
    }

    public int age() {
        return 2026 - year;
    }

    public void showStatus() {
        System.out.println( "Model: " + model + " Year:" + year + " Mileage:" + mileage + " Fabrication years old: " + age());

        if(needsRevision()) {
            System.out.println("Time for maintenance!");
        }
        else {
            System.out.println("No maintenance needed yet!");
        }
    }



}