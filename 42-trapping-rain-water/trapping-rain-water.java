class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] LMax = new int[n];
        LMax[0]=height[0];
        for(int i =1;i<n;i++)
        {
            LMax[i]= Math.max(LMax[i-1],height[i]);
        }
        int[] RMax = new int[n];
        RMax[n-1]=height[n-1];
        for(int i =n-2;i>=0;i--)
        {
            RMax[i]= Math.max(RMax[i+1],height[i]);
        }
        int total = 0;
        for(int i =0;i<n;i++)
        {
            if(height[i]<LMax[i] && height[i]<RMax[i])
            total+=Math.min(LMax[i],RMax[i])-height[i];
        }
        return total;
    }
}