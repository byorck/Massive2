public class Main {
    public static void main(String[] args) {
        System.out.println("Task № 1");
        int[] incomeMonth = {23000, 27500, 32000, 21000, 26000};
        int sumIncomeMonth = 0;
        for (int i : incomeMonth) {
            sumIncomeMonth += i;
        }
        System.out.printf("Сумма трат за месяц составила %s рублей%n", sumIncomeMonth);
        System.out.println("Task № 2");
        int[] incomeWeek = {2300, 2750, 3200, 2100, 2600};
        int maxIncomeWeek = incomeWeek[0];
        int minIncomeWeek = incomeWeek[0];
        for (int i : incomeWeek) {
            if (i < minIncomeWeek) {
                minIncomeWeek = i;
            }
            if (i > maxIncomeWeek) {
                maxIncomeWeek = i;
            }
        }
        System.out.printf("Минимальная сумма трат за неделю составила %d рублей. Максимальная сумма трат за неделю составила %d рублей%n", minIncomeWeek, maxIncomeWeek);
        System.out.println("Task № 3");
        int[] spendingWeek = {234, 275, 320, 210, 260};
        int sumSpending = 0;
        for (int i : spendingWeek) {
            sumSpending += i;
        }
        double averageSpending = (double) sumSpending / spendingWeek.length;
        System.out.printf("Средняя сумма трат за месяц составила %S рублей%n", averageSpending);
        System.out.println("Task № 4");
        char temp;
        char[] reverseFullName2 = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName2.length / 2; i++) {
            temp = reverseFullName2[i];
            reverseFullName2[i] = reverseFullName2[reverseFullName2.length - 1 - i];
            reverseFullName2[reverseFullName2.length - 1 - i] = temp;
        }
        for (int i = 0; i < reverseFullName2.length; i++) {
            System.out.print(reverseFullName2[i]);
            if (i == reverseFullName2.length - 1) {
                System.out.println(reverseFullName2[i]);
            }
        }
    }
}