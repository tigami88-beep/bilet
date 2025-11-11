public class BonusMilesService {
    public int calculate(int price) {
        // Пример простого расчета: 5 миль на каждые 1000 единиц цены
        // price = 10000 -> 10 * 50 = 500
        int milesPerThousand = 50;
        int result = (price / 1000) * milesPerThousand;
        return result;
    }

    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price); // должно получиться 500
        System.out.println(miles);
    }
}