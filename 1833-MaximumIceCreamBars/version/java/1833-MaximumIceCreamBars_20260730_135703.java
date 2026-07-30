// Last updated: 30/07/2026, 13:57:03
1class Solution {
2    public int maxIceCream(int[] costs, int coins) {
3        final int MAX_COST = 100000;
4        int[] freq = new int[MAX_COST + 1];
5        for (int cost : costs) {
6            freq[cost]++;
7        }
8        int answer = 0;
9        for (int cost = 1; cost <= MAX_COST; cost++) {
10            if (freq[cost] == 0) {
11                continue;
12            }
13            int canBuy = Math.min(freq[cost], coins / cost);
14            answer += canBuy;
15            coins -= canBuy * cost;
16        }
17        return answer;
18    }
19}