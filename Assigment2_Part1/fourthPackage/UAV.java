// ----------------------------------------------------
// Part: 1
// Written by: Younes Bouhaba ID 40205816 & Mateo Nieto Galindo 40192918
// ----------------------------------------------------
package fourthPackage;

import firstPackage.FlyingObjects;
/**
 * 
 * @author Mateo & Jounes 
 * This is the quadcopter class. Derived from the Helicopter class
 *
 */
public class UAV extends FlyingObjects {

    protected double weight;
    protected double price;
    /**
     * This is a default constructor
     * 
     */
    public UAV ()
    {
        System.out.println("Creating an UAV object using default constructor..");
        weight = 150;
        price = 10000;
    }
    /**
     * This is a copy constructor
     * @param takes a UAV object
     * 
     */
    public UAV (UAV uav)
    {
        System.out.println("Creating an UAV object using copy constructor..");
        weight = uav.weight;
        price = uav.price;
    }
    /**
     * This is a parameterized constructor
     * @param takes the weight and price parameters
     */
    public UAV (double wgt, double pr)
    {

        System.out.println("Creating an UAV object using parameterized constructor..");

        weight = wgt;
        price = pr;

    }
    /**
     * this is an accessor
     * @return returns the weight
     * 
     */
    public double getWeight()
    {
        return weight;
    }
    /**
     * this is an accessor
     * @return returns the price
     * 
     */
    public double getPrice()
    {
        return price;
    }
    /**
     * this is a mutator and sets the weight
     * 
     */
    public void setWeight (double wgt)
    {
        weight = wgt;
    }
    /**
     * this is a mutator and sets the price
     * 
     */
    public void setPrice (double pr)
    {
        price = pr;
    }
    /**
     * this is a toString method, returns a string
     * @return returns a string
     */
    public String toString()
    {
        return "The weight of this UAV is: " + weight + "\nThe price of this UAV is: " + price + "\n";
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
            UAV uav = (UAV)obj;
            return (price == uav.price && weight == uav.weight);
        }

    }
}
