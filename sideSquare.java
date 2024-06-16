import java.util.Scanner;

public class sideSquare {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the side of the square");
        int a = scan.nextInt();
        int sideSquare = a*a;
        System.out.println("Area of the given square based on the side is "+sideSquare);
        scan.close();
    }
    
}
