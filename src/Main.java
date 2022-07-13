public class T3java {

    public static void main(String[] args) {
        int Cash = 100;
        System.out.println((Cash) + " Начальная сумма");
        int CashInv = 1100;
        System.out.println((CashInv) + " Сумма пополнения");


        int Bonus;
        Bonus = CashInv < 1000 ? CashInv : CashInv + (1 * CashInv / 100);
        int TotalCash;
        System.out.println(Cash + Bonus + " Общая сумма");
    }
}