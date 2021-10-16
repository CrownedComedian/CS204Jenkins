public class Main {

    public static void main(String args[]) {
        Calculator c = new Calculator();

        switch (args[0]) {
            case "add":
                System.out.println(c.add(Integer.parseInt(args[1]), Integer.parseInt(args[2])));
            case "subtract":
                System.out.println(c.subtract(Integer.parseInt(args[1]), Integer.parseInt(args[2])));
            case "multiply":
                System.out.println(c.multiply(Integer.parseInt(args[1]), Integer.parseInt(args[2])));
            case "divide":
                System.out.println(c.divide(Integer.parseInt(args[1]), Integer.parseInt(args[2])));
            case "binary":
                System.out.println(c.intToBinaryNumber(Integer.parseInt(args[1])));
        }
    }
}
