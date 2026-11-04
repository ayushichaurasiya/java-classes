public class Demo23 {
    public static void main(String[] args) {

        int a = 1, b = -5, c = 6;

        int d = b*b - 4*a*c;

        if (d > 0) {
            System.out.println("Roots are Real and Distinct");
        }
        else if (d == 0) {
            System.out.println("Roots are Real and Equal");
        }
        else {
            System.out.println("Roots are Imaginary");
        }
    }
}

