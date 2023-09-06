public class ThrowExample {
    public static void main(String[] args) {
        int age = -1;

        try {

            if (age < 0) {
                throw new IllegalArgumentException("Age cannot be negative.");
            }


            System.out.println("Age is: " + age);
        } catch (IllegalArgumentException e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}
