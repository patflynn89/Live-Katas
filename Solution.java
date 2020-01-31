public class Solution {
  static int stray(int[] numbers) {
    int start = 0;
        int counter = numbers.length-1;
        while (counter < numbers.length) {
            if (numbers[start] != numbers[counter] && numbers[start+1] != numbers[counter]) {
                return numbers[counter];
            }
            if (numbers[start] != numbers[counter] && numbers[start] != numbers[counter-1]) {
                return numbers[start];
            }
            counter--;
        }

        return 0;
    }
}
