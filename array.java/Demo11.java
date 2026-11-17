public class Demo11 {
    public static void main(String[] args) {

        int a[] = {10, 20, 30, 40, 50};
        int k = 30;
        int n = a.length;
        int index = n - 1;

        for (int i = 0; i < n; i++) {
            if (a[i] == k) {
                index = i;
                break;
            }
        }

        System.out.println("Index = " + index);
    }
}


