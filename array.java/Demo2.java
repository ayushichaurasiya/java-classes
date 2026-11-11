public class Demo2 {
    public static void main(String[] args) {

        int array[] = {10, -45,3, -40, -12, 87};

        int count = 0;

        for(int i = 0; i < array.length; i++) {
            if(array[i] < 0) {
                count++;
            }
        }

        System.out.println("Total negative numbers = " + count);
    }
}

