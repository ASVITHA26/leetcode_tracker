// Last updated: 01/09/2026, 14:06:20
1class Solution {
2    public int numIslands(char[][] grid) {
3        if (grid == null || grid.length == 0) {
4            return 0;
5        }
6        
7        int numIslands = 0;
8        for (int i = 0; i < grid.length; i++) {
9            for (int j = 0; j < grid[0].length; j++) {
10                if (grid[i][j] == '1') {
11                    numIslands++;
12                    dfs(grid, i, j);
13                }
14            }
15        }
16        
17        return numIslands;
18    }
19    
20    private void dfs(char[][] grid, int i, int j) {
21        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != '1') {
22            return;
23        }
24        
25        grid[i][j] = '0'; 
26        dfs(grid, i + 1, j); 
27        dfs(grid, i - 1, j); 
28        dfs(grid, i, j + 1); 
29        dfs(grid, i, j - 1); 
30    }
31}