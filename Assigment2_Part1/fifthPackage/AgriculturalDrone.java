// ----------------------------------------------------
// Part: 1
// Written by: Younes Bouhaba ID 40205816 & Mateo Nieto Galindo 40192918
// ----------------------------------------------------
package fifthPackage;
import fourthPackage.UAV;

public class AgriculturalDrone extends UAV {

	/**
	 * 
	 * @author Mateo & Jounes 
	 * This is the quadcopter class. Derived from the Helicopter class
	 *
	 */
    private String brand;
    private int carryCapacity;
    /**
     * This is a default constructor
     * 
     */
    public AgriculturalDrone ()
    {
        super();
        System.out.println("Creating an AgriculturalDrone object using default constructor..");
        brand = "Trimble";
        carryCapacity = 2;
    }
    /**
     * This is a copy constructor
     * @param takes a agricultural drone object
     * 
     */
    public AgriculturalDrone (AgriculturalDrone ad)
    {
        super(ad);
        System.out.println("Creating an AgriculturalDrone object using copy constructor..");
        brand = ad.brand;
        carryCapacity = ad.carryCapacity;
    }
    /**
     * This is a parameterized constructor
     * @param takes the weight, price, brand and carry capacity as parameters
     */
    public AgriculturalDrone (double wgt, double pr, String br, int cc)
    {
        super (wgt, pr);

        System.out.println("Creating an AgriculturalDrone object using parameterized constructor..");

        brand = br;
        carryCapacity = cc;

    }
    /**
     * this is an accessor
     * @return returns the brand
     * 
     */
    public String getBrand()
    {
        return brand;
    }
    /**
     * this is an accessor
     * @return returns the carry capacity
     * 
     */
    public int getCarryCapacity()
    {
        return carryCapacity;
    }
    /**
     * this is a mutator and sets the brand
     * 
     */
    public void setBrand (String br)
    {
        brand = br;
    }
    /**
     * this is a mutator and sets the carry capacity
     * 
     */
    public void setCarryCapacity (int cc)
    {
        carryCapacity = cc;
    }
    /**
     * this is a toString method, returns a string
     * @return returns a string
     */
    public String toString()
    {
        return "The weight of this Agricultural Drone is: " + weight + "\nThe price of this Agricultural Drone is: " + price + "\nThe brand of this Agricultural Drone is: " + brand + "\nThe Carry Capacity of this Agricultural Drone is: " + carryCapacity + "\n";
    }
    /**
     * this is an equals method that returns a boolean
     * @return boolean return
     * @param takes an object of type object as a parameter 
     * 
     */
    public boolean equals(Object obj)
    {
        if (obj == null || this.getClass() != obj.getClass())
        {
            return false;
        }
        else
        {
            AgriculturalDrone ad = (AgriculturalDrone)obj;
            return (this.brand.equals(ad.brand) && this.carryCapacity == ad.carryCapacity && this.price == ad.price && this.weight == ad.weight);
        }

    }
}
