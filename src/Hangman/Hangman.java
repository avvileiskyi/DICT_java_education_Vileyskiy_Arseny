package Hangman;

public class Hangman {
    public static void main(String[] args) {
        String[] words = {"python", "java", "javascript", "kotlin"};
        int randomIndex = (int) (Math.random() * words.length);
        String word = words[randomIndex];  // Случайно выбранное слово

        // Показываем первые две буквы
        String hint = word.substring(0, 2) + "-".repeat(word.length() - 2);
        System.out.println("HANGMAN");
        System.out.print("Guess the word " + hint + ": > ");
        String guess = System.console().readLine().toLowerCase();

        if (guess.equals(word)) {
            System.out.println("You survived!");
        } else {
            System.out.println("You lost!");
        }
    }
}