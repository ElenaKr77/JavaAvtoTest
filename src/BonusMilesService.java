public class BonusMilesService {
    int amount = 20;

    public int calculate(int price) {
        int result;
        result = price / amount;
        return result;
    }
}
