import java.util.*;
public class threesumClosest{
    public static void main(String[] args) {
        int nums[]={-1,2,1,-4};
        int target=1;
    }
    public int threeSum(int nums[],int target){
        Arrays.sort(nums);
        int ans=nums[0]+nums[1]+nums[2];

        for(int i=0;i<nums.length-2;i++){
            int j=i+1;
            int k=nums.length-1;
            
            while(j<k){
            int sum=nums[i]+nums[j]+nums[k];
            if(Math.abs(sum-target)<=Math.abs(ans-target))
            ans=sum;

            if(sum==target)
            return sum;
            if(sum>target)
            k-=1;
            else
            j+=1;
        }
    }
    return ans;
    }
}