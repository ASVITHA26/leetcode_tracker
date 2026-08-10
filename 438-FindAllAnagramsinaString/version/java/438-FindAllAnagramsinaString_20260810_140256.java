// Last updated: 10/08/2026, 14:02:56
1public class Solution{
2public List<Integer> findAnagrams(String s, String t) {
3    List<Integer> result = new LinkedList<>();
4    if (t.length() > s.length()) return result;
5    
6    Map<Character, Integer> map = new HashMap<>();
7    for (char c : t.toCharArray()) {
8        map.put(c, map.getOrDefault(c, 0) + 1);
9    }
10    
11    int counter = map.size();
12    int begin = 0, end = 0;
13    
14    while (end < s.length()) {
15        char c = s.charAt(end);
16        if (map.containsKey(c)) {
17            map.put(c, map.get(c) - 1);
18            if (map.get(c) == 0) counter--;
19        }
20        end++;
21        
22        while (counter == 0) {
23            if (end - begin == t.length()) {
24                result.add(begin);
25            }
26            
27            char tempc = s.charAt(begin);
28            if (map.containsKey(tempc)) {
29                map.put(tempc, map.get(tempc) + 1);
30                if (map.get(tempc) > 0) counter++;
31            }
32            begin++;
33        }
34    }
35    return result;
36}
37}