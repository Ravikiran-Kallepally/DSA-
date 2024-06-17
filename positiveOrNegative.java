import java.util.Scanner;

public class positiveOrNegative {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number");
        int number = scan.nextInt();
        if(number>=0){
            System.out.println("Positive");
        }else{
            System.out.println("Negative");
        }
        scan.close();

    }
    
}
