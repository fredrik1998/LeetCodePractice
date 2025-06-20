package HashmapAndSets;

import java.util.HashMap;

class TwoSum{
    public int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> numbIndices = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(numbIndices.containsKey(complement)){
                return new int[]{numbIndices.get(complement), i};
            }
            numbIndices.put(nums[i], i);
        }
        return null;
    }
}