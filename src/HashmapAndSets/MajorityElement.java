package HashmapAndSets;

import java.util.HashMap;

public class MajorityElement {
    public int majorityElement(int[] nums){
        int majority = nums[0], count = 0;

        for(int num : nums){
            if(count == 0){
                majority = num;
            }
            count += (num == majority) ? 1 : -1;
        }
        return majority;
    }
}

