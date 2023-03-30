import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int searchInsert(int[] nums, int target) {
        List<Integer> integers = new ArrayList<>();
        int index = 0;
        for (int num:nums)
            integers.add(num);

        if (integers.contains(target)){
            index = integers.indexOf(target);
        } else {
            integers.add(target);
            Collections.sort(integers);
            index = integers.indexOf(target);
        }

        return index;
    }
}