public class Demo15 {
    public static void main(String[] args) {
        int n = 5;
        int xor = 0;

        for (int i = 1; i <= n; i++) {
            xor = xor ^ i;
        }

        System.out.println("XOR = " + xor);
    }
}

