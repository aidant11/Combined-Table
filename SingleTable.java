public class SingleTable 
{
    private int seats;
    private double viewQuality;
    private int height;
    public SingleTable(int s, double v, int h)
    {
        seats = s;
        viewQuality = v;
        height = h;
    }
    
    public int getNumSeats() 
    {
        return seats;
    }

    public int getHeight() 
    {
        return height;
    }
 
    public double getViewQuality() 
    {
        return viewQuality;
    }

    


    /** Sets the quality of the view from this table to value . */
    //public void setViewQuality(double value) {}
        /* implementation not shown */ 
    }
    // There may be instance variables, constructors, and methods that are not
    // shown.

