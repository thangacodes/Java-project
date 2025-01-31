import java.util.Scanner;  // Import Scanner class to read user input
public class anvi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object

        try {
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();  // Read the user's input 
            System.out.println("Hello, " + name + "! How are you?");
            Thread.sleep(1000); // Pause for 1 seconds (1000 milliseconds)
            System.out.println("I hope you're doing well, " + name + "!");
            Thread.sleep(1000); // Pause for 1 seconds (1000 milliseconds)
            System.out.println("It's a great day to learn Java, " + name + "!");
            Thread.sleep(1000); // Pause for 1 seconds (1000 milliseconds)
            System.out.println("Keep up the good work, " + name + "!");
        } catch (InterruptedException e) {
            System.out.println("An error occurred while sleeping.");
            e.printStackTrace();
        } finally {
            scanner.close();  // Close the scanner object to prevent memory leaks
        }
    }
}
