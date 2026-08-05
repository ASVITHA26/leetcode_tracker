// Last updated: 05/08/2026, 14:30:22
1public class Solution {
2    public int[][] generateMatrix(int n) {
3        int[][] matrix = new int[n][n];
4        if (n == 0) {
5            return matrix;
6        }
7        int rowStart = 0;
8        int rowEnd = n-1;
9        int colStart = 0;
10        int colEnd = n-1;
11        int num = 1;
12        while (rowStart <= rowEnd && colStart <= colEnd) {
13            for (int i = colStart; i <= colEnd; i ++) {
14                matrix[rowStart][i] = num ++; 
15            }
16            rowStart ++;
17            for (int i = rowStart; i <= rowEnd; i ++) {
18                matrix[i][colEnd] = num ++; 
19            }
20            colEnd --;
21            for (int i = colEnd; i >= colStart; i --) {
22                if (rowStart <= rowEnd)
23                    matrix[rowEnd][i] = num ++; 
24            }
25            rowEnd --;
26            for (int i = rowEnd; i >= rowStart; i --) {
27                if (colStart <= colEnd)
28                    matrix[i][colStart] = num ++; 
29            }
30            colStart ++;
31        }
32        return matrix;
33    }
34}