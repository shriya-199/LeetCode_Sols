class Solution {
    public void nextPermutation(int[] nums) {
        int pivot = -1;
        int n = nums.length;
        for(int i =nums.length-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                pivot =i;
                break;
            }
        }
        if(pivot!=-1)
        {
            for(int i =n-1;i>pivot;i--)
            {
                if(nums[i]>nums[pivot])
                {
                    swap(nums,i,pivot);
                    break;
                }
            }
        }
        reverse(nums,pivot+1,n-1);
    }

    public void swap(int[] a, int i, int j)
    {
        int temp = a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public void reverse(int[] a, int i, int j)
    {
        while(i<j)
        {
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
    }
}