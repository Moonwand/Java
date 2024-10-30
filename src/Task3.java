import java.util.Random;
import java.util.Scanner;

public class Task3 {
    private static final String Pass = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%&*()_+-=[]|,./?><";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину пароля");
        int passLength;


        while (true) {
            passLength = scanner.nextInt();
            if (passLength > 7 && passLength < 13) {
                break;
            }
            System.out.println("Пароль должен быть длинной от 8 до 12 символов");

        }
               StringBuilder builder = new StringBuilder();

                for (int i = 0; i < passLength; i++) {
                    int index = new Random().nextInt(Pass.length());
                    builder.append(Pass.charAt(index));

                }
                System.out.println("Ваш пароль: " + builder);
            }

        }


