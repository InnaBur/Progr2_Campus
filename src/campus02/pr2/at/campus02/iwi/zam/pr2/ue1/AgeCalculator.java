package campus02.pr2.at.campus02.iwi.zam.pr2.ue1;

public class AgeCalculator {

    private final int MONATE_IN_A_YEAR = 12;
    private final double WEEKS_IN_A_YEAR = 52.18;
    private final double DAYS_IN_A_YEAR = 365.25;


    public int monateRechnen(int age) {
        return age * MONATE_IN_A_YEAR;
    }

    public double wochenRechnen(int age) {
        return age * WEEKS_IN_A_YEAR;
    }

    public double tagenRechnen(int age) {
        return age * DAYS_IN_A_YEAR;
    }
}
