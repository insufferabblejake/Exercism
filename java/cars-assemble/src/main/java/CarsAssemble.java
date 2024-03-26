public class CarsAssemble {
    private static final double CARS_PER_HOUR = 221.0;

    private static double getSuccessRate(int speed) throws IllegalArgumentException {
        return switch (speed) {
            case 1,2,3,4 -> 1.0;
            case 5,6,7,8 -> 0.9;
            case 9 -> 0.8;
            case 10 -> 0.77;
            default -> throw new IllegalArgumentException();
        };
    }

    public double productionRatePerHour(int speed) {
        try {
            return speed * getSuccessRate(speed) * CARS_PER_HOUR;
        } catch (IllegalArgumentException e) {
            return 0.0;
        }
    }

    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed) / 60;
    }
}
