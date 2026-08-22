// Last updated: 22/08/2026, 14:03:03
1class Solution {
2    public String removeDuplicateLetters(String s) {
3        Map<Character, Integer> lastOccurrence = new HashMap<>();
4        for (int i = 0; i < s.length(); i++) {
5            lastOccurrence.put(s.charAt(i), i);
6        }
7        Stack<Character> stack = new Stack<>();
8        Set<Character> visited = new HashSet<>();
9        for (int i = 0; i < s.length(); i++) {
10            if (visited.contains(s.charAt(i))) {
11                continue;
12            }
13            while (!stack.isEmpty() && s.charAt(i) < stack.peek() && i < lastOccurrence.getOrDefault(stack.peek(), -1)) {
14                visited.remove(stack.pop());
15            }
16
17            visited.add(s.charAt(i));
18            stack.push(s.charAt(i));
19        }
20        StringBuilder result = new StringBuilder();
21        for (char ch : stack) {
22            result.append(ch);
23        }
24        return result.toString();        
25    }
26}