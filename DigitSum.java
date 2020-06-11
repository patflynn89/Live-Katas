import java.util.Scanner;

/**
 * The program computes the digit sum of a number. It takes the first input of the user which
 * indicates how many sum of digits should be calculated. Then for each given number the digit sum
 * is displayed.
 */
public class Shell {

    private Scanner sc;
    private int amountOfDigitSum;

    /**
     * The constructor of the program which calls the method <code>handleFirstInput()</code> to take
     * the first inpute of the user.
     */
    public Shell() {
        handleFirstInput();
    }


    /**
     * Main method calls the constructor of the program.
     *
     * @param args No uses.
     */
    public static void main(String[] args) {
        new Shell();


    }


    /**
     * Handle the first input of the user to check how many digit numbers should be computed. After
     * that, call the method <code>digitSum</code> with the given input of the user.
     */
    private void handleFirstInput() {
        this.sc = new Scanner(System.in);
        this.amountOfDigitSum = /*sc.nextInt()*/ Integer.parseInt(sc.nextLine());
        digitSum(this.amountOfDigitSum);
    }


    /**
     * The major method of the program which creates the digit sum.
     *
     * @param counter The given amount of transits.
     */
    private void digitSum(int counter) {
        int[] result = new int[counter];
        int arrayCount = 0;
        while (counter > 0) {
            int number = Integer.parseInt(sc.nextLine());
            if (number > 0 && number < 1000) {
                if (number < 10) {
                    result[arrayCount] = number;
                } else if (number >= 10 && number < 100) {
                    result[arrayCount] = helpDigitSum(number);
                } else if (number >= 100 && number < 1000) {
                    int firstDigit = number / 100;
                    int twoDigitsLeft = number % 100;
                    int tmp = helpDigitSum(twoDigitsLeft);
                    result[arrayCount] = firstDigit + tmp;
                }

            } else {
                System.out.println("Error. Only positive numbers up to 1000 are allowed!");
            }

            counter--;
            arrayCount++;

        }
        sc.close();

        for (int finalResult : result) {
            System.out.println(finalResult);
        }


    }

    /**
     * Help method to create a digit sum when only two numerics or less are left.
     *
     * @param number The two- or one-digit number.
     * @return The digit sum of the given number.
     */
    private int helpDigitSum(int number) {
        if (number >= 10) {
            int divideRest = number / 10;
            int moduloRest = number % 10;
            return moduloRest + divideRest;
        } else return number;

    }


}
