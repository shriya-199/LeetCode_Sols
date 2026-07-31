class Solution {
    public int maxArea(int[] height) {
        int n = height.length-1;
        int maximumArea = 0;
        int i =0;
        int j = n;
        while(i<j)
        {
            maximumArea=Math.max(maximumArea,Math.min(height[i],height[j])*(j-i));
            if(height[i]<height[j]) i++;
            else
            {
                j--;
            }
        }
        return maximumArea;
    }
}