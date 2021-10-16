import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the calculator");
        System.out.println("Enter a command:");
        String raw;

        do {
            raw = input.nextLine();
            handleInput(raw.split(" "));
        } while(!(raw.equals("quit") || raw.equals("exit") || raw.equals("q")));
    }

    private static void handleInput(String... args) {
        Calculator c = new Calculator();

        switch (args[0]) {
            case "add":
                System.out.println(c.add(Integer.parseInt(args[1]), Integer.parseInt(args[2])));
                break;
            case "subtract":
                System.out.println(c.subtract(Integer.parseInt(args[1]), Integer.parseInt(args[2])));
                break;
            case "multiply":
                System.out.println(c.multiply(Integer.parseInt(args[1]), Integer.parseInt(args[2])));
                break;
            case "divide":
                System.out.println(c.divide(Integer.parseInt(args[1]), Integer.parseInt(args[2])));
                break;
            case "fibonacci":
                System.out.println(c.fibonacciNumberFinder(Integer.parseInt(args[1])));
                break;
            case "binary":
                System.out.println(c.intToBinaryNumber(Integer.parseInt(args[1])));
                break;
        }
    }
}
