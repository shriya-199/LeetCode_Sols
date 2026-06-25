class Solution {
    public int earliestTime(int[][] tasks) {
        int sum = Integer.MAX_VALUE;
        for (int i = 0; i < tasks.length; i++) 
        {
            sum = Math.min(sum, tasks[i][1] + tasks[i][0]);
        }
        return sum;
    }
}