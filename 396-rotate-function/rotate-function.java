class Solution {
    public int maxRotateFunction(int[] nums) {
        int F=0;
        int n = nums.length;
        int sum = Arrays.stream(nums).sum();
        for(int i=0;i<n;i++)
        {
            F += i*nums[i];
        }
        int ans = F;
        for(int i =n-1;i>0;i--)
        {
            F+=sum-n*nums[i];
            ans=Math.max(ans,F);
        }
        return ans;
    }
}