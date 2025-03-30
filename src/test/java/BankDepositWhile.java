import java.util.Scanner;

public class BankDepositWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму вклада: ");
        float deposit = scanner.nextFloat();
        System.out.print("Введите количество месяцев: ");
        int months = scanner.nextInt();
        float currentAmount = deposit;
        int currentMonth = 1;
        while (currentMonth <= months) {
            currentAmount += currentAmount * 0.07f;
            currentMonth++;
        }
        System.out.printf("Сумма вклада через %d месяцев составит: %.2f", months, currentAmount);
        scanner.close();
    }
}