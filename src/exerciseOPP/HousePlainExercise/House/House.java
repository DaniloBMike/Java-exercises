package exerciseOPP.HousePlainExercise.House;

public class House {
   public static void main (String[] args) {



        //Creating the object exerciseOPP.HousePlainExercise.House.house

        HousePlan house = new HousePlan();

        house.kitchen = true;
        house.roomQuantity = 3;
        house.bathroomQuantity = 2;
        house.garageSpace = 2;
        house.houseSize = 150;
        house.material = "block";
        house.backyard = true;
        house.restroom = 1;
        house.outsideColor = "light blue and green";
        house.insideColor = "light blue and white";

        house.buildingHouse();

        house.paintingHouse();

        house.changeColor("Red, white and black" );

        house.newHouseSize(250);


        int result = house.multiplaySize();
        System.out.println("The total size of the house and the quantity of the bedroom and bathroom is : " + result);


        house.changeParameters(" Vanessa", 400, 4, 1, 1 );



   }


}