public class Demo14 {
    public static void main(String[] args) {

        int a[] = {10, 50, 30, 80, 20};

        int max = a[0];
        int second = Integer.MIN_VALUE;

        for (int i = 1; i < a.length; i++) {

            if (a[i] > max) {
                second = max;
                max = a[i];
            }
            else if (a[i] > second && a[i] < max) {
                second = a[i];
            }
        }

        System.out.println("Greatest number = " + max);
        System.out.println("Second greatest number = " + second);
    }
}


