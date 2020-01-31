public class Kata {
  public static int[] digitize(long n) {
      String intToString = String.valueOf(n);
        int[] result = new int[intToString.length()];
        int counter = 0;
        boolean flag = false;
        while (!flag) {
            result[counter] = (int) (n%10);
            n /= 10;
            counter++;
            if (n < 10) {
                result[counter] = (int) n;
                flag = true;
            }
        }
        return result;
  }
}
