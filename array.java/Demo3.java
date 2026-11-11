public class Demo3 {
    public static void main(String[] args) {

        int array[] = {12, 15, 60, 55, 82, 35, 65, 70,67};

        int even = 0, odd = 0;

        for(int i = 0; i < array.length; i++) {

            if(array[i] % 2 == 0) {
                even++;
            }
            else {
                odd++;
            }
        }

        System.out.println("Total Even Numbers = " + even);
        System.out.println("Total Odd Numbers = " + odd);
    }
}

