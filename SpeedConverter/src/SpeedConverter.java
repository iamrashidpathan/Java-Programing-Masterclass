public class SpeedConverter {

    public static long toMilesPerHour (double kilometerPerHour) {
        if (kilometerPerHour < 0) {
            return -1;
        }
        return Math.round(kilometerPerHour/1.609);
    }

    public static void printConversion (double kilometerPerHour) {
        long milesPerHour = toMilesPerHour(kilometerPerHour);
        if (milesPerHour == -1) System.out.println("Invalid Value");
        else {
        System.out.println(kilometerPerHour+" km/h = "+milesPerHour+ " mi/h");
        }
    }
}
