// Last updated: 24/08/2026, 11:43:27
1class Solution {
2    public String shortestPalindrome(String s) {
3        String rev = new StringBuilder(s).reverse().toString();
4        String temp = s + "#" + rev;
5        int[] lps = new int[temp.length()];
6        for (int i = 1; i < temp.length(); i++) {
7            int j = lps[i - 1];
8            while (j > 0 && temp.charAt(i) != temp.charAt(j)) {
9                j = lps[j - 1];
10            }
11            if (temp.charAt(i) == temp.charAt(j)) {
12                j++;
13            }
14
15            lps[i] = j;
16        }
17        int palindromeLength = lps[temp.length() - 1];
18        String suffix = s.substring(palindromeLength);
19        String prefix = new StringBuilder(suffix).reverse().toString();
20        return prefix + s;
21    }
22}