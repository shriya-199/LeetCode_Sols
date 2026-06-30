class Solution {
    public int minimumCost(int[] nums) {
        int n = nums.length;
        if(n==3) return Arrays.stream(nums).sum();
        int sum =nums[0];
        int smallest = Integer.MAX_VALUE;
        int scnd_smallest = Integer.MAX_VALUE;

        for(int i = 1;i<n;i++)
        {
            if(nums[i]<smallest)
            {
                scnd_smallest=smallest;
                smallest = nums[i];
            }
            else if(nums[i]<scnd_smallest)
            {
                scnd_smallest = nums[i];
            }
        }
        return sum+smallest+scnd_smallest;


    }
}