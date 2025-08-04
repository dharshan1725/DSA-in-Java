public class SortedRotatedArray{
    public static void main(String[] args) {
        SortedRotatedArray sar = new SortedRotatedArray();

        int[] arr = {3, 4, 5, 1, 2};
        System.out.println(sar.check(arr)); 

        int[] arr2 = {2, 1, 3, 4, 5};
        System.out.println(sar.check(arr2));
        
    }
    public boolean check(int[] n){
        int count=0;
        for(int i=0;i<n.length;i++){
           if(n[i] > n[(i + 1)% n.length]){
            count++;
           }
           if(count>1){
               return false;
           }
        }
        return true;
    }
}