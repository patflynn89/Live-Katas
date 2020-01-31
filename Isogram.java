public class Isogram {
    public static boolean  isIsogram(String str) {
         char[] toChar = str.toLowerCase().toCharArray();
         for (int i = 0; i < toChar.length; i++) {
            for (int j = i+1; j < toChar.length; j++) {
                if (toChar[i] == toChar[j]) {
                    return false;
                }
            }
        }
        return true;
    } 
}
