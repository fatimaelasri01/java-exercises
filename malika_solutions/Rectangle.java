package malika_solutions;


public class Rectangle {
    // Attributes
    private double x1;
    private double y1;
    private double width;
    private double height;
    //Constructor
    Rectangle (double x1, double y1, double width, double height)
    {
        setX1(x1);
        setY1(y1);
        setWidth(width);
        setHeight(height);
    }
    //Translation
    public void Translate (double dx, double dy)
    {
        setX1(x1 + dx);
        setY1(y1 + dy);
    }
    //ToString
    public String ToString ()
    {
        String ch = "Point haut de coin gauche : ("+this.getX1()+", "+this.getY1()+")\nWidth : "+this.getWidth()+"\nHeight : "+this.getHeight();
        return ch;
    }
    //Clone
    public Rectangle Clone ()
    {
        Rectangle x = new Rectangle(this.x1, this.y1, this.width, this.height);
        return x;
    }
    //Equals
    public boolean Equals (Rectangle x)
    {
        return (x.x1 == this.x1 && x.y1 == this.y1 && x.width == this.width && x.height == this.height);
    }
    //isExist
    public boolean IsExist (double x, double y)
    {
        return (x >= this.x1 && x <= this.x1 + width && y <= this.y1);
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
    public double getWidth()
    {
        return this.width;
    }
    public double getHeight()
    {
        return this.height;
    }
    //Setters
    public void setX1(double x1)
    {
        this.x1 = x1;
    }
    public void setY1(double y1)
    {
        this.y1 = y1;
    }
    public void setWidth(double width)
    {
        this.width = width;
    }
    public void setHeight(double height)
    {
        this.height = height;
    }
}
