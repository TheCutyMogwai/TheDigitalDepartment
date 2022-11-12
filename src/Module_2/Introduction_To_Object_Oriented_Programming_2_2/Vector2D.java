package Module_2.Introduction_To_Object_Oriented_Programming_2_2;

import java.util.Locale;

public class Vector2D {
    private double vX, vY;

    public static int count = 0;

    public Vector2D() {
        this.vX = 1;
        this.vY = 1;
        count++;

    }

    public Vector2D(double vX, double vY) {
        this.vX = vX;
        this.vY = vY;
        count++;
    }

    public Vector2D(Vector2D vector2D) {
        this.vX = vector2D.vX;
        this.vY = vector2D.vY;
        count++;
    }

    public void print() {
        System.out.println("(" + String.format(Locale.US, "%.2f", this.vX) + ", " + String.format(Locale.US, "%.2f", this.vY) + ")");
    }

    public double length () {
        return Math.sqrt(vX * vX + vY * vY);
    }

    public void add(Vector2D vector2D) {
        this.vX += vector2D.vX;
        this.vY += vector2D.vY;
    }

    public void sub(Vector2D vector2D) {
        this.vX -= vector2D.vX;
        this.vY -= vector2D.vY;
    }

    public void scale(double scaleFactor) {
        this.vX *= scaleFactor;
        this.vY *= scaleFactor;
    }

    public void normalized() {
        double vX1 = vX / length();
        double vY2 = vY / length();
        this.vX = vX1;
        this.vY = vY2;
    }

    public double dotProduct (Vector2D vector2D) {
        return this.vX * vector2D.vX + this.vY * vector2D.vY;
    }
}

/* Авторское решение Samsung IT
public class Vector2D {
    public double vX;
    public double vY;
    static int count = 0;

    public Vector2D() {
        this.vX = 1;
        this.vY = 1;
        count++;
    }

    public Vector2D(double vX, double vY) {
        this.vX = vX;
        this.vY = vY;
        count++;
    }

    public Vector2D(Vector2D v) {
        this.vX = v.vX;
        this.vY = v.vY;
        count++;
    }

    public void print() {
        System.out.printf("(%.2f, %.2f)\n", this.vX, this.vY);
    }

    public  double length() {
        return Math.sqrt(this.vX * this.vX + this.vY * this.vY);
    }

    public void add(Vector2D v) {
        this.vX += v.vX;
        this.vY += v.vY;
    }

    public void sub(Vector2D v) {
        this.vX -= v.vX;
        this.vY -= v.vY;
    }

    public void scale(double scaleFactor) {
        this.vX *= scaleFactor;
        this.vY *= scaleFactor;
    }

    public void normalized() {
        this.scale(1/this.length());
    }

    public double dotProduct(Vector2D v) {
        return this.vX * v.vX + this.vY * v.vY;
    }
}
*/