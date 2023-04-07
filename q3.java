import java.util.*;//o
public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number: ");
        int num = sc.nextInt();
        int count = 0;
        int temp = num;
        while (temp != 0) {
            temp /= 10;
            count++;
        }
        int b[] = new int[count];
        System.out.print("reversed number is :");
        for (int i = count - 1; i >= 0; i--) {
            b[i] = num % 10;
            num /= 10;
            System.out.print(b[i]);
        }
        
    }
}

