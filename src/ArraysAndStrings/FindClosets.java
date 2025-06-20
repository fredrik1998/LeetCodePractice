package ArraysAndStrings;

public class FindClosets {
    public int findClosetsNumber(int[] nums){
        if(nums == null || nums.length == 0){
            return -1;
        }

        int closets = nums[0];

        for(int num : nums){
            if(Math.abs(num) < Math.abs(closets) || (Math.abs(num) == Math.abs(closets) && num > closets)){
                closets = num;
            }
        }
        return closets;
    }
}
