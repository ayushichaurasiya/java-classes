public class Demo12 {
    public static void main(String[] args) {
        int n = 5;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + (2 * i - 1);
        }

        System.out.println("Sum of odd numbers = " + sum);
    }
}

