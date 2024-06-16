import java.util.Scanner;

public class average {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //In this case N is 3 
        // please specify the extension of the code while runnig the program
        System.out.println("Enter the value of a ");
        int a = scan.nextInt();
        System.out.println("Enter the value of b ");
        int b = scan.nextInt();
        System.out.println("Enter the value of c ");
        int c = scan.nextInt();
        int result = (a+b+c)/3;
        System.out.println("The average of given numbers is "+result);
       scan.close();
    }
    
}
