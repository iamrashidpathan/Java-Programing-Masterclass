public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloByte) {
        if (kiloByte < 0) System.out.println("Invalid Value");
        else {
            int megaBytes = kiloByte / 1024;
            int remainingKiloByte = kiloByte % 1024;
            System.out.println(kiloByte + " KB = " + megaBytes + " MB and " + remainingKiloByte + " KB");
        }
    }
}
