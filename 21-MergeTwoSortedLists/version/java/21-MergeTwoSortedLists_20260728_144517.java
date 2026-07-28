// Last updated: 28/07/2026, 14:45:17
1class Solution {
2    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
3        ListNode dummy = new ListNode();
4        ListNode cur = dummy;
5        while (list1 != null && list2 != null) {
6            if (list1.val > list2.val) {
7                cur.next = list2;
8                list2 = list2.next;
9            } else {
10                cur.next = list1;
11                list1 = list1.next;
12            }
13            cur = cur.next;
14        }
15        cur.next = (list1 != null) ? list1 : list2;
16        return dummy.next;        
17    }
18}