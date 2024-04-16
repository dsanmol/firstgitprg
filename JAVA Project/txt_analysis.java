import java.util.Scanner;

public class txt_analysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        scanner.close();

        String[] words = text.split("\\s+");
        int vowelCount = 0;
        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }

            for (char c : word.toCharArray()) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'|| c=='A'|| c=='E'|| c=='I' ||c=='O' ||c=='U') {
                    vowelCount++;
                }
            }
        }

        System.out.println("Number of words: " + words.length);
        System.out.println("Longest word: " + longestWord);
        System.out.println("Vowel count: " + vowelCount);
    }
}
