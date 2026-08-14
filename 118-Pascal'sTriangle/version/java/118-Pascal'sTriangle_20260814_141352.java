// Last updated: 14/08/2026, 14:13:52
1import java.util.ArrayList;
2import java.util.List;
3
4class Solution {
5    public List<List<Integer>> generate(int numRows) {
6        List<List<Integer>> result = new ArrayList<>();
7        if (numRows == 0) {
8            return result;
9        }
10
11        List<Integer> firstRow = new ArrayList<>();
12        firstRow.add(1);
13        result.add(firstRow);
14
15        for (int i = 1; i < numRows; i++) {
16            List<Integer> prevRow = result.get(i - 1);
17            List<Integer> currentRow = new ArrayList<>();
18            currentRow.add(1);
19
20            for (int j = 1; j < i; j++) {
21                currentRow.add(prevRow.get(j - 1) + prevRow.get(j));
22            }
23
24            currentRow.add(1);
25            result.add(currentRow);
26        }
27
28        return result;
29    }
30}