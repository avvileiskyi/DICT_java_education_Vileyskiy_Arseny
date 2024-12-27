package ChatBot;

public class ChatBot {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello! My name is ChatBot.");
        System.out.println("I was created in 2024.");
        System.out.println("Please, remind me your name.");

        String name = readLine();
        System.out.println("What a great name you have, " + name + "!");

        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5, and 7.");

        int remainder3 = getValidatedInput(3);
        int remainder5 = getValidatedInput(5);
        int remainder7 = getValidatedInput(7);

        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");

        System.out.println("Now I will prove to you that I can count to any number you want!");
        System.out.print("Enter a number: ");
        int userInp = Integer.parseInt(readLine());

        for (int i = 0; i <= userInp; i++) {
            System.out.println(i + "!");
        }

        System.out.println("Let's test your math knowledge!");
        while (true) {
            System.out.println("What is 2 + 2?");
            System.out.println("1. 3");
            System.out.println("2. 4");
            System.out.println("3. 5");
            System.out.println("4. 6");
            System.out.print("Your answer: ");

            int answer = Integer.parseInt(readLine());
            if (answer == 2) {
                System.out.println("Correct! Have a nice day!");
                break;
            } else {
                System.out.println("Please, try again.");
            }
        }
    }

    private static String readLine() throws Exception {
        StringBuilder input = new StringBuilder();
        int character;
        while ((character = System.in.read()) != '\n') {
            if (character != '\r') {
                input.append((char) character);
            }
        }
        return input.toString();
    }

    private static int getValidatedInput(int divisor) throws Exception {
        while (true) {
            System.out.print("Remainder when divided by " + divisor + ": ");
            int remainder = Integer.parseInt(readLine());
            if (remainder >= 0 && remainder < divisor) {
                return remainder;
            }
            System.out.println("Invalid input. Please enter a valid remainder (0 to " + (divisor - 1) + ").");
        }
    }
}
