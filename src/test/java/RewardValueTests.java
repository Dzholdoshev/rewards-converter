import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 1000;
        int convertedMiles = (int) (cashValue * RewardValue.CONVERSION_RATE_TO_MILES);
        RewardValue.convertToMiles(1000);
        var rewardValue = new RewardValue(cashValue);
        assertEquals(convertedMiles, rewardValue.getMilesValue());

    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 2000;
        double convertedCash = (milesValue * RewardValue.CONVERSION_RATE_TO_CASH);
        RewardValue.convertToCash(milesValue);
        var rewardValue = new RewardValue(milesValue);
        assertEquals(convertedCash, rewardValue.getCashValue());

    }
}
