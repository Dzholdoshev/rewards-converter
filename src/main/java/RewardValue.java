import java.math.BigDecimal;

public class RewardValue {
    private double cashValue;
    private int milesValue;
    public static final double CONVERSION_RATE_TO_MILES = 0.0035;
    public static final double CONVERSION_RATE_TO_CASH = 1/0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = convertToMiles(cashValue);
    }
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = convertToCash(milesValue);

    }

    public double getCashValue() {
        return cashValue;
    }

    public Integer getMilesValue() {
        return milesValue;
    }
    private static double convertToCash(int milesValue) {
        return milesValue * CONVERSION_RATE_TO_CASH;
    }

    public static int convertToMiles(double cashValue){
        return (int) (cashValue * CONVERSION_RATE_TO_MILES);
    }

}
