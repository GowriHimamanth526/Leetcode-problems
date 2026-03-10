1class Solution {
2    public int firstUniqChar(String s) {
3        
4        int[] count = new int[26];
5
6        // Count frequency of each character
7        for (int i = 0; i < s.length(); i++) {
8            count[s.charAt(i) - 'a']++;
9        }
10
11        // Find first character with frequency 1
12        for (int i = 0; i < s.length(); i++) {
13            if (count[s.charAt(i) - 'a'] == 1) {
14                return i;
15            }
16        }
17
18        return -1;
19    }
20}