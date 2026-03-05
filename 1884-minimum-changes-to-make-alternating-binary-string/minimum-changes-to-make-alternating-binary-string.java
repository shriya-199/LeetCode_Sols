class Solution {
    public int minOperations(String s) {
        int n = s.length();
        int cnt =0;
        for(int i =0;i<n;i++)
        {
            cnt+=(s.charAt(i)^i)&1;
        }
        return Math.min(cnt,n-cnt);
    }
}