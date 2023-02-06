// ----------------------------------------------------
// Part: 1
// Written by: Younes Bouhaba ID 40205816 & Mateo Nieto Galindo 40192918
// ----------------------------------------------------
package sixthPackage;
import firstPackage.*;
import secondPackage.*;
import thirdPackage.*;
import fifthPackage.*;
import fourthPackage.*;
/**
 * 
 * @author Mateo & Jounes 
 * This is the driver class. 
 *
 */
public class Driver  {
	
	/**
	 * 
	 * static method to find the least and most expensive UAV in an array of flying objects
	 * @param takes an array of flying objects
	 *
	 */
        static void findLeastAndMostExpensiveUAV(FlyingObjects[] array)
        {

            double leastExpensive = 0;
            double mostExpensive = 0;
            int numberOfExistentUAVS = 0;
            int indexOfArray = 0;
            int indexOfArray2 = 0;
            int indexOfArray3 = 0;
            for (int i = 0; i < array.length; i++)
            {
                if (array[i] instanceof UAV)
                {
                    numberOfExistentUAVS++;
                }
            }



                if (numberOfExistentUAVS == 0)
                {
                    System.out.print("This array does not contain any UAV objects\n");
                }
                else if(numberOfExistentUAVS == 1)
                {
                    for (int l = 0; l < array.length; l++)
                    {
                        if (array[l] instanceof UAV)
                        {
                            indexOfArray3 = l;
                        }
                    }
                    System.out.print("There is only one object that is considered the most expensive and the least expensive:\n" + "Here is the information of  that object: \n"
                            + "Object number " + (indexOfArray3 + 1) + ": \n" + array[indexOfArray3]);
                }
                else
                {
                    for (int a = 0; a < array.length; a++)
                    {
                        if (array[a] instanceof UAV)
                        {
                            if (array[a].getPrice() < leastExpensive || leastExpensive == 0)
                            {
                                leastExpensive = array[a].getPrice();
                                indexOfArray = a;
                            }

                            if (array[a] instanceof UAV)
                            {
                                if (array[a].getPrice() > mostExpensive || mostExpensive == 0)
                                {
                                    mostExpensive = array[a].getPrice();
                                    indexOfArray2 = a;
                                }
                            }
                        }

                    }

                System.out.print("The least expensive UAV costs " + leastExpensive + "\nThis is the information of this UAV:\n" + "Object number " + (indexOfArray + 1) + ":\n" +
                        array[indexOfArray] + "\n" );

                System.out.print("The most expensive UAV costs " + mostExpensive + "\nThis is the information of this UAV:\n" + "Object number " + (indexOfArray2 + 1) + ":\n" +
                        array[indexOfArray2] );

            }

                /**
                 * 
                 * this is simply the main method
                 *
                 */
        }
        public static void main(String[] args) {
        	
        	/**
        	 * 
        	 * Here we created many instances from different classes
        	 *
        	 */
            System.out.println("Hello, the program will start.\n");
            Airplane airplane1 = new Airplane();
            System.out.println(airplane1);
            Airplane airplane2 = new Airplane("Lockheed", 2000000, 28000);
            System.out.println(airplane2);
            Airplane airplane3 = new Airplane(airplane2);
            System.out.println(airplane3);
            Helicopter helicopter1 = new Helicopter();
            System.out.println(helicopter1);
            Helicopter helicopter2 = new Helicopter("Boeing", 3000000, 25000, 5, 1998, 6);
            System.out.println(helicopter2);
            Helicopter helicopter3 = new Helicopter (helicopter2);
            System.out.println(helicopter3);
            Quadcopter quadcopter1 = new Quadcopter ();
            System.out.println(quadcopter1);
            Quadcopter quadcopter2 = new Quadcopter ("Lockheed", 4000000, 15000, 4, 2000, 5, 250);
            System.out.println(quadcopter2);
            Quadcopter quadcopter3 = new Quadcopter (quadcopter2);
            System.out.println(quadcopter3);
            Multirotor multirotor1 = new Multirotor ();
            System.out.println(multirotor1);
            Multirotor multirotor2 = new Multirotor ("Blade", 1000000, 20000, 5, 2010, 200, 2);
            System.out.println(multirotor2);
            Multirotor multirotor3 = new Multirotor (multirotor1);
            System.out.println(multirotor3);
            UAV uav1 = new UAV();
            System.out.println(uav1);
            UAV uav2 = new UAV(200, 20000);
            System.out.println(uav2);
            UAV uav3 = new UAV(uav2);
            System.out.println(uav3);
            AgriculturalDrone agriculturaldrone1 = new AgriculturalDrone();
            System.out.println(agriculturaldrone1);
            AgriculturalDrone agriculturaldrone2 = new AgriculturalDrone (100, 15000, "Airbus", 15);
            System.out.println(agriculturaldrone2);
            AgriculturalDrone agriculturaldrone3 = new AgriculturalDrone(agriculturaldrone1);
            System.out.println(agriculturaldrone3);
            MAV mav1 = new MAV ();
            System.out.println(mav1);
            MAV mav2 = new MAV (110, 14000, "Boeing", 4);
            System.out.println(mav2);
            MAV mav3 = new MAV (mav1);
            System.out.println(mav3);

            System.out.print("\n\nLet us test the equality of objects from the different classes: \n\n");

            /**
             * 
             * Here the equality of some objects from different classes or same classes was tested
             *
             */
            if (mav1.equals(uav3) == false)
                System.out.print("MAV mav1 & UAV uav3 are not equal\n");
            else
                System.out.print("MAV mav1 & UAV uav3 are equal\n");

            if (helicopter3.equals(uav2) == false)
                System.out.print("Helicopter helicopter3 & UAV uav2 are not equal\n");
            else
                System.out.print("Helicopter helicopter3 & UAV uav2 are equal\n");

            if (quadcopter2.equals(multirotor1) == false)
                System.out.print("Quadcopter quadcopter2 & Multirotor multirotor1 are not equal\n");
            else
                System.out.print("Quadcopter quadcopter2 & Multirotor multirotor1 are equal\n");

            if (agriculturaldrone2.equals(mav2) == false)
                System.out.print("AgriculturalDrone agriculturaldrone2 & MAV mav2 are not equal\n");
            else
                System.out.print("AgriculturalDrone agriculturaldrone2 & MAV mav2 are equal\n");

            System.out.print("\n\nLet us test the equality of objects from the same class with different values: \n\n");

            if (airplane1.equals(airplane2) == false)
                System.out.print("The two Airplane objects (airplane1 & airplane2) are not equal\n");
            else
                System.out.print("The two Airplane objects (airplane1 & airplane2) are equal\n");

            if (helicopter2.equals(helicopter1) == false)
                System.out.print("The two Helicopter objects (helicopter2 & helicopter1) are not equal\n");
            else
                System.out.print("The two Helicopter objects (helicopter2 & helicopter1) are equal\n");

            if (multirotor2.equals(multirotor3) == false)
                System.out.print("The two Multirotor objects (multirotor2 & multirotor3) are not equal\n");
            else
                System.out.print("The two Multirotor objects (multirotor2 & multirotor3) are equal\n");


            if (agriculturaldrone1.equals(agriculturaldrone2) == false)
                System.out.print("The two AgriculturalDrone objects (agriculturaldrone1 & agriculturaldrone2) are not equal\n");
            else
                System.out.print("The two AgriculturalDrone objects (agriculturaldrone1 & agriculturaldrone2) are equal\n");

            System.out.print("\n\nLet us test the equality of objects from the same class with same values: \n\n");

            if (agriculturaldrone1.equals(agriculturaldrone3) == false)
                System.out.print("The two AgriculturalDrone objects (agriculturaldrone1 & agriculturaldrone3) are not equal\n");
            else
                System.out.print("The two AgriculturalDrone objects (agriculturaldrone1 & agriculturaldrone3) are equal\n");

            if (multirotor1.equals(multirotor3) == false)
                System.out.print("The two Multirotor objects (multirotor1 & multirotor3) are not equal\n");
            else
                System.out.print("The two Multirotor objects (multirotor1 & multirotor3) are equal\n");

            if (helicopter3.equals(helicopter2) == false)
                System.out.print("The two Helicopter objects (helicopter3 & helicopter2) are not equal\n");
            else
                System.out.print("The two Helicopter objects (helicopter3 & helicopter2) are equal\n");

            if (airplane2.equals(airplane3) == false)
                System.out.print("The two Airplane objects (airplane2 & airplane3) are not equal\n");
            else
                System.out.print("The two Airplane objects (airplane2 & airplane3) are equal\n");

            System.out.print("\nCreating an array of objects of size 15...\n");

            FlyingObjects [] array1 = {airplane1,airplane2,airplane3,helicopter1,helicopter2,
                    helicopter3,quadcopter1,quadcopter2,quadcopter3,multirotor1,multirotor2,
                    multirotor3,uav1,agriculturaldrone2,mav2};



            System.out.print("\nCreating an array of objects of size 17...\n\n");

            FlyingObjects [] array2 = {airplane2,multirotor1,helicopter1,multirotor2,
                    quadcopter1,helicopter3,multirotor1,quadcopter2,airplane3,
                    airplane1,quadcopter3,multirotor3,helicopter2,quadcopter3,
                    helicopter1,multirotor1,helicopter3};
            /**
             * 
             * here the static method was invoked and the input was the array we made
             *
             */
            System.out.print("\nSearching the least and most expensive UAV within the first array: \n\n");
            Driver.findLeastAndMostExpensiveUAV(array1);

            System.out.print("\nSearching the least and most expensive UAV within the second array: \n");
            Driver.findLeastAndMostExpensiveUAV(array2);
            System.out.println("\nThe program will be terminated.");
            System.exit(0);
        }
}

