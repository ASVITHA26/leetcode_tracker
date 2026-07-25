// Last updated: 25/07/2026, 14:58:31
1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        Map<String, List<String>> ans = new HashMap<>();
4        for (String s : strs) {
5            int[] count = new int[26];
6            for (char c : s.toCharArray()) {
7                count[c - 'a']++;
8            }
9            StringBuilder sb = new StringBuilder();
10            for (int num : count) {
11                sb.append(num).append("#");
12            }
13            String key = sb.toString();
14            if (!ans.containsKey(key)) {
15                ans.put(key, new ArrayList<>());
16            }
17            ans.get(key).add(s);
18        }
19        return new ArrayList<>(ans.values());        
20    }
21}