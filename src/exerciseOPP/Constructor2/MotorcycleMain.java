package exerciseOPP.Constructor2;

public class MotorcycleMain {
    public static void main(String[] args) {

        MotorcycleBase motorcycle01 = new MotorcycleBase("CBR600RR-Honda ",2023,10000.0);
        MotorcycleBase motorcycle02 = new MotorcycleBase("Kawasaki-Zx4 ",2025,2500.0);


    motorcycle01.showStatus();
    motorcycle02.showStatus();

    }
}
