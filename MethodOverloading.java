

public class MethodOverloading {

    public int add(int a, int b) {
        return a + b;
    }


    public int add(int a, int b, int c) {
        return a + b + c;
    }


    public double add(double a, double b) {
        return a + b;
    }


    public String add(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        MethodOverloading calculator = new MethodOverloading();

        // Method overloading examples
        System.out.println("Addition of two integers: " + calculator.add(5, 3));
        System.out.println("Addition of three integers: " + calculator.add(5, 3, 2));
        System.out.println("Addition of two doubles: " + calculator.add(3.5, 2.2));
        System.out.println("Concatenation of two strings: " + calculator.add("Hello, ", "world!"));
    }
}


