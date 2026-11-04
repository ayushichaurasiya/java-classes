public class Demo22 {
    public static void main(String[] args) {

        int a = 1, b = -5, c = 6;

        double d = b*b - 4*a*c;

        if (d > 0) {
            double r1 = (-b + Math.sqrt(d)) / (2*a);
            double r2 = (-b - Math.sqrt(d)) / (2*a);

            System.out.println("Two distinct real roots");
            System.out.println("Root 1 = " + r1);
            System.out.println("Root 2 = " + r2);
        }
        else if (d == 0) {
            double r = -b / (2.0*a);

            System.out.println("Two equal real roots");
            System.out.println("Root = " + r);
        }
        else {
            System.out.println("Imaginary roots");
        }
    }
}

