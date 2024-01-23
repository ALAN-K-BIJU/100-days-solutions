class Solution(object):
    def minSubArrayLen(self, target, nums):
        left = 0
        minLength = float('inf')
        currentSum = 0
        for right in range(len(nums)):
            currentSum += nums[right]
            
            while currentSum >= target:
                minLength = min(minLength, right - left + 1)
                currentSum -= nums[left]
                left += 1
        
        if minLength == float('inf'):
            return 0
        
        return minLength
