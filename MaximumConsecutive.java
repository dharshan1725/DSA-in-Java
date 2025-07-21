import java.util.*;
public class MaximumConsecutive{
   public static void main(String[] args) {
       int arr[]={100, 4, 200, 1, 3, 2};
       int longest=Maximumcons(arr);
       System.out.println("Maximum consecutive sequence length is : " + longest);
   }
   public static int Maximumcons(int[] arr){
    if(arr.length==0)
    return 0;

    Set <Integer> a=new HashSet<>();
    for(int num : arr){
        a.add(num);
    }
    int maxLength=0;

    for(int num : a){
        if(!a.contains(num-1)){
            int currNum=num;
            int currcount=1;

            while(a.contains(currNum+1)){
                currNum++;
                currcount++;
            }
            maxLength=Math.max(maxLength,currcount);
        }
    }
    return maxLength;
   }
}