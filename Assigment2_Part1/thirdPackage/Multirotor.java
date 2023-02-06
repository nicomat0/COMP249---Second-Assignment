// ----------------------------------------------------
// Part: 1
// Written by: Younes Bouhaba ID 40205816 & Mateo Nieto Galindo 40192918
// ----------------------------------------------------
package thirdPackage;
import secondPackage.Helicopter;
/**
 * 
 * @author Mateo & Jounes 
 * This is the multirotor class. Derived from the Helicopter class.
 *
 */
public class Multirotor extends Helicopter {

    private int numberOfRotors;

    /**
     * This is a default constructor
     * 
     */
    public Multirotor ()
    {
        super();
        System.out.println("Creating a Multirotor object using default constructor..");
        numberOfRotors = 4;
    }
    /**
     * This is a copy constructor
     * @param takes a multirotor object
     */
    public Multirotor (Multirotor mt)
    {
        super(mt);
        System.out.println("Creating a Multirotor object using copy constructor..");
        numberOfRotors = mt.numberOfRotors;
    }
    /**
     * This is a paramaterized constructor
     * @param takes a multirotor object
     */
    
    public Multirotor (String br, double pr, int hp, int noc, int cy, int pc, int nor)
    {
        super (br, pr, hp, noc, cy, pc);

        System.out.println("Creating a Multirotor object using parameterized constructor..");

        numberOfRotors = nor;

    }
    /**
     * This is a getter (accessor)
     * @return returns the number of rotors as an integer
     */
    
    public int getNumberOfRotors()
    {
        return numberOfRotors;
    }

    /**
     * This is a setter (mutator)
     * @param this parameter taken is of type int and corresponds to the number of rotors
     */
    
    public void setNumberOfRotors (int nor)
    {
        numberOfRotors = nor;
    }
    /**
     * The toStrig method
     * @return this returns a string
     */
    public String toString ()
    {
        return "The brand of this Multirotor is: " + brand + "\nThe price of this Multirotor is: " + price + "\nThe horse power of this Multirotor is: " + horsePower + "\nThe Multirotor's number of cylinders is " + numberOfCylinders + "\nThis multirotor was created in the year: " + creationYear + "\nThis multirotor's passenger capacity is " + passengerCapacity + "\nThe number of rotors of this multirotor is: " + numberOfRotors + "\n";
    }

    /**
     * This is an equals method
     * @param takes an object as a parameter
     */
    public boolean equals(Object obj)
    {
        if (obj == null || this.getClass() != obj.getClass())
        {
            return false;
        }
        else
        {
            Multirotor mr = (Multirotor)obj;
            return (this.numberOfRotors == mr.numberOfRotors && this.creationYear == mr.creationYear && this.passengerCapacity == mr.passengerCapacity &&
                    this.numberOfCylinders == mr.numberOfCylinders && this.brand.equals(mr.brand) && this.horsePower == mr.horsePower && this.price == mr.price);
        }

    }
}

