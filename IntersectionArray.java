import java.util.*;
public class IntersectionArray{
    public static void main(String[] args) {
        int ar1[]={4,9,5};
        int ar2[]={5,6,7};

        interop(ar1,ar2);
    }
    public static void interop(int ar1[],int ar2[]){
        Set <Integer> set=new HashSet<>();
        for(int nums: ar1){
            set.add(nums);
        }
        Set<Integer> intersection= new HashSet<>();
        for(int nums: ar2){
            if(set.contains(nums)){
                intersection.add(nums);
            }
        }
        System.out.println("Intersection of both arrays: " + intersection);
    }
}