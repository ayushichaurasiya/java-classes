public class Demo7 {
    public static void main(String[] args) {

        int arr[] = {2, 5, 20, 45, 100, 35};

        System.out.println("Even Numbers:");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }

        System.out.println("Odd Numbers:");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println(arr[i]);
            }
        }
    }
}

