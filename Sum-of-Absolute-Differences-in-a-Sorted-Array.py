1class Solution:
2    def getSumAbsoluteDifferences(self, nums):
3        n = len(nums)
4        total = sum(nums)
5
6        prefix = 0
7        result = [0] * n
8
9        for i in range(n):
10            # sum of differences with left side
11            left = nums[i] * i - prefix
12
13            # sum of differences with right side
14            right = (total - prefix - nums[i]) - nums[i] * (n - i - 1)
15
16            result[i] = left + right
17
18            prefix += nums[i]
19
20        return result