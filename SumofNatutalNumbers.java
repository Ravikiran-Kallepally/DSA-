public class SumofNatutalNumbers {
    public static void sumOfNaturalNumbers(int n){
        int start =0 ;
        for(int i=0;i<=n;i++){
            start+=i;
        }
        System.out.println("The sum of first "+n+" natural numbers is "+start);

    }
    public static void main(String[] args){
        System.out.println("Sum of Natural numbers");
        sumOfNaturalNumbers(10);
    }
}
