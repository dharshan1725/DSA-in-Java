import java.util.*;
public class LongestsubArray{
    public static void main(String[] args) {
        
        int[] arr={2,-1,1};
        int k=1;

        LongestsubArray(arr, k);  
        System.out.println("Longest subarray with sum of k: " + LongestsubArray(arr, k));
    }
    public static int LongestsubArray(int[] arr,int k){
       Map <Integer,Integer> map= new HashMap<>();

       int sum=0;
       int maxLen=0;

       for(int i=0;i<arr.length;i++){

        sum+= arr[i];

        if(sum==k){
            maxLen=i+1;
        }
        if(map.containsKey(sum-k)){
            int prevIndex=map.get(sum-k);
            maxLen=Math.max(maxLen,i-prevIndex);
        }
        if(!map.containsKey(sum)){
            map.put(sum,i);
        }
       }
       return maxLen;
    }
}

