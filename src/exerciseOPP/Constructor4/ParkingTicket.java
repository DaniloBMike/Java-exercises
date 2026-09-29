package exerciseOPP.Constructor4;

public class ParkingTicket {

    //Attributes

    String vehiclePlate;
    double hoursParked;
    double hourlyRate;

    //Constructor

    public ParkingTicket(String vehiclePlate, double hourlyRate) {

        this.vehiclePlate = vehiclePlate;
        this.hourlyRate = hourlyRate;
        this.hoursParked = 0.0;

    }

    //Methods

    public void addHours(double hours) {

        hoursParked = hoursParked + hours;

    }

    public double totalFee() {

        return hoursParked * hourlyRate;

    }

    public boolean hasDiscount() {

        if (hoursParked > 5) {
            return true;
        }
        else {
            return false;
        }

    }

    public double finalFee() {

        if (hasDiscount()) {
            return totalFee() * 0.9;
        }
        else { return totalFee();}
    }

    public void printHoursMarket() {

        int hours = (int) hoursParked;

        for (int i = 1; i <= hours; i++) {
            System.out.print("|");
        }
        System.out.println();
    }

    public void showRecept() {

        System.out.println("Your vehicle plate is: " + vehiclePlate + "Hours Parked : " + hoursParked + " Fee to pay = " + finalFee());

        if (hasDiscount()) {
            System.out.println("Discount Applied");
        }
        else {
            System.out.println("Discount not applied");
        }
    }


}
