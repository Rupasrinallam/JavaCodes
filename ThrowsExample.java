import java.io.IOException;

public class ThrowsExample {

    public void readFile() throws IOException {

        throw new IOException("File not found.");
    }

    public static void main(String[] args) {
        ThrowsExample example = new ThrowsExample();

        try {

            example.readFile();
        } catch (IOException e) {

            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
