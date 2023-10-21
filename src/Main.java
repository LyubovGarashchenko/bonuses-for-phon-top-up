public class Main {
    public static void main(String[] args) {

        System.out.println("Расчёт бонусов за пополнение");

        int balance = 100; //  изначально было на счету 100 рублей
        int phoneTopUp = 1100; // сумма пополнение счёта
        int bonus;
        if (phoneTopUp > 1000) {
            bonus = phoneTopUp / 100;
        } else {
            bonus = 0;
        }

        System.out.println("Количество бонусных рублей: " + bonus);

        System.out.println("Итоговый расчёт: " + (balance + phoneTopUp + bonus));
    }
}