class Solution {
    public int bitwiseComplement(int n) {
        String a = Integer.toBinaryString(n);
        String ans = "";
        for(int i =0;i<a.length();i++)
        {
            if(a.charAt(i)=='1')
            {
                ans+='0';
            }
            else
            {
                ans+='1';
            }
        }
        int number = Integer.parseInt(ans,2);
        return number;
    }
}