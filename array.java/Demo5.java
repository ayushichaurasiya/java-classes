public class Demo5 {
    public static void main(String[] args) {

        int array[] = {55, 12, 45, 22, 25, 30};

        int count = 0;

        for(int i = 0; i < array.length; i++) {

            if(array[i] % 5 == 0) {
                count++;
            }
        }

        System.out.println("Numbers divisible by 5 = " + count);
    }
}