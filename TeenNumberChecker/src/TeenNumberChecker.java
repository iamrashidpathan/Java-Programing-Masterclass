public class TeenNumberChecker {

    public static boolean hasTeen (int a, int b, int c) {
        //int i =0;
        if (isTeen(a)) return true;
        else if (isTeen(b)) return true;
        else return isTeen(c);

    }

    public static boolean isTeen(int check) {
        return check >= 13 && check <= 19;
    }
}
