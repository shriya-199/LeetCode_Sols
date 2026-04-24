class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int left =0, right =0, distance =0;
        for(int i =0;i<moves.length();i++)
        {
            if(moves.charAt(i)=='L') left++;
            else if(moves.charAt(i)=='R') right++;
            else distance++;
        }
        return left>right?left+distance-right:right+distance-left;
    }
}