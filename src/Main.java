public class T3java {

    public static void main(String[] args) {
        int CASH = 100;
        System.out.println((CASH) + " Начальная сумма");
        int CASHINV = 1100;
        System.out.println((CASHINV) + " Сумма пополнения");


        int BONUS;
        BONUS = CASHINV < 1000 ? CASHINV : CASHINV + (1 * CASHINV / 100);
        int TOTLCASH;
        System.out.println(CASH + BONUS + " Общая сумма");
    }
}