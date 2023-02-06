// ----------------------------------------------------
// Part: 1
// Written by: Younes Bouhaba ID 40205816 & Mateo Nieto Galindo 40192918
// ----------------------------------------------------
package secondPackage;
import firstPackage.*;
public class Helicopter extends Airplane{
	/**
	 * 
	 * @author Mateo & Jounes 
	 * This is the quadcopter class. Derived from the Helicopter class
	 *
	 */
    protected int numberOfCylinders;
    protected int creationYear;
    protected int passengerCapacity;
    
    /**
     * This is a default constructor
     * 
     */
    public Helicopter() {
        super();
        System.out.println("Creating a Helicopter object using default constructor..");
        this.numberOfCylinders = 4;
        this.creationYear = 2002;
        this.passengerCapacity = 5;
    }
    /**
     * This is a copy constructor
     * @param takes a helicopter object
     * 
     */
    public Helicopter(Helicopter hp) {
        super(hp);
        System.out.println("Creating a Helicopter object using copy constructor..");
        this.numberOfCylinders = hp.numberOfCylinders;
        this.creationYear = hp.creationYear;
        this.passengerCapacity = hp.passengerCapacity;
    }
    /**
     * This is a parameterized constructor
     * @param takes many parameters such as the brand, price, horsepower, numberofcylinders, creation year, price.
     */
    public Helicopter(String br, double pr, int hp, int noc, int cy, int pc) {
        super(br, pr, hp);
        System.out.println("Creating a Helicopter object using parameterized constructor..");
        this.numberOfCylinders = noc;
        this.creationYear = cy;
        this.passengerCapacity = pc;
    }
    /**
     * this returns the maximum flying speed because it is an accessor
     * @return returns number of cylinders
     * 
     */
    public int getNumberOfCylinders() {
        return this.numberOfCylinders;
    }
    /**
     * this returns the maximum flying speed because it is an accessor
     * @return returns creation year
     * 
     */
    public int getCreationYear() {
        return this.creationYear;
    }
    /**
     * this returns the maximum flying speed because it is an accessor
     * @return returns passenger capacity
     * 
     */
    public int getPassengerCapacity() {
        return this.passengerCapacity;
    }
    /**
     * this is a mutator and sets the number of cylinders
     * 
     */
    public void setNumberOfCylinders(int noc) {
        this.numberOfCylinders = noc;
    }
    /**
     * this is a mutator and sets the number of cylinders
     * 
     */
    public void setCreationYear(int yr) {
        this.creationYear = yr;
    }
    /**
     * this is a mutator and sets the number of cylinders
     * 
     */
    public void setPassengerCapacity(int pc) {
        this.passengerCapacity = pc;
    }
    /**
     * this is a tostring method
     * @return returns a string
     * 
     */
    public String toString() {
        return "The brand of this helicopter is " + this.brand + "\nThe price of this helicopter is: " + this.price + "\nThe horse power of this Helicopter is: " + this.horsePower + "\nThe helicopter's number of cylinders is " + this.numberOfCylinders + "\nThis helicopter was created in the year: " + this.creationYear + "\nThis helicopter's passenger capacity is " + this.passengerCapacity + "\n";
    }
    /**
     * this is an equals method that returns a boolean
     * @return boolean return
     * @param takes an object of type object as a parameter 
     * 
     */
    public boolean equals(Object obj) {
        if (obj != null && this.getClass() == obj.getClass()) {
            Helicopter hp = (Helicopter)obj;
            return this.creationYear == hp.creationYear && this.numberOfCylinders == hp.numberOfCylinders && this.passengerCapacity == hp.passengerCapacity && this.brand.equals(hp.brand) && this.price == hp.price && this.horsePower == hp.horsePower;
        } else {
            return false;
        }
    }
}
