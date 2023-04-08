import java.util.Arrays;
import java.util.Scanner;
public class q5 {
    /*public static void rotate(int k,int a[]){//{1,3,4,7,9}
        int size = a.length;
        int temp;
        for(int i=0;i<k;i++){
            temp = a[size-1];
            for(int j=size-1; j>0; j--){
                a[j]=a[j-1];
            }
            a[0]=temp;
        }
        System.out.println(Arrays.toString(a));
    }*/
    public static int[] rotate(int[] a, int k) {
        int n = a.length;
        int[] rotated = new int[n];
        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = a[i];
        }
        return rotated;
    }
    /*public static int[] rotateArray(int[] arr, int k) {
    int n = arr.length;
    k %= n;
    reverse(arr, 0, n - 1);
    reverse(arr, 0, k - 1);
    reverse(arr, k, n - 1);
    return arr;
}

private static void reverse(int[] arr, int left, int right) {
    while (left < right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
        right--;
    }
}
 */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = {1,3,4,7,9};
        System.out.println("enter your number: ");
        int k = sc.nextInt();
        int rotated[] = rotate(a, k);
        System.out.println(Arrays.toString(rotated));
        
    }
}
