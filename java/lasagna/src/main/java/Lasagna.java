public class Lasagna {
    private static final int EXPECTED_MINUTES = 40;
    private static final int MINUTES_PER_LAYER = 2;

    public static int expectedMinutesInOven() {
        return EXPECTED_MINUTES;
    }

    public static int remainingMinutesInOven(int spent) {
        return expectedMinutesInOven() - spent;
    }

    public static int preparationTimeInMinutes(int layers) {
        return MINUTES_PER_LAYER * layers;
    }

    public static int totalTimeInMinutes(int layers, int spent) {
        return preparationTimeInMinutes(layers) + spent;
    }
}
