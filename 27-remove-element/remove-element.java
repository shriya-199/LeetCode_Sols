class Solution {
    public int removeElement(int[] nums, int val) {
        int ans =0;
        int[] arr = new int[nums.length];
        int indx=0;
        for(int i =0;i<nums.length;i++)
        {
            if(nums[i]==val) continue;
            else
            {
                arr[indx++]=nums[i];
                ans++;
            }
        }
        for(int i =0;i<nums.length;i++)
        {
            nums[i]=arr[i];
        }
        return ans;
    }
}