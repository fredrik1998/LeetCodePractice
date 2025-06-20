package TwoPointers;

public class MaxArea {
    public int maxArea(int[] height){
        int left = 0, right = height.length - 1;

        int maxArea = 0;

        while (left < right){
            int h = Math.min(height[left], height[right]);
            int width = right - left;
            maxArea = Math.max(maxArea, width * h);

            if(height[left] < height[right]){
                left++;
            }
            right--;
        }
        return maxArea;
    }
}
