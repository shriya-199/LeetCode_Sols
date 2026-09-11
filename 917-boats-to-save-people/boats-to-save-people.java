class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i =0;
        int n = people.length;
        int j = n-1;
        int boats =0;
        while(i<=j)
        {
            if(people[i]+people[j]<=limit)
            {
                boats++;
                i++;
                j--;
            }
            else
            {
                boats++;
                j--;
            }
        }
        return boats;
       
    }
}