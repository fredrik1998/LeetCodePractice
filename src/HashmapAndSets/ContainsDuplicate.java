package HashmapAndSets;

import java.util.HashSet;

class ContainsDuplicate{
    public boolean containsDuplicate(int[] nums){
        HashSet<Integer> seen = new HashSet<>();

        for(int num : nums){
            if(!seen.add(num)){
                return true;
            }
        }
        return false;
    }
}