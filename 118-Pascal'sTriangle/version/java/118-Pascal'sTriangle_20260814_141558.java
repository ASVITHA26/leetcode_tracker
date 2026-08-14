// Last updated: 14/08/2026, 14:15:58
1import java.util.ArrayList;
2import java.util.List;
3class Solution {
4    public List<List<Integer>> generate(int numRows) {
5        List<List<Integer>> result = new ArrayList<>();
6        if (numRows == 0) {
7            return result;
8        }
9        List<Integer> firstRow = new ArrayList<>();
10        firstRow.add(1);
11        result.add(firstRow);
12        for (int i = 1; i < numRows; i++) {
13            List<Integer> prevRow = result.get(i - 1);
14            List<Integer> currentRow = new ArrayList<>();
15            currentRow.add(1);
16            for (int j = 1; j < i; j++) {
17                currentRow.add(prevRow.get(j - 1) + prevRow.get(j));
18            }
19            currentRow.add(1);
20            result.add(currentRow);
21        }
22
23        return result;
24    }
25}