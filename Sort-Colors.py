1class Solution(object):
2    def sortColors(self, nums):
3        low, mid, high = 0, 0, len(nums) - 1
4        
5        while mid <= high:
6            if nums[mid] == 0:
7                nums[low], nums[mid] = nums[mid], nums[low]
8                low += 1
9                mid += 1
10            elif nums[mid] == 1:
11                mid += 1
12            else:  # nums[mid] == 2
13                nums[mid], nums[high] = nums[high], nums[mid]
14                high -= 1