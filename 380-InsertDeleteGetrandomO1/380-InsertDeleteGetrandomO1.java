// Last updated: 10/07/2026, 12:33:30
import java.util.*;

class RandomizedSet {
    private List<Integer> nums;
    private Map<Integer, Integer> indexMap;
    private Random random;

    public RandomizedSet() {
        nums = new ArrayList<>();
        indexMap = new HashMap<>();
        random = new Random();
    }

    public boolean insert(int val) {
        if (indexMap.containsKey(val)) {
            return false;
        }

        nums.add(val);
        indexMap.put(val, nums.size() - 1);
        return true;
    }

    public boolean remove(int val) {
        if (!indexMap.containsKey(val)) {
            return false;
        }

        int index = indexMap.get(val);
        int lastElement = nums.get(nums.size() - 1);

        nums.set(index, lastElement);
        indexMap.put(lastElement, index);

        nums.remove(nums.size() - 1);
        indexMap.remove(val);

        return true;
    }

    public int getRandom() {
        return nums.get(random.nextInt(nums.size()));
    }
}