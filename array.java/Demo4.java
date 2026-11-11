public class Demo4 {
    public static void main(String[] args) {

        int a[] = {12, 2, 11, 4, 76};

        int sum = 0;

        for(int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }

        System.out.println("Sum of Array = " + sum);
    }
}
