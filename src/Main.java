public class Main {

    public static void main(String[] args) {
        int cash = 100;
        System.out.println((cash) + " Начальная сумма");
        int cashInv = 1100;
        System.out.println((cashInv) + " Сумма пополнения");


        int bonus;
        bonus = cashInv < 1000 ? cashInv : cashInv + (1 * cashInv / 100);
        int totalCash;
        System.out.println(cash + bonus + " Общая сумма");
    }
}