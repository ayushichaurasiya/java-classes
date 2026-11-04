public class Demo11 {
    public static void main(String[] args) {

        int a = 10;
        int b = 10;
        int c = 10;

        if (a == b && b == c) {
            System.out.println("Equilateral Triangle");
        }
        else if (a == b || b == c || a == c) {
            System.out.println("Isosceles Triangle");
        }
        else {
            System.out.println("Scalene Triangle");
        }
    }
}

