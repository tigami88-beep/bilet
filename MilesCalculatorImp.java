package bilet;

public class MilesCalculatorImp {
       public static void main(String[] args) {
        // Стоимость билета (в рублях). Изменяйте это значение по необходимости.
        long ticketPrice = 13676L;

        // Расчёт: каждые 20 рублей дают 1 милю. Дробные мили не начисляются.
        long miles = ticketPrice / 20;

        System.out.println("Стоимость билета: " + ticketPrice + " рублей");
        System.out.println("Начислено миль: " + miles);
    }
}
