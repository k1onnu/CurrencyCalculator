
import java.util.Scanner;

public class CurrencyCalculator {
    public static void main(String[] args) {

        System.out.println("Введите: ");
        Scanner scanner = new Scanner(System.in);
        double userNum = scanner.nextDouble();
        System.out.println("Вы ввели " + userNum + " рублей\n");

        double dollar = userNum * 1 / 77.50;
        double euro = userNum * 1 / 82.98;

        if(userNum > 0) {
            System.out.println(dollar + " долларов");
            System.out.println(euro + " евро");
        } else {
        }
    }
}