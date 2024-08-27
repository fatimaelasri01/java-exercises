package fExercises.rectSeg;

public class Segment {
    int x1, y1, x2, y2;
    public Segment (int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public int getX1() {
        return this.x1;
    }

    public int getX2() {
        return this.x2;
    }

    public int getY1() {
        return this.y1;
    }

    public int getY2() {
        return this.y2;
    }

    public void setSegment(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public void translate(int dx, int dy) {
        this.x1 += dx;
        this.y1 += dy; 
        this.x2 += dx;
        this.y2 += dy;
    }

    public void translateX(int dx) {
        this.x1 += dx;
        this.x2 += dx;
    }

    public void translateY(int dy) {
        this.y1 += dy;
        this.y2 += dy;
    }

    public String toString() {
        return "Segment[x1 = " + x1 + ", y1 = " + y1 + ", x2 = " + x2 + ", y2 = " + y2 + "]";
    }

    public String equals(Segment s) {
        return ((this.x1 == s.x1 && this.y1 == s.y1 && this.x2 == s.x2 && this.y2 == s.y2) ? "Les deux segments sont égaux" : "Les deux segments ne sont pas égaux");
    }

    public Segment clone() {
        return new Segment(this.x1, this.y1, this.x2, this.y2);
    }
}
