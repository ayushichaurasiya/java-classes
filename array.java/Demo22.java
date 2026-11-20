public class Demo22 {
    public static void main(String[] args) {

        double a = 1;
        double b = -5;
        double c = 6;

        double d = b * b - 4 * a * c;

        if (a == 0) {
            System.out.println("Not a Quadratic Equation");
        }
        else if (d > 0) {
            double root1 = (-b + Math.sqrt(d)) / (2 * a);
            double root2 = (-b - Math.sqrt(d)) / (2 * a);

            System.out.println("Two Distinct Real Roots");
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);
        }
        else if (d == 0) {
            double root = -b / (2 * a);

            System.out.println("Two Equal Real Roots");
            System.out.println("Root = " + root);
        }
        else {
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-d) / (2 * a);

            System.out.println("Imaginary Roots");
            System.out.println("Root 1 = " + real + " + " + imaginary + "i");
            System.out.println("Root 2 = " + real + " - " + imaginary + "i");
        }
    }
} 

