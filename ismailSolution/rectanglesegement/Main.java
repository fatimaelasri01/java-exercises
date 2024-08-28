package ismailSolution.rectanglesegement;

public class Main {
    public static void main(String[] args) {
        Segment segment1 = new Segment(2, 3, 7, 3);
        Segment segment2 = new Segment(3, 2, 5, 1);

        // Displaying the segments and comparing them
        System.out.println(segment1);
        System.out.println(segment2);
        System.out.println("Segments equal? " + segment1.equals(segment2));

        System.out.println("--------------------------------------------------------");

        // Translating the segments and displaying the results
        segment1.translate(1, 2);
        System.out.println(segment1);

        segment2.translateX(-2);
        System.out.println(segment2);

        System.out.println("--------------------------------------------------------");

        // Modifying segment1 and comparing with segment2
        segment1.setSegment(1, 2, 3, 1);
        System.out.println(segment1);
        System.out.println("Segments equal? " + segment1.equals(segment2));

        System.out.println("--------------------------------------------------------");

        // Cloning segment1 and comparing with the original
        Segment segment3 = segment1.clone();
        System.out.println("Cloned segment: " + segment3);
        System.out.println("Original equals cloned? " + segment1.equals(segment3));

        System.out.println("--------------------------------------------------------");

        // Accessing segment1 properties
        System.out.println("Segment1 properties:");
        System.out.println("X1: " + segment1.getX1());
        System.out.println("X2: " + segment1.getX2());
        System.out.println("Y1: " + segment1.getY1());
        System.out.println("Y2: " + segment1.getY2());

        System.out.println("--------------------------------------------------------");

        Rectangle rectangle1 = new Rectangle(2, 3, 4, 7);
        Rectangle rectangle2 = new Rectangle(3, 5, 3, 5);

        // Displaying the rectangles and comparing them
        System.out.println(rectangle1);
        System.out.println(rectangle2);
        System.out.println("Rectangles equal? " + rectangle1.equals(rectangle2));

        System.out.println("--------------------------------------------------------");

        // Translating rectangle1 and comparing with rectangle2
        rectangle1.translate(1, 2);
        System.out.println(rectangle1);
        System.out.println("Rectangles equal? " + rectangle1.equals(rectangle2));

        System.out.println("--------------------------------------------------------");

        // Cloning rectangle2 and comparing with the original
        Rectangle rectangle3 = rectangle2.clone();
        System.out.println("Cloned rectangle: " + rectangle3);
        System.out.println("Original equals cloned? " + rectangle2.equals(rectangle3));

        System.out.println("--------------------------------------------------------");

        // Modifying rectangle2 and comparing with rectangle3
        rectangle2.setRectangle(6, 2, 5, 8);
        System.out.println(rectangle2);
        System.out.println("Rectangle2 equals cloned? " + rectangle2.equals(rectangle3));

        // Checking if specific points are within the rectangles
        System.out.println("Is point (6, 8) inside rectangle3? " + rectangle3.contains(6, 8));
        System.out.println("Is point (4, 1) inside rectangle2? " + rectangle2.contains(4, 1));
        System.out.println("Is point (7, 5) inside rectangle1? " + rectangle1.contains(7, 5));

        System.out.println("--------------------------------------------------------");

        // Accessing rectangle1 properties
        System.out.println("Rectangle1 properties:");
        System.out.println("X: " + rectangle1.getX());
        System.out.println("Y: " + rectangle1.getY());
    }
}
