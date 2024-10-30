import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static final String[] WORDS = {"Масленица", "Самолет", "Компьютер"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = new Random().nextInt(WORDS.length);
        String word = WORDS[num].toLowerCase();

        Map<String, Integer> map = new HashMap<>();

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            builder.append("_");
        }

        int count = 0;
        int lives = 10;
        while (true) {
            String letter = scanner.nextLine();

            if (map.containsKey(letter)) {
                Integer lastIndex = map.get(letter);
                if (lastIndex == word.length() - 1) {
                    System.out.println("Таких букв больше нет");
                    lives--;
                    System.out.println("Осталось " + lives + "жизней");
                    continue;
                }
                int index = word.indexOf(letter, lastIndex + 1);
                map.put(letter, index);
                builder.replace(index, index + 1, letter);
                System.out.println(builder);
                count++;
            } else {
                int index = word.indexOf(letter);
                if (index != -1) {
                    map.put(letter, index);
                    builder.replace(index, index + 1, letter);
                    System.out.println(builder);
                    count++;
                } else {
                    lives--;
                    System.out.println("Осталось " + lives + " жизней");
                }
            }

            if (lives == 0) {
                System.out.println("LOSE");
                break;
            }
            if (count == word.length()) {
                System.out.println("WIN");
                break;
            }
        }

        }
    }