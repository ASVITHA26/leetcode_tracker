// Last updated: 09/07/2026, 18:24:27
1import java.util.*;
2
3class RandomizedSet {
4    private List<Integer> nums;
5    private Map<Integer, Integer> indexMap;
6    private Random random;
7
8    public RandomizedSet() {
9        nums = new ArrayList<>();
10        indexMap = new HashMap<>();
11        random = new Random();
12    }
13
14    public boolean insert(int val) {
15        if (indexMap.containsKey(val)) {
16            return false;
17        }
18
19        nums.add(val);
20        indexMap.put(val, nums.size() - 1);
21        return true;
22    }
23
24    public boolean remove(int val) {
25        if (!indexMap.containsKey(val)) {
26            return false;
27        }
28
29        int index = indexMap.get(val);
30        int lastElement = nums.get(nums.size() - 1);
31
32        nums.set(index, lastElement);
33        indexMap.put(lastElement, index);
34
35        nums.remove(nums.size() - 1);
36        indexMap.remove(val);
37
38        return true;
39    }
40
41    public int getRandom() {
42        return nums.get(random.nextInt(nums.size()));
43    }
44}