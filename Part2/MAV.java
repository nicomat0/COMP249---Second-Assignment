// ----------------------------------------------------
// Part: 2
// Written by: Younes Bouhaba ID 40205816 & Mateo Nieto Galindo 40192918
// ----------------------------------------------------
package Part2;

public class MAV extends UAV {

    private String model;
    private double size;
    /**
	 * 
	 * @author Mateo & Younes 
	 * This is the quadcopter class. Derived from the Helicopter class
	 *
	 */
    
    /**
     * This is a default constructor
     * 
     */
    public MAV ()
    {
        super();
        System.out.println("Creating an MAV object using default constructor..");
        model = "Hummingbird";
        size = 5;
    }
    /**
     * This is a copy constructor
     * @param takes a mav object
     * 
     */
    public MAV (MAV mav)
    {
        super(mav);
        System.out.println("Creating an MAV object using copy constructor..");
        model = mav.model;
        size = mav.size;
    }
    /**
     * This is a parameterized constructor
     * @param takes the weight, price, model and size as parameters
     */
    public MAV (double wgt, double pr, String mdl, double sz)
    {
        super (wgt, pr);

        System.out.println("Creating an MAV object using parameterized constructor..");

        model = mdl;
        size = sz;

    }
    /**
     * this is an accessor
     * @return returns the model
     * 
     */
    public String getModel()
    {
        return model;
    }
    /**
     * this is an accessor
     * @return returns the size
     * 
     */
    public double getSize()
    {
        return size;
    }
    /**
     * this is a mutator and sets the model
     * 
     */
    public void setModel (String mdl)
    {
        model = mdl;
    }
    /**
     * this is a mutator and sets the size
     * 
     */
    public void setSize (double sz)
    {
        size = sz;
    }
    /**
     * this is a toString method, returns a string
     * @return returns a string
     */
    public String toString ()
    {
        return "The weight of this UAV is: " + weight + "\nThe price of this UAV is: " + price + "\nThe model of this MAV is: " + model + "\nThe size of this MAV is: " + size + "\n";
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
            MAV mav = (MAV)obj;
            return (model.equals(mav.model) && this.size == mav.size && price == mav.price && this.weight == mav.weight);
        }

    }
}

