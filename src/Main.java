public class Main {
    public static void main(String[] args) {

        int account = 100;
        int donat = 1099;
        int finalAccount;
        int bonus;

        if (donat > 1000) {
            bonus = donat / 100;
        } else {
            bonus = 0;
        }
        finalAccount = account + donat + bonus;

        System.out.println("Итоговый счёт    = " + finalAccount);
        System.out.println("Получено бонусов - " + bonus);
        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}