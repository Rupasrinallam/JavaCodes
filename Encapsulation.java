class Person {

    private String name;
    private int age;


    public Person(String name, int age) {
        this.name = name;

        if (age >= 0 && age <= 150) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age must be between 0 and 150.");
        }
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        // Ensure age is within a valid range (0-150)
        if (age >= 0 && age <= 150) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age must be between 0 and 150.");
        }
    }


    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Encapsulation {
    public static void main(String[] args) {

        Person person = new Person("Alice", 30);


        person.displayInfo();


        person.setAge(32);

        
        person.displayInfo();
    }
}

