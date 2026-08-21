class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length-1;
        int maxiArea = -1;
        while(i<j)
        {
            maxiArea = Math.max(maxiArea,(Math.min(height[i],height[j])*(j-i)));
            if(height[i]>height[j]) j--;
            else i++;

        }
        return maxiArea;

    }
}