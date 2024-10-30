import java.util.Scanner;

public class Task2 {

    private static final double USD = 0.01;
    private static final double EUR = 0.0095;
    private static final double BYN = 0.034;
    private static final double CNY = 0.073;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму в рублях");
        int sumRub = scanner.nextInt();
        scanner.nextLine();
        double convertedSum;

        System.out.println("Введите валюту для конвертации. USD, EUR, BYN, CNY");
        String currency = scanner.nextLine();

        if (currency.equals("USD")) {
            convertedSum = sumRub * USD;
            System.out.println(convertedSum);
        } else if (currency.equals("EUR")) {
            convertedSum = sumRub * EUR;
            System.out.println(convertedSum);
        } else if (currency.equals("BYN")) {
            convertedSum = sumRub * BYN;
            System.out.println(convertedSum);
        } else if (currency.equals("CNY")) {
            convertedSum = sumRub * CNY;
            System.out.println(convertedSum);
        }





    }
}
