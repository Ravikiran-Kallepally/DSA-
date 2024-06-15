public class maxOfThreeNumbers {
    public static void maxOfThree(int a, int b, int c) {
        if (a > b) {
            if (a > c) {
                System.out.println("A is greater than B and C , The value of A is " + a);
            }
        }  if (b > a) {
            if (b > c) {
                System.out.println("B is greater than A and C , The value of B is " + b);

            }
        } if(c>a){
            if(c>b){
                System.out.println("C is greater than B and A , The value of C is " + c);
            }
        }

    }

    public static void main(String[] args) {
        System.out.println("Max of given three numbers ");
        maxOfThree(10, 20, 30);
    }

}
