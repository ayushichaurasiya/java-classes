public class Demo14 {
    public static void main(String[] args) {

        int n = 583;

        int a = n / 100;
        int b = (n / 10) % 10;
        int c = n % 10;

        if (a < b && a < c) {
            System.out.println("Minimum digit = " + a);
        }
        else if (b < a && b < c) {
            System.out.println("Minimum digit = " + b);
        }
        else if (c < a && c < b) {
            System.out.println("Minimum digit = " + c);
        }
        else if (a == b && b == c) {
            System.out.println("Minimum digit = " + a);
        }
        else if (a == b) {
            System.out.println("Minimum digit = " + a);
        }
        else if (b == c) {
            System.out.println("Minimum digit = " + b);
        }
        else {
            System.out.println("Minimum digit = " + a);
        }
    }
} 

