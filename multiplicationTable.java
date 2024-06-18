import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number");
        int number = scan.nextInt();
        for(int i=10;i>0;i--){
        int result = number*i;
        System.out.println("The multiplication table is "+ number+ " *"+" "+i+" = "+result);
        
        }
        scan.close();
        
    }
    
}
