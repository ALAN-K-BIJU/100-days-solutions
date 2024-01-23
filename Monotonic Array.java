class Solution {
    public boolean isMonotonic(int[] nums) {
        int i=0;
        int j=1;
        boolean a=true;
        int k=nums.length - 1;
        if(j<k){
            while(nums[i]==nums[j] && j<k){
                i++;
                j++;
                a=true;
            }if(nums[i]>nums[j]){
                for(int q=i;q<k;q++){
                    if (nums[q]>=nums[q+1]){
                        a=true;
                    }else{
                        a=false;
                        break;
                    }
                }
            }else{
                for(int q=i;q<k;q++){
                    if (nums[q]<=nums[q+1]){
                        a=true;
                    }else{
                        a=false;
                        break;
                    }
                }
            }
        }
        return a;
    }
}