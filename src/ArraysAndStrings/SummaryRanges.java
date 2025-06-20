package ArraysAndStrings;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public List<String> summaryRanges(int[] nums){
        if(nums == null || nums.length == 0){
            return new ArrayList<>();
            }

        List<String> ranges = new ArrayList<>();
        int start = 0;

        for(int i = 0; i < nums.length; i++){
            if(i + 1 == nums.length || nums[i] + 1 != nums[i + 1]){
                if(start == i){
                    ranges.add(String.valueOf(nums[start]));
                } else {
                    ranges.add(nums[start] + "->" + nums[i]);
                }
                start = i + 1;
            }
        }
        return ranges;
        }
    }
