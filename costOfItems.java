import java.util.Scanner;

public class costOfItems {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the cost of pencil ");
        float costOfPencil = scan.nextFloat();
        System.out.println("The entered value for a pencil is " + costOfPencil);
        System.out.println("Enter the cost of pen");
        float costOfPen = scan.nextFloat();
        System.out.println("The entered value for a pen is " + costOfPen);
        System.out.println("Enter the cost of eraser");
        float costOfEraser = scan.nextFloat();
        System.out.println("The entered value for a eraser is " + costOfEraser);
        float total = (costOfPencil + costOfPen + costOfEraser);
        float gstApplied = total * 0.18F;
        float calculatedGST = total + gstApplied;
        // System.out.printf("The GST on the given bill is %.2f%n" + gst);
        System.out.println("The GST on the given bill is" + calculatedGST);
        System.out.println("The GST on the total amount is " + gstApplied);
        scan.close();
    }

}
