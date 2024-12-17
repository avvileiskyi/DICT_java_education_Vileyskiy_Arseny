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
    }
}