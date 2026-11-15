public class Demo8 {
    public static void main(String[] args) {

        int arr[] = {12, 15, 20, 24, 30, 36};

        for (int k = 1; k <= 4; k++) {

            System.out.println("Numbers divisible by " + k + ":");

            for (int i = 0; i < arr.length; i++) {

                if (arr[i] % k == 0) {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}

