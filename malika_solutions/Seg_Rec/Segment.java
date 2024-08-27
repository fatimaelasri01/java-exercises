package malika_solutions;


public class Segment {
    //Attributes
    double x1;
    double y1;
    double x2;
    double y2;
    //Constructor
    Segment (double x1, double y1, double x2, double y2) 
    {
        setX1(x1);
        setY1(y1);
        setX2(x2);
        setY2(y2);
    }
    // Translation
    public void Translate(double dx, double dy)
    {
        setX1(x1 + dx);
        setY1(y1 + dy);
        setX2(x2 + dx);
        setY2(y2 + dy);
    }
    //ToString
    public String ToString()
    {
        String ch = "Point de depart : ("+this.getX1()+", "+this.getY1()+")\nPoint d'arrivee : ("+this.getX2()+", "+this.getY2()+")";
        return ch;
    }
    //Clone
    public Segment Clone()
    {
        Segment x = new Segment(this.x1, this.y1, this.x2, this.y2);
        //setX1(x.x1);
        //setY1(x.y1);
        //setX2(x.x2);
        //setY2(x.y2);
        return x;
    }
    //Equals
    public boolean Equals(Segment x)
    {
        return (x.x1 == this.x1 && x.y1 == this.y1 && x.x2 == this.x2 && x.y2 == this.y2);
    }
    //Getters
    public double getX1()
    {
        return this.x1;
    }
    public double getY1()
    {
        return this.y1;
    }
    public double getX2()
    {
        return this.x2;
    }
    public double getY2()
    {
        return this.y2;
    }//Setters
    public void setX1(double x1)
    {
        this.x1 = x1;
    }
    public void setY1(double y1)
    {
        this.y1 = y1;
    }
    public void setX2(double x2)
    {
        this.x2 = x2;
    }
    public void setY2(double y2)
    {
        this.y2 = y2;
    }
}
