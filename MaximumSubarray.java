public class MaxSubArraySum {
    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];   // initialize with first element
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // extend or restart the subarray
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            // update maxSum if currentSum is higher
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int result = maxSubArray(nums);
        System.out.println("Maximum Subarray Sum is: " + result);
    }
}
