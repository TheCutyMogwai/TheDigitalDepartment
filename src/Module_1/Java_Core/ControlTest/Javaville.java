package Module_1.Java_Core.ControlTest;

public class Javaville {
    public static void main(String[] args) {
        int t = 5;
        char b = 'D';
//        float t = 5.0f;
//        String b = "DEF";
        Object o = t;
        String str = o.getClass().getSimpleName();
        if (str.equals("Float") || str.equals("Double")) {
            if (t < 10) System.out.printf("The temperature in Javaville is %.1fC now.", t);
            else System.out.printf("The temperature in Javaville is %2.1fC now.", t);
        } else  if (str.equals("Integer") || str.equals("Char") || str.equals("Short") || str.equals("Long")){
            if (t < 10) System.out.printf("The temperature in Javaville is %dC now.", t);
            else System.out.printf("The temperature in Javaville is %2dC now.", t);
        }
    }
}