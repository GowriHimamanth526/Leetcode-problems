1class Solution:
2    def containsNearbyDuplicate(self, nums, k):
3        last_seen = {}
4
5        for i, num in enumerate(nums):
6            if num in last_seen:
7                if i - last_seen[num] <= k:
8                    return True
9
10            # update last index of this number
11            last_seen[num] = i
12
13        return False