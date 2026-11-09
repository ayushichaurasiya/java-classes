public class Demo21 {
    public static void main(String[] args) {

        double celsius = 37;
        double fahrenheit;

        // Celsius to Fahrenheit
        fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("Celsius = " + celsius);
        System.out.println("Fahrenheit = " + fahrenheit);

        // Fahrenheit to Celsius
        double f = 98.6;
        double c = (f - 32) * 5 / 9;

        System.out.println("Fahrenheit = " + f);
        System.out.println("Celsius = " + c);
    }
}