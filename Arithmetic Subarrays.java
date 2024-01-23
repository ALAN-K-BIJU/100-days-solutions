class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> result = new ArrayList<>();        
        for (int i = 0; i < l.length; i++) {
            int left = l[i];
            int right = r[i];            
            int[] subArray = Arrays.copyOfRange(nums, left, right + 1);
            Arrays.sort(subArray);            
            boolean isArithmetic = true;
            int diff = subArray[1] - subArray[0];            
            for (int j = 1; j < subArray.length - 1; j++) {
                if (subArray[j + 1] - subArray[j] != diff) {
                    isArithmetic = false;
                    break;
                }
            }           
            result.add(isArithmetic);
        }  
        return result;
    }
}