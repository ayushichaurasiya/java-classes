public class Demo24 {
    public static void main(String[] args) {

        int n = 5;
        int num = 8;
        int diff = 6;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print(num + " ");

            sum = sum + num;

            num = num + diff;
            diff++;
        }

        System.out.println("\nSum = " + sum);
    }
}

