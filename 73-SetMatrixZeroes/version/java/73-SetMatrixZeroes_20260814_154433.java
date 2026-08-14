// Last updated: 14/08/2026, 15:44:33
1class Solution {
2    public void setZeroes(int[][] matrix) {
3        boolean zeroinFirstCol = false;
4        for (int row = 0; row < matrix.length; row++) {
5            if (matrix[row][0] == 0) zeroinFirstCol = true;
6            for (int col = 1; col < matrix[0].length; col++) {
7                if (matrix[row][col] == 0) {
8                    matrix[row][0] = 0;
9                    matrix[0][col] = 0;
10                }
11            }
12        }
13        for (int row = matrix.length - 1; row >= 0; row--) {
14            for (int col = matrix[0].length - 1; col >= 1; col--) {
15                if (matrix[row][0] == 0 || matrix[0][col] == 0) {
16                    matrix[row][col] = 0;
17                }
18            }
19            if (zeroinFirstCol) {
20                matrix[row][0] = 0;
21            }
22        }
23    }
24}