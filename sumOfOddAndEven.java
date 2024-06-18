import java.util.Scanner;

public class sumOfOddAndEven {
    public static void main(String[] args) {
        int i = 0;
        int evenSum = 0;
        int oddSum = 0;
        while (i < 10) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter your number");
            int number = scan.nextInt();
            ;
            if (number % 2 == 0) {
                evenSum += number;
                System.out.println("The sum of given number is " + evenSum);
            } else {
                oddSum += number;
                System.out.println("The sum of given number is " + oddSum);
            }
            i++;

        }
        // scan.close();
    }

}
