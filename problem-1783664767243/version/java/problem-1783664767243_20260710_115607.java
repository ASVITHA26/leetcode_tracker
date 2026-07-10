// Last updated: 10/07/2026, 11:56:07
1class Solution {
2    public void reverse(int [] arr,int st , int end){
3        while(st<end){
4        int temp=arr[st];
5        arr[st] = arr[end];
6        arr[end] = temp;
7        st++;
8        end--;
9        }
10    }
11    public void rotate(int[] nums, int k) {
12        int n=nums.length;
13        k=k%n;
14        reverse(nums,0,n-1);
15        reverse(nums,0,k-1);
16        reverse(nums,k,n-1);
17        
18    }
19}