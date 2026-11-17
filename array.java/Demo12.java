public class Demo12 {
    public static void main(String[] args) {

        int a[] = {10, 50, 30, 80, 20};
        int max = a[0];
        int index = 0;

        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
                index = i;
            }
        }

        System.out.println("Maximum number = " + max);
        System.out.println("Index of maximum number = " + index);
    }
}


