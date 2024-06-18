import java.util.Scanner;
public class factorial {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number");
        int number = scan.nextInt();
        int factorialOfANumber=1;//product of numbers
        if(number==0){
            System.out.println("The factorial of 0 is 1 ");
        }
        while(number>0){
        factorialOfANumber=factorialOfANumber*number;  // 3>0? 1*3 =3*2 =6*1 =6
        number--;
        
    }
    System.out.println("The factorial of a given numnber is "+factorialOfANumber);
    scan.close();
}
    
}
