package exerciseOPP.Constructor4;

public class ParkingClients {
    public static void main(String[] args) {


        //Clients Objets

        ParkingTicket client01 = new ParkingTicket("LUSS-0B97 ",5.0);

        client01.addHours(7.0);
        client01.printHoursMarket();
        client01.showRecept();

        ParkingTicket client02 = new ParkingTicket("SG0S-0j66 ",5.0);

        client02.addHours(4.0);
        client02.printHoursMarket();
        client02.showRecept();


    }
}
