// ----------------------------------------------------
// Part: 2
// Written by: Younes Bouhaba ID 40205816 & Mateo Nieto Galindo 40192918
// ----------------------------------------------------
package Part2;
public class Main {

/**
 * this is a copy flying object static method that takes an array
 * @param fo
 * @return copiedFO returns the copied array 
 */
    public static FlyingObject[] copyFlyingObjects(FlyingObject[] fo){
        FlyingObject[] copiedFO = new FlyingObject[fo.length];
        for(int i = 0; i < copiedFO.length; i++){
            copiedFO[i] = new FlyingObject(fo[i]);
        }
        return copiedFO;
    }

    /**
     * This is the static method
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Hello, the program will start.\n");
        Airplane airplane1 = new Airplane();
        Airplane airplane2 = new Airplane("Lockheed", 2000000, 28000);
        Airplane airplane3 = new Airplane(airplane2);
        Helicopter helicopter1 = new Helicopter();
        Helicopter helicopter2 = new Helicopter("Boeing", 3000000, 25000, 5, 1998, 6);
        Helicopter helicopter3 = new Helicopter (helicopter2);
        Quadcopter quadcopter1 = new Quadcopter ();
        Quadcopter quadcopter2 = new Quadcopter ("Lockheed", 4000000, 15000, 4, 2000, 5, 250);
        Quadcopter quadcopter3 = new Quadcopter (quadcopter2);
        Multirotor multirotor1 = new Multirotor ();
        Multirotor multirotor2 = new Multirotor ("Blade", 1000000, 20000, 5, 2010, 200, 2);
        Multirotor multirotor3 = new Multirotor (multirotor1);
        UAV uav1 = new UAV();
        AgriculturalDrone agriculturaldrone2 = new AgriculturalDrone (100, 15000, "Airbus", 15);
        MAV mav2 = new MAV (110, 14000, "Boeing", 4);


        FlyingObject [] array1 = new FlyingObject [15];

        array1[0] = airplane1;
        array1[1] = airplane2;
        array1[2] = airplane3;
        array1[3] = helicopter1;
        array1[4] = helicopter2;
        array1[5] = helicopter3;
        array1[6] = quadcopter1;
        array1[7] = quadcopter2;
        array1[8] = quadcopter3;
        array1[9] = multirotor1;
        array1[10] = multirotor2;
        array1[11] = multirotor3;
        array1[12] = uav1;
        array1[13] = agriculturaldrone2;
        array1[14] = mav2;

        FlyingObject[] copiedFlyingObjects = Main.copyFlyingObjects(array1);
        for(int x = 0; x < 15; x++){
            System.out.println();
            System.out.println("This is the information of object number " + (x + 1) + " stored in the original array:");
            System.out.println(array1[x]);
        }

        for (int i = 0; i < 15; i++)
        {
            System.out.println();
            System.out.println("This is the information of object number " + (i + 1) + " stored in the copied array:");
            System.out.println(copiedFlyingObjects[i]);
        }
        System.out.println("\nThe program will be terminated.");
        System.exit(0);
    }


}