import java.util.Scanner;

public class BankDepositFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму вклада: ");
        float Amount = scanner.nextFloat();
        System.out.print("Введите количество месяцев: ");
        int months = scanner.nextInt();
        float currentAmount = Amount;
        for (int i = 0; i < months; i++) {
            currentAmount += currentAmount * 0.07f;
        }
        System.out.printf("Сумма вклада через %d месяцев составит: %.2f", months, currentAmount);
        scanner.close();
    }
}