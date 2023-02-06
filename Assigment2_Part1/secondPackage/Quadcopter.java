// ----------------------------------------------------
// Part: 1
// Written by: Younes Bouhaba ID 40205816 & Mateo Nieto Galindo 40192918
// ----------------------------------------------------
package secondPackage;
/**
 * 
 * @author Mateo & Jounes 
 * This is the quadcopter class. Derived from the Helicopter class
 *
 */
public class Quadcopter extends Helicopter {

    private int maxFlyingSpeed;

    /**
     * This is a default constructor
     * 
     */
    public Quadcopter ()
    {
        super();
        System.out.println("Creating a Quadcopter object using default constructor..");
        maxFlyingSpeed = 262;
    }
    /**
     * This is a copy constructor
     * @param takes a quadcopter object
     * 
     */
    public Quadcopter (Quadcopter qp)
    {
        super(qp);
        System.out.println("Creating an Quadcopter object using copy constructor..");
        maxFlyingSpeed = qp.maxFlyingSpeed;
    }

    /**
     * This is a parameterized constructor
     * @param takes many parameters such as the brand, price, horsepower, numberofcylinders, creation year, price, and max flying speed
     */
    public Quadcopter (String br, double pr, int hp, int noc, int cy, int pc, int mfs)
    {
        super (br, pr, hp, noc, cy, pc);

        System.out.println("Creating an Quadcopter object using parameterized constructor..");

        maxFlyingSpeed = mfs;

    }
    /**
     * this returns the maximum flying speed
     * @return returns max flying speed
     * 
     */
    public int getMaxFlyingSpeed()
    {
        return maxFlyingSpeed;
    }
    /**
     * this sets the max flying speed
     * 
     */
    public void setMaxFlyingSpeed(int mfs)
    {
        maxFlyingSpeed = mfs;
    }
    /**
     * this uses toString method to return a string
     * @return returns a string 
     * 
     */
    public String toString ()
    {
        return "The brand of this Quadcopter is: " + brand + "\nThe price of this Quadcopter is: " + price + "\nThe horse power of this Quadcopter is: " + horsePower + "\nThe Quadcopter's number of cylinders is " + numberOfCylinders + "\nThis Quadcopter was created in the year: " + creationYear + "\nThis Quadcopter's passenger capacity is " + passengerCapacity + "\nThe maximum flying speed of this quadcopter is: " + maxFlyingSpeed + "\n";
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
            Quadcopter qp = (Quadcopter)obj;
            return (this.maxFlyingSpeed == qp.maxFlyingSpeed && this.creationYear == qp.creationYear && this.passengerCapacity == qp.passengerCapacity &&
                    this.numberOfCylinders == qp.numberOfCylinders && this.brand.equals(qp.brand) && this.horsePower == qp.horsePower && this.price == qp.price);
        }

    }
}
