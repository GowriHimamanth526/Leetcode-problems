1class Solution:
2    def runningSum(self, nums):
3        for i in range(1, len(nums)):
4            nums[i] += nums[i - 1]
5        return nums