public class BarkingDog {
    public static boolean shouldWakeUp (boolean barking, int hourOfDay) {

        boolean state =false;
        if (!barking) return state;
        else if (hourOfDay < 0 || hourOfDay > 23) return state;
        else {
            if (hourOfDay < 8 || hourOfDay > 22) state = true;
        }
        return state;
    }

}
