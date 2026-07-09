// Last updated: 09/07/2026, 18:04:57
1class Solution {
2    public String minWindow(String s, String t) {
3        if (s.length() < t.length()) {
4            return "";
5        }
6        int[] need = new int[128];
7        for (char c : t.toCharArray()) {
8            need[c]++;
9        }
10        int left = 0;
11        int count = t.length(); 
12        int minLen = Integer.MAX_VALUE;
13        int start = 0;
14        for (int right = 0; right < s.length(); right++) {
15            char r = s.charAt(right);
16            if (need[r] > 0) {
17                count--;
18            }
19            need[r]--;
20            while (count == 0) {
21                if (right - left + 1 < minLen) {
22                    minLen = right - left + 1;
23                    start = left;
24                }
25                char l = s.charAt(left);
26                need[l]++;
27                if (need[l] > 0) {
28                    count++;
29                }
30
31                left++;
32            }
33        }
34
35        return minLen == Integer.MAX_VALUE
36                ? ""
37                : s.substring(start, start + minLen);
38    }
39}