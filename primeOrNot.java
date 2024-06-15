public class primeOrNot {
    public static void isPrime(int n ){
        if(n%2==0){
            System.out.println("Not Prime");
        }else{
            System.out.println("Prime");
        }
    }
    public static void main(String[] args){
        System.out.println("Prime or Not ");
        isPrime(7);
    }
    
}
