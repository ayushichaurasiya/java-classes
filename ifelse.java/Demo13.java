public class Demo13 {
    public static void main(String[] args) {

        int a = 10;
        int b = 15;
        int c = 20;

        if (a + b > c && b + c > a && a + c > b) {
            System.out.println("Valid Triangle");
        }
        else {
            System.out.println("Invalid Triangle");
        }
    }
}

