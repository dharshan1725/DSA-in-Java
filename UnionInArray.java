import java.util.*;
public class UnionInArray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of first array: ");
        int n1=sc.nextInt();

        int ar1[]=new int[n1];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n1;i++){
           ar1[i]=sc.nextInt();
        }

        System.out.println("Enter the size of second array: ");
        int n2=sc.nextInt();

        int ar2[]=new int[n2];
        System.out.println("enter the elements: ");
        for(int i=0;i<n2;i++){
            ar2[i]=sc.nextInt();
        }
        unionop(ar1,ar2);
    }
    public static void unionop(int[] ar1,int[] ar2){
        Set<Integer> set= new HashSet<>();
        for(int nums : ar1){
            set.add(nums);
        }
        for(int nums : ar2){
            set.add(nums);
        }
        System.out.println("Union of both arrays:" + set);

    }
}