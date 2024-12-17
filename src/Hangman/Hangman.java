package Hangman;

public class Hangman {
    public static void main(String[] args) {
        String word = "java"; 
        System.out.println("HANGMAN");
        System.out.print("Guess the word: > ");
        String guess = System.console().readLine().toLowerCase();

        if (guess.equals(word)) {
            System.out.println("You survived!");
        } else {
            System.out.println("You lost!");
        }
    }
}