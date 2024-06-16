import java.util.Scanner;

public class areaOfSquare {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the side of the square");
        float side = scan.nextFloat();
        float area = side*side;
        System.out.println("The area of the square is "+area);
        scan.close();

    }
    
}
