public class Demo9 {
    public static void main(String[] args) {

        int n = 123;

        int a = n % 10;
        int b = (n / 10) % 10;
        int c = n / 100;

        int sum = a + b + c;

        System.out.println("Sum of Digits = " + sum);
    }
}
