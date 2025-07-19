import java.util.*;
public class MoveZeroes{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        int arr[]=new int[n];
        System.out.println("Enter a elements: ");
        for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
        }
        MoveZeroes(arr);
        System.out.println("Array after moving zeroes: ");
        for(int i=0;i<n;i++){
          System.out.print(arr[i] + " ");
        }
    }
    public static void MoveZeroes(int nums[]){
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[count]=nums[i];
                count++;
            }
        }
        while(count<nums.length){
            nums[count]=0;
            count++;
        }
    }
}