import java.util.Arrays; //o(logn)
import java.util.Scanner;

public class q2 {

    public static String binary(int num) {
        int count = 0;
        int temp = num;
        while (temp != 0) {
            temp /= 2;
            count++;
        }
        int b[] = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            b[i] = num % 2;
            num /= 2;
        }
        String binary = Arrays.toString(b);
        return binary;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        String binary = binary(num);
        System.out.println("Binary equivalent: " + binary);
    }
}    
/*import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        double decimal = sc.nextDouble();

        int integerPart = (int) decimal;  // extract integer part
        double fractionalPart = decimal - integerPart;  // extract fractional part

        // convert integer part to binary
        int[] binaryInteger = new int[32];  // maximum 32 bits
        int index = 0;
        while (integerPart > 0) {
            binaryInteger[index++] = integerPart % 2;
            integerPart /= 2;
        }

        // convert fractional part to binary
        StringBuilder binaryFractional = new StringBuilder();
        while (fractionalPart > 0) {
            if (binaryFractional.length() >= 32) {  // check for overflow
                System.out.println("Error: Fractional part has too many bits to represent in binary.");
                return;
            }
            double product = fractionalPart * 2;
            if (product >= 1) {
                binaryFractional.append(1);
                fractionalPart = product - 1;
            } else {
                binaryFractional.append(0);
                fractionalPart = product;
            }
        }

        // combine integer and fractional parts to form complete binary representation
        System.out.print("The binary equivalent is: ");
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binaryInteger[i]);
        }
        if (binaryFractional.length() > 0) {
            System.out.print("." + binaryFractional.toString());
        }
    }
}

 */