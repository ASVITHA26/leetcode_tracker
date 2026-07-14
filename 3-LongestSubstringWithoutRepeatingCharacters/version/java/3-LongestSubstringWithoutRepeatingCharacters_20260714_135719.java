// Last updated: 14/07/2026, 13:57:19
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        int left = 0;
4        int maxLength = 0;
5        HashSet<Character> charSet = new HashSet<>();
6        for (int right = 0; right < s.length(); right++) {
7            while (charSet.contains(s.charAt(right))) {
8                charSet.remove(s.charAt(left));
9                left++;
10            }
11            charSet.add(s.charAt(right));
12            maxLength = Math.max(maxLength, right - left + 1);
13        }
14        return maxLength;       
15    }
16}