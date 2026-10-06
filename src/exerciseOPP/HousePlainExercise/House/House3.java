package exerciseOPP.HousePlainExercise.House;

public class House3 implements HouseBuilding {
    public static void main ( String [] args ) {

        HousePlan House3 = new HousePlan();

        House3.houseSize = 300;
        House3.roomQuantity = 3;
        House3.bathroomQuantity = 5;
        House3.insideColor = "Red";
        House3.outsideColor = "black";
        House3.paintingHouse();
        House3.buildingHouse();
        House3.multiplaySize();


    }


    @Override
    public void buildingHouse() {

    }

    @Override
    public int multiplaySize(int multiplaySize) {
        return 0;
    }

    @Override
    public void paintingHouse() {
    }
}
