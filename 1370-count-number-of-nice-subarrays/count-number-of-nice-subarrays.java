class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int cnt = 0;
        int[] arr = new int[nums.length+1];
        arr[0]=1;
        int x =0;
        int ans = 0;
        for(int v:nums)
        {
            x+=v&1;
            if(x-k>=0)
            {
                cnt+=arr[x-k];
            }
            arr[x]++;
        }
        return cnt;
    }
}