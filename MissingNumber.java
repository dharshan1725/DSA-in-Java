public class MissingNumber{
    public static void main(String[] args) {
        int arr[]={0,2};
        Missing(arr);
        System.out.println("Missing number is : " +Missing(arr));
    }
    public static int Missing(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum = sum+arr[i];
        }
        int actualsum=arr.length*(arr.length+1)/2;
        int missingnumber=actualsum-sum;

        return missingnumber;
    }
}