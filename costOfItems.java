import java.util.Scanner;

public class costOfItems {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the cost of pencil ");
        System.out.flush();
        float costOfPencil = scan.nextFloat();
        System.out.println("Cost of pencil is: " + costOfPencil);
        System.out.println("Enter the cost of pen");
        float costOfPen = scan.nextFloat();
        System.out.println("Enter the cost of eraser");
        float costOfEraser = scan.nextFloat();
        float total = (costOfPencil + costOfPen + costOfEraser);
        float gstApplied = (18F / 100);
        float calculatedGST = total * gstApplied;
        // System.out.printf("The GST on the given bill is %.2f%n" + gst);
        System.out.println("The GST on the given bill is" +calculatedGST);

        //scan.close();
    }

}
