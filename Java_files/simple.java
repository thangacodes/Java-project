public class anvi {
    public static void main(String[] args) {
        try {
            System.out.println("Hello, Anvi! How are you?");
            Thread.sleep(1000); // Pause for 1 seconds (1000 milliseconds)
            System.out.println("I hope you're doing well!");
            Thread.sleep(1000); // Pause for 1 seconds (1000 milliseconds)
            System.out.println("It's a great day to learn Java!");
            Thread.sleep(1000); // Pause for 1 seconds (1000 milliseconds)
            System.out.println("Keep up the good work!");
        } catch (InterruptedException e) {
            System.out.println("An error occurred while sleeping.");
            e.printStackTrace();
        }
    }
}
