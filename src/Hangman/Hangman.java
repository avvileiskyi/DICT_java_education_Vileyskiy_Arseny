package Hangman;

public class Hangman {
    public static void main(String[] args) {
        String[] words = {"python", "java", "javascript", "kotlin"};
        int randomIndex = (int) (Math.random() * words.length);
        String word = words[randomIndex];
        char[] wordState = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            wordState[i] = '-';
        }

        int attemptsLeft = 8;
        StringBuilder guessedLetters = new StringBuilder();
        while (attemptsLeft > 0) {
            System.out.println("Attempts left: " + attemptsLeft);
            System.out.print("Current word: ");
            System.out.println(wordState);
            System.out.print("Input a letter: > ");
            String input = System.console().readLine().toLowerCase();

            if (input.length() != 1) {
                System.out.println("You should input a single letter");
                continue;
            }

            char guessedLetter = input.charAt(0);

            if (!Character.isLowerCase(guessedLetter)) {
                System.out.println("Please enter a lowercase English letter");
                continue;
            }

            if (guessedLetters.toString().contains(String.valueOf(guessedLetter))) {
                System.out.println("You've already guessed this letter");
                continue;
            }

            guessedLetters.append(guessedLetter);

            boolean found = false;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == guessedLetter && wordState[i] == '-') {
                    wordState[i] = guessedLetter;
                    found = true;
                }
            }
            if (!found) {
                attemptsLeft--;
                System.out.println("That letter doesn't appear in the word");
            }

            if (new String(wordState).equals(word)) {
                System.out.println("You guessed the word " + word + "!");
                System.out.println("You survived!");
                break;
            }

            if (attemptsLeft == 0) {
                System.out.println("You lost!");
            }
        }
    }
}