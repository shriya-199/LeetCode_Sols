class Solution {
    public String addBinary(String a, String b) {
        int n1 = a.length();
        int n2 = b.length();
        int max_len = Math.max(n1,n2);
        int i = 0;
        int x = 0;

        StringBuilder s = new StringBuilder();

        while(i<max_len || x>0)
        {
            int A = i<n1 ? a.charAt(n1-1-i)-'0':0;
            int B = i<n2 ? b.charAt(n2-1-i)-'0':0;

            int s_1 = A^B^x;
            int c_print = ((A ^ B) & x) | (A & B);

            s.append((char)(s_1 + '0'));
            x = c_print;

            i++;
        }

        return s.reverse().toString();
    }
}