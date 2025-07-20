import java.util.*;
public class RearrangeArray{
public static void main(String[] args) {
    int arr[]={1,-2,-3,5};
    System.out.println(Arrays.toString(Rearrange(arr)));
}
public static int[] Rearrange(int arr[]){
    int n=arr.length;
    int positive =0;
    int  negative=1;
    int result[]=new int[n]; 
    for(int i=0;i<n;i++){
        if(arr[i]>0){
            result[positive]=arr[i];
            positive+=2;
        }
        else if(arr[i]<0){
            result[negative]=arr[i];
            negative+=2;
        }
    }
    return result;
}
}