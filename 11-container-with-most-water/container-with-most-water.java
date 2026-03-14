class Solution {
    public int maxArea(int[] height) {
        int i =0;
        int n = height.length-1;
        int j =n;
        int area = 0;
        while(i<j)
        {
            area = Math.max(area,(j-i)*Math.min(height[i],height[j]));
            if(height[i]<height[j])i++;
            else j--;
        }
        return area;
    }
}