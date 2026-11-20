public class Demo24 {
    public static void main(String[] args) {

        int a = 1;
        int b = -5;
        int c = 6;

        double d = b * b - 4 * a * c;

        if (a == 0) {
            System.out.println("Not a Quadratic Equation");
        }
        else if (d >= 0) {
            double root1 = (-b + Math.sqrt(d)) / (2 * a);
            double root2 = (-b - Math.sqrt(d)) / (2 * a);

            if (root1 > 0 && root1 == (int) root1) {
                System.out.println("Natural Root 1 = " + (int) root1);
            } else {
                System.out.println("Root 1 is not a natural number");
            }

            if (root2 > 0 && root2 == (int) root2) {
                System.out.println("Natural Root 2 = " + (int) root2);
            } else {
                System.out.println("Root 2 is not a natural number");
            }
        }
        else {
            System.out.println("Roots are not real");
        }
    }
}   
    

