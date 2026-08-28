// Last updated: 28/08/2026, 14:31:00
1class Solution {
2    int n;
3    List<List<String>> res=new ArrayList<>();
4    List<String> path=new ArrayList<>();
5    public List<List<String>> partition(String s) {
6        n=s.length();
7        helper(s,0);
8        return res;
9    }
10    public void helper(String s,int start){
11        if(start==n){
12            res.add(new ArrayList<>(path));
13            return;
14        }
15        for(int end=start;end<n;end++){
16            if(isPalindrome(s,start,end)){
17                path.add(s.substring(start,end+1));
18                helper(s,end+1);
19                path.remove(path.size()-1);
20            }
21        }}
22        public boolean isPalindrome(String s,int left,int right){
23            while(left<=right){
24                if(s.charAt(left)!=s.charAt(right)) return false;
25                left++;
26                right--;
27            }
28            return true;
29        
30    }
31}