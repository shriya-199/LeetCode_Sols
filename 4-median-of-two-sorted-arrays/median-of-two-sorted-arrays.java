class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int x = m+n;
        int[] arr = new int[x];
        int i=0;
        int j=0;
        int indx=0;
        while(i<m && j<n)
        {
            if(nums1[i]<nums2[j])
            {
                arr[indx++]=nums1[i];
                i++;
            }
            else if(nums1[i]==nums2[j])
            {
                arr[indx++]=nums1[i];
                arr[indx++]=nums2[j];
                i++;
                j++;
            }
            else
            {
                arr[indx++]=nums2[j];
                j++;
            }
        }
        while(i<m)
        {
            arr[indx++]=nums1[i++];
        }
        while(j<n)
        {
            arr[indx++]=nums2[j++];
        }
        int low=0;
        int high=x-1;
        int mid = (low+high)/2;
        if(x%2!=0)
        {
            return (double)arr[mid];
        }
        else
        {
            return (double)(arr[mid]+arr[mid+1])/2;
        }
    }
}
