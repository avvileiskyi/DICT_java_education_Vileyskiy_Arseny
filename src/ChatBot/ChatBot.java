package ChatBot;

public class ChatBot {
    public static void main(String[] args) {
        System.out.println("Hello! My name is ChatBot.");
        System.out.println("I was created in 2024.");


        String name = "User";
        System.out.println("Please, remind me your name.");
        System.out.println("What a great name you have, " + name + "!");


        int remainder3 = 1, remainder5 = 2, remainder7 = 3;
        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");


        System.out.println("Now I will prove to you that I can count to any number you want!");
        int userInp = 5;
        for (int i = 1; i <= userInp; i++) {
            System.out.println(i + "!");
        }


        System.out.println("Let's test your knowledge!");

        
        int answer = 2;
        if (answer == 2) {
            System.out.println("Correct! Goodbye, have a nice day!");
        } else {
            System.out.println("Please, try again.");
        }
    }
}