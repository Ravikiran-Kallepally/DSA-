import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the year");
        int year = scan.nextInt();

        if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            System.out.println("Leap year !");

        }
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Leap year it is ");
        } else {
            System.out.println("Not a leap year");
        }
        scan.close();
    }

}
