public class Demo13 {
    public static void main(String[] args) {
        int n = 5;

        for (int r = 1; r <= n; r++) {
            double area = 3.14 * r * r;
            double circumference = 2 * 3.14 * r;

            System.out.println("Radius = " + r);
            System.out.println("Area = " + area);
            System.out.println("Circumference = " + circumference);
        }
    }
}

