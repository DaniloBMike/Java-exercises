package exerciseOPP.HousePlainExercise.House;

public class House2 {
    public static void main (String[] args){



        //new object created called House2.

        HousePlan house2 = new HousePlan();

        house2.ownerName = "Danilo";
        house2.kitchen = true;
        house2.houseSize = 80;
        house2.bathroomQuantity = 2;
        house2.roomQuantity = 3;
        house2.garageSpace = 2;
        house2.backyard = true;
        house2.material = "block and tijolo";
        house2.restroom = 1;

        //Attributes for colors

        house2.insideColor = "white and sea blue";
        house2.outsideColor = "sea blue";


        house2.buildingHouse();

        house2.paintingHouse();

        house2.buildingHouse();

        int theMultiplyResult = house2.multiplyingAllParameters( );
        System.out.println( " The result of all multiplying parameters is : " + theMultiplyResult );

        String resultNameElements = house2.nameElements();
        System.out.println( " The name of all elements is : " + resultNameElements );

        house2.changingColor2(" Black and Red");

        house2.changingParameters2 (" Silvana " , 160, 2, 1, 3 ); {

        }




    }
}


