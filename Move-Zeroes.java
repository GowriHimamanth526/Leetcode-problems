1class Solution {
2    public void moveZeroes(int[] nums) {
3        
4        int index = 0; // position to place the next non-zero element
5        
6        for (int i = 0; i < nums.length; i++) {
7            if (nums[i] != 0) {
8                nums[index] = nums[i];
9                index++;
10            }
11        }
12
13        // fill remaining positions with zeros
14        while (index < nums.length) {
15            nums[index] = 0;
16            index++;
17        }
18    }
19}