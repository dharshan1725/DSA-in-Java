import java.util.*;
public class Slargest{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        System.out.println("Enter the number of elements: ");
        int n=sc.nextInt();

        int[] a=new  int[n];

        System.out.println("Enter the elements: ");
         for(int i=0;i<n;i++){
             a[i]=sc.nextInt();
        }
        int Largest=0;
        int Slargest=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(a[i]>Largest){
                Largest=a[i];
            }
        }
        for(int i=0;i<n;i++){
            if(a[i] != Largest && a[i] > Slargest){
                Slargest=a[i];
            } 
        }
        System.out.println("The Second largest element is "+ Slargest);
    }
}