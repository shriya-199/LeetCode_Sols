class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        int[] ori =new int[n];
        for(int i =0;i<n;i++)
        {
            ori[i]=arr[i];
        }
        Arrays.sort(arr);
        Map<Integer, Integer> mp = new HashMap<>();
        int rank =1;
        for(int i=0;i<n;i++)
        {
            if(mp.containsKey(arr[i])) continue;
            mp.put(arr[i],rank++);
        }
        for(int i =0;i<n;i++)
        {
            if(mp.containsKey(ori[i]))
            {
                ans[i]=mp.get(ori[i]);
            }
        }
        return ans;
    }
}