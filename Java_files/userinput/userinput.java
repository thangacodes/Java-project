import java.util.Scanner;  // Import Scanner class to read user input
public class userinput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        // No try-catch block needed for InterruptedException
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();  // Read the user's input 
        System.out.println("Hello, " + name + "! How are you?");
        System.out.println("I hope you're doing well, " + name + "!");
        System.out.println("It's a great day to learn Java, " + name + "!");
        System.out.println("Keep up the good work, " + name + "!");

        scanner.close();  // Close the scanner object to prevent memory leaks
    }
}