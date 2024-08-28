package fatimaSolutions.rectSeg;

public class Main {
    public static void main(String[] args)
    {
        Segment s1 = new Segment(2, 3, 7, 3);
        Segment s2 = new Segment(3, 2, 5, 1);
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s1.equals(s2));

        System.out.println("--------------------------------------------------------");

        s1.translate(1, 2);
        System.out.println(s1.toString());

        s2.translateX(-2);
        System.out.println(s2.toString());

        System.out.println("--------------------------------------------------------");

        s1.setSegment(1, 2, 3, 1);
        System.out.println(s1.toString());
        System.out.println(s1.equals(s2));

        System.out.println("--------------------------------------------------------");

        Segment s3 = s1.clone();
        System.out.println(s3.toString());
        System.out.println(s1.equals(s3));

        System.out.println("--------------------------------------------------------");

        System.out.println(s1.getX1());
        System.out.println(s1.getX2());
        System.out.println(s1.getY1());
        System.out.println(s1.getY2());

        System.out.println("_______________________________________________________________________________________");
        System.out.println();

        Rectangle r1 = new Rectangle(2, 3, 4, 7);
        Rectangle r2 = new Rectangle(3, 5, 3, 5);
        System.out.println(r1.toString());
        System.out.println(r2.toString());
        System.out.println(r1.equals(r2));

        System.out.println("--------------------------------------------------------");

        r1.translate(1, 2);
        System.out.println(r1.toString());
        System.out.println(r1.equals(r2));

        System.out.println("--------------------------------------------------------");
        Rectangle r3 = r2.clone();
        System.out.println(r3.toString());
        System.out.println(r2.equals(r3));

        System.out.println("--------------------------------------------------------");

        r2.setRectangle(6, 2, 5, 8);
        System.out.println(r2.toString());
        System.out.println(r2.equals(r3));
        System.out.println(r3.toString());

        System.out.println("--------------------------------------------------------");

        System.out.println("Le point (4, 5) est-il dans le rectangle r3 ? " + r3.contient(6, 8));
        System.out.println("Le point (4, 1) est-il dans le rectangle r2 ? " + r2.contient(4, 1));
        System.out.println("Le point (7, 5) est-il dans le rectangle r1 ? " + r1.contient(7, 5));

        System.out.println("--------------------------------------------------------");

        System.out.println(r1.getX());
        System.out.println(r1.getY());
        System.out.println(r1.getHauteur());
        System.out.println(r1.getLargeur());
    }
}
