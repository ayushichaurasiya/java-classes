public class Demo18 {
    public static void main(String[] args) {

        char ch = 'A';

        if (ch == 'a' || ch == 'e' || ch == 'i' ||
            ch == 'o' || ch == 'u' || ch == 'A' ||
            ch == 'E' || ch == 'I' || ch == 'O' ||
            ch == 'U') {

            System.out.println("Vowel");
        }
        else if ((ch >= 'A' && ch <= 'Z') ||
                 (ch >= 'a' && ch <= 'z')) {

            System.out.println("Consonant");
        }
        else {
            System.out.println("Not an Alphabet");
        }
    }
}

