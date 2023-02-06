// ----------------------------------------------------
// Part: 1
// Written by: Younes Bouhaba ID 40205816 & Mateo Nieto Galindo 40192918
// ----------------------------------------------------
package firstPackage;
/**
 * 
 * @author Mateo & Jounes 
 * This is the quadcopter class. Derived from the Helicopter class
 *
 */
public class Airplane extends FlyingObjects {

    protected String brand;
    protected double price;
    protected int horsePower;
    /**
     * This is a default constructor
     * 
     */
    public Airplane ()
    {
        System.out.println("Creating an Airplane object using default constructor..");

        brand = "Airbus";
        price = 9000000;
        horsePower = 30000;
    }
    /**
     * This is a copy constructor
     * @param takes an airplane object
     * 
     */
    public Airplane (Airplane ap)
    {
        System.out.println("Creating an Airplane object using copy constructor..");

        brand = ap.brand;
        price = ap.price;
        horsePower = ap.horsePower;
    }
    /**
     * This is a parameterized constructor
     * @param takes the brand, price and horsepower parameters
     */
    public Airplane (String br, double pr, int hp)
    {
        System.out.println("Creating an Airplane object using parameterized constructor..");

        brand = br;
        price = pr;
        horsePower = hp;
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
     * @return returns the price
     * 
     */
    public double getPrice()
    {
        return price;
    }
    /**
     * this is an accessor
     * @return returns the horsepower
     * 
     */
    public int getHorsePower()
    {
        return horsePower;
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
            Airplane ap = (Airplane)obj;
            return (brand.equals(ap.brand) && price == ap.price && horsePower == ap.horsePower);
        }

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
     * this is a mutator and sets the price
     * 
     */
    public void setPrice (double pr)
    {
        price = pr;
    }
    /**
     * this is a mutator and sets the horsepower
     * 
     */
    public void setHorsePower (int hp)
    {
        horsePower = hp;
    }
    /**
     * this is a toString method, returns a string
     * @return returns a string
     */
    public String toString ()
    {
        return "The brand of this Airplane is: " + brand + "\nThe price of this Airplane is: " + price + "\nThe horse power of this Airplane is: " + horsePower + "\n";
    }
}
