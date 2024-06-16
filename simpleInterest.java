
public class simpleInterest {

    public static int calculateInterest(int principle , int time , int roi){
        int Interest = (principle*time*roi)/100 ;
        return Interest;
    }
    public static void main(String[] args){
        System.out.println("Simple Interest");
        int result = calculateInterest(50000, 1, 2);
        System.out.println("The calcualted simple interest is "+result);
    }
    
}
