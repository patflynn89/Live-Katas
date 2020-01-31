import java.util.List;

public class BinaryArrayToNumber {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        String formattedString = binary.toString()
                .replace(",", "")
                .replace("[", "")
                .replace("]", "")
                .replace(" ", "")
                .trim();        
        int decimal = Integer.parseInt(formattedString, 2);
        return decimal;
    }
}
