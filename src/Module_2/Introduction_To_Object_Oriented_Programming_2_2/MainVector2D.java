package Module_2.Introduction_To_Object_Oriented_Programming_2_2;

public class MainVector2D {
    public static void main(String[] args) {
        Vector2D v = new Vector2D(1.2374, 2.2334);
        Vector2D v2 = new Vector2D();
        Vector2D v3 = new Vector2D(v);
        v.print();
        v2.print();
        v3.print();

        Vector2D vA = new Vector2D();
        Vector2D vB = new Vector2D(1.0, 3.0);
        Vector2D vC = new Vector2D(vB);
        vA.add(vB);
        vA.print();
        vA.sub(vC);
        vA.print();
        System.out.println(vB.length());
        vC.scale(2);
        vC.print();

        Vector2D vA1 = new Vector2D();
        Vector2D vB1 = new Vector2D(5.0, 7.0);
        Vector2D vC1 = new Vector2D(vB1);
        vA1.add(vB1);
        vA1.print();
        vA1.sub(vC1);
        vA1.print();
        System.out.println(vB1.length());
        vC1.scale(1.5);
        vC1.print();
        vC1.normalized();
        System.out.println(vC1.length());
        vC1.scale(2);
        System.out.println(vA1.dotProduct(vB1));
        System.out.println(vA1.count);
        double rand = Math.random();
    }
}