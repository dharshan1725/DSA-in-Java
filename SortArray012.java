import java.util.*;
public class SortArray012{
      public static void main(String[] args) {
        int[] arr={2,2,0,1,0,1,1,1,2,0};
        
        System.out.println(Arrays.toString(SortArray(arr)));
          
      }
      public static int[] SortArray(int[] arr){
        int low=0;
        int mid=0;
        int high=arr.length-1;
        
        while(mid<=high){
            if(arr[mid]==0){
                int temp1=arr[mid];
                arr[mid]=arr[low];
                arr[low]=temp1;
                mid++;
                low++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                int temp2=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp2;
                high--;
            } 
        }
        return arr;
      }
}