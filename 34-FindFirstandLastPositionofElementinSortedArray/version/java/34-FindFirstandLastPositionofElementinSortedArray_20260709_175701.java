// Last updated: 09/07/2026, 17:57:01
1public class Solution {
2    public String addBinary(String a, String b) {
3        StringBuilder sb = new StringBuilder();
4        int i = a.length() - 1, j = b.length() -1, carry = 0;
5        while (i >= 0 || j >= 0) {
6            int sum = carry;
7            if (j >= 0) sum += b.charAt(j--) - '0';
8            if (i >= 0) sum += a.charAt(i--) - '0';
9            sb.append(sum % 2);
10            carry = sum / 2;
11        }
12        if (carry != 0) sb.append(carry);
13        return sb.reverse().toString();
14    }
15}