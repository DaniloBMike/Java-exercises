package exerciseOPP.HousePlainExercise.House;

public class HousePlan implements HouseBuilding {

    //Attributes

    public String ownerName;
    public int houseSize;
    public int roomQuantity;
    public int bathroomQuantity;
    public String insideColor;
    public String outsideColor;
    public String material;
    public int restroom;
    public boolean backyard;
    public int garageSpace;
    public boolean kitchen;


    public void changeParameters ( String newOwnerName, int newSize, int newRoomQuantity, int newBathroomQuantity, int newGarage) {

        ownerName = newOwnerName;
        houseSize = newSize;
        roomQuantity = newRoomQuantity;
        bathroomQuantity = newBathroomQuantity;
        garageSpace = newGarage;
        buildingHouse();

    }

    public void changingParameters2 ( String newOwnerName2, int newHouseSize2, int newRoomQuantity2, int newBathRoomQuantity2, int newGarage2) {

        ownerName = newOwnerName2;
        houseSize = newHouseSize2;
        roomQuantity = newRoomQuantity2;
        bathroomQuantity = newBathRoomQuantity2;
        garageSpace = newGarage2;
        buildingHouse();

    }

    //Method

    //(@override é annotation)

    @Override
    public void buildingHouse(){

        System.out.println(" The owner Name is : " + ownerName);
        System.out.println(" The total size of the plainhouse.house is : " + houseSize);
        System.out.println(" The room quantity is : " + roomQuantity);
        System.out.println(" The bathroom quantity is : " + bathroomQuantity);
        System.out.println(" The material used is : " + material);
        System.out.println(" The quantity of restroom is : " + restroom);
        System.out.println(" The quantity of backyard is : " + backyard);
        System.out.println(" How many spaces there are at the garage? " + garageSpace);
        System.out.println(" There are kitchen in the house? " + kitchen);


    }



    @Override
    public void paintingHouse() {
        System.out.println(" The color inside of the house is : " + insideColor);
        System.out.println(" The color outside of the house is : " + outsideColor);
    }

    public void changeColor(String newColor) {

        insideColor = newColor;
        outsideColor = newColor;
        paintingHouse();
    }

    public void changingColor2 ( String newHouseColor2) {

        insideColor = newHouseColor2;
        outsideColor = newHouseColor2;
        paintingHouse();
    }

    public void newHouseSize(int newSize) {

        houseSize = newSize;
        buildingHouse();

    }

    public int multiplaySize (){return houseSize * roomQuantity * bathroomQuantity;
    }

    public int multiplyingAllParameters ( ) {
        return houseSize * roomQuantity * garageSpace * bathroomQuantity;
    }

    public String nameElements () {
        return ownerName + " " + insideColor + " " + outsideColor + " " + material ;
    }

    @Override
    public int multiplaySize (int multiplaySizer) {
        return 0;
    }


    }






