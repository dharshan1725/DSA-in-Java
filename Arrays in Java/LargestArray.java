import java.util.*;
public class LargestArray{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter the number of elements:  ");
    int n=sc.nextInt();

    int[] a=new int[n];

    System.out.println("Enter the elements: ");
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
    int max=0;
    for(int i=1;i<a.length;i++){
        if(a[i]>max){
            max=a[i];
        }
    }
    System.out.println("The maximum element is: " +max);
}
}