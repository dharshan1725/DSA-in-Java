import java.util.*;
public class RotateArray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr=new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter number of positions to rotate (k): ");
        int k = sc.nextInt();
        k = k % n;

        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);

        System.out.println("Array after rotated by " + k + " places: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void reverse(int[] arr,int start,int end){
        while(start<end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
        }
    }
}