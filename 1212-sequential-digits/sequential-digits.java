class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans = new ArrayList<>();
        String s = "123456789";
        for(int x =2;x<=9;x++)
        {
            for(int y = 0;y+x<=9;y++)
            {
                int num = Integer.parseInt(s.substring(y,y+x));

                if(num>=low && num<=high)
                {
                    ans.add(num);
                }
            }
        }
        return ans;
    }
}