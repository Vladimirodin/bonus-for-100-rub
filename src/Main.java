public class Main {
    public static void main(String[] args) {
        int initialAmount = 30; // начальная сумма счёта
        int depositAmount = 1001; // сумма пополнения
        int bonus = depositAmount > 1000 ? depositAmount / 100 : 0; // количество бонусных рублей
        int totalAmount = initialAmount + depositAmount + bonus; // итоговая сумма на счету клиента

        System.out.println ("количество бонусных рублей: " + bonus);
        System.out.println ("итоговый счёт: " + totalAmount + " рублей");
    }
}
