public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) { // bigCount weighs= 5 kg,
                                                                            // smallCount weighs =1kg
      if (bigCount<0 || smallCount<0 || goal<0) return false; //4 18 19
      int bigKG = 5 * bigCount;
      while (bigKG>goal) {
          bigKG -= 5;
      }
      int goalRemaining = goal - bigKG;
      goalRemaining -= smallCount;
      return goalRemaining <=0;
    }
}
