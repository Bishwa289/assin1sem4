import java.util.Scanner;
public class q5 {
    public static void rotate(int k,int arr[]){
        int[] newArr = new int[arr.length];
        // set n to the correct index after rotation
        int n = k % arr.length;
        // loop through arr and set values in newArr
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[n];
            n = (n + 1) % arr.length;
        }
        // copy values from newArr to arr
        for (int i = 0; i < arr.length; i++) {
            arr[i] = newArr[i];
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,6,7,8,9};
        System.out.println("enter your key: ");
        int k = sc.nextInt();
        rotate(k,arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
