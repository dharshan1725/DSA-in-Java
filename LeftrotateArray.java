import java.util.*;
public class LeftrotateArray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();

        int arr[]=new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
           arr[i] =sc.nextInt();
        }
         
        int temp=arr[0];
        for(int i=1;i<n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
        System.out.println("Array after rotated: ");
        for(int i=0;i<n;i++){
        System.out.println(arr[i]);
        }
    }

    }
