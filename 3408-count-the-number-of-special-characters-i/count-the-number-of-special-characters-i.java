class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character>ch = new HashSet<>();
        for(char c:word.toCharArray())
        {
            ch.add(c);
        }
        int ans =0;
        for(char chr = 'a'; chr <= 'z'; chr++) 
        {
            if(ch.contains(chr) && ch.contains((char)(chr - 'a' + 'A'))) 
            {
                ans++;
            }
        }
        return ans;
    }
}