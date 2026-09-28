package exerciseOPP.Constructor4;

public class ParkingTicket {

    //Attributes

    String vehiclePlate;
    double hoursParked;
    double hourlyRate;

    //Constructor

    public ParkingTicket(String vehiclePlate, double hoursParked, double hourlyRate) {

        this.vehiclePlate = vehiclePlate;
        this.hourlyRate = hourlyRate;
        this.hoursParked = 0.0;

    }

    //Methods

    public void addHours(double hours) {

        hoursParked = hoursParked + hours;

    }

    public double hoursFee() {

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


    




}
