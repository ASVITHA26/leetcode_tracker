// Last updated: 03/08/2026, 13:49:25
1import java.util.*;
2class Solution {
3    public List<Integer> spiralOrder(int[][] matrix) {
4        List<Integer> ans = new ArrayList<>();
5        int top = 0;
6        int bottom = matrix.length - 1;
7        int left = 0;
8        int right = matrix[0].length - 1;
9        while (top <= bottom && left <= right) {
10            for (int i = left; i <= right; i++) {
11                ans.add(matrix[top][i]);
12            }
13            top++;
14            for (int i = top; i <= bottom; i++) {
15                ans.add(matrix[i][right]);
16            }
17            right--;
18            if (top <= bottom) {
19                for (int i = right; i >= left; i--) {
20                    ans.add(matrix[bottom][i]);
21                }
22                bottom--;
23            }
24            if (left <= right) {
25                for (int i = bottom; i >= top; i--) {
26                    ans.add(matrix[i][left]);
27                }
28                left++;
29            }
30        }
31        return ans;
32    }
33}