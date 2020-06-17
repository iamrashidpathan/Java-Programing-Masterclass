public class SharedDigit {
    public static boolean hasSharedDigit (int a, int b) {
        if (a>99 || b>99 || a<10 ||b<10) return false;
        int count =0;
        while (a>0) {
            int extA = a%10;
            int copyB =b;
            while (copyB>0) {
                int extB1 = b%10;
                copyB/=10;
                if (extA == copyB || extA ==extB1) count++;

            }a/=10;
        }if (count >= 1){
            return true;
        }else return false;
    }
}
