public class Demo8 {
    public static void main(String[] args) {

        int n = 123;

        int a = n % 10;
        int b = (n / 10) % 10;
        int c = n / 100;

        int rev = a * 100 + b * 10 + c;

        System.out.println("Reverse = " + rev);
    }
}

