import java.util.Scanner; //Import Scanner class

public class Main {
    public static void main(String[] args) {

        // Creates Scanner object
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        // Reads string input
        String name = scanner.nextLine();

        System.out.println("Enter your age: ");
        //Reads integer input
        int age = scanner.nextInt();

        System.out.println("Hello, " + name + "! You are " + age + " years old.");

        //Closes Scanner
        scanner.close();
    }
}