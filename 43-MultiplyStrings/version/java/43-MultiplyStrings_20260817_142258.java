// Last updated: 17/08/2026, 14:22:58
1class Solution {
2
3    public String multiply(String num1, String num2) {
4        if(num1.length() == 1 && num2.length() == 1){
5            int cnt1 = num1.charAt(0) - '0';
6            int cnt2 = num2.charAt(0) - '0';
7            int ans = cnt1 * cnt2;
8            return String.valueOf(ans);
9        }
10
11        int carry = 0;
12        int[] arr = new int[num1.length() + num2.length()];
13
14        for(int i = num2.length() - 1; i >= 0; i--){
15            char ch = num2.charAt(i);
16            int count1 = ch - '0';
17
18            for(int j = num1.length() - 1; j >= 0; j--){
19                char ch2 = num1.charAt(j);
20                int count2 = ch2 - '0';
21
22                int mul = count1 * count2;
23                int sum = arr[i + j + 1] + mul + carry;
24
25                carry = sum / 10;
26                arr[i + j + 1] = sum % 10;
27            }
28            arr[i] += carry;
29            carry = 0;
30        }
31        StringBuilder sb = new StringBuilder();
32        int index = 0;
33
34        for(int l = 0; l < arr.length; l++){
35            if(arr[l] == 0){
36                index = l;
37            } else {
38                break;
39            }
40        }
41
42        if(index == arr.length - 1){
43            return "0";
44        }
45
46        if(arr[index] == 0){
47            index++;
48        }
49
50        for(int k = index; k < arr.length; k++){
51            sb.append(arr[k]);
52        }
53
54        return sb.toString();
55    }
56}