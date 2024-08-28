package fatimaSolutions.rectSeg;

public class Rectangle {
    private int x, y;
    private int hauteur, largeur;

    public Rectangle(int x, int y, int hauteur, int largeur) {
        this.x = x;
        this.y = y;
        this.hauteur = hauteur;
        this.largeur = largeur;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getHauteur() {
        return hauteur;
    }

    public int getLargeur() {
        return largeur;
    }

    public void setRectangle(int x, int y, int hauteur, int largeur) {
        this.x = x;
        this.y = y;
        this.hauteur = hauteur;
        this.largeur = largeur;
    }

    public void translate(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    public void translateX(int dx) {
        this.x += dx;
    }

    public void translateY(int dy) {
        this.y += dy;
    }

    public boolean contient(int x, int y) {
        return ((this.x <= x && x <= this.x + this.largeur) && (this.y <= y && y >= this.y - this.hauteur));
    }

    public String toString() {
        return "Rectangle[x = " + x + ", y = " + y + ", hauteur = " + hauteur + ", largeur = " + largeur + "]";
    }
   
    public String equals(Rectangle r) {
        return ((this.x == r.x && this.y == r.y && this.hauteur == r.hauteur && this.largeur == r.largeur) ? "Les deux rectangles sont égaux" : "Les deux rectangles ne sont pas égaux");
    }

    public Rectangle clone() {
        return new Rectangle(this.x, this.y, this.hauteur, this.largeur);
    }
}
