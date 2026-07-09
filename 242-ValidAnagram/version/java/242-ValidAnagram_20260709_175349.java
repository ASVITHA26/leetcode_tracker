// Last updated: 09/07/2026, 17:53:49
1import java.util.*;
2
3class Solution {
4    public boolean isAnagram(String s, String t) {
5        char[] a = s.toCharArray();
6        char[] b = t.toCharArray();
7
8        Arrays.sort(a);
9        Arrays.sort(b);
10
11        return Arrays.equals(a, b);
12    }
13}