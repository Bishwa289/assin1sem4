import java.util.Scanner; // o(sqrt(n))
public class q1 {
    static boolean prime(int n){
        boolean isPrime = true;
        if (n <= 1) {
            isPrime = false;
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    return false;
                }
            }
        }
        return true;
    }
    /*static int prime(int n){
        if(n==1){
            return 1;
        }
        for(int i=2; i < n; i++) {
            if(n!=2){
                if(n % i==0){
                return i;
                }
            }    
        }
        return 0; 
    }*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number: ");
        int n = sc.nextInt();
        boolean a = prime(n);   
        if(a){
            System.out.println("prime number");
        }
        else{
            System.out.println("not a prime number");
        }
    }
}
