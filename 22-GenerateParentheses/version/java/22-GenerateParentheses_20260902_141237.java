// Last updated: 02/09/2026, 14:12:37
1class Solution {
2
3    public ListNode deleteDuplicates(ListNode head) {
4
5        ListNode curr=head;
6        ListNode prev=new ListNode(-1000);
7
8        while(curr!=null){
9
10            if(curr.val==prev.val){
11
12                prev.next=curr.next;
13                curr=curr.next;
14
15            }else{
16
17                prev=curr;
18                curr=curr.next;
19            }
20        }
21
22        return head;
23    }
24}