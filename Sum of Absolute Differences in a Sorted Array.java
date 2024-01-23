class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int[] ans = new int[nums.length];
        int sum = 0;
        int prefixsum = 0;
        int value = 0; 
        for(int i = 0; i < nums.length;i++){
            sum += nums[i];
        }
        for(int i = 0; i < nums.length;i++){
            sum -= nums[i];
            value = ((nums[i]*i)-(prefixsum))+ ((sum) - (nums[i]*((nums.length)-i - 1)));
            prefixsum += nums[i];
            ans[i] = value;
        }
        return ans;
    }
}