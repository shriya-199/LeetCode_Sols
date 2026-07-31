class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int arr[] = new int[n+m];
        int i =0;int j=0; int indx=0;
        while(i<n && j<m)
        {
            if(nums1[i]<=nums2[j])
            {
                arr[indx++]=nums1[i]; i++;
            }
            else
            {
                arr[indx++]=nums2[j]; j++;
            }
        }
        while(i<n)
        {
            arr[indx++]=nums1[i]; i++;
        }
        while(j<m)
        {
            arr[indx++]=nums2[j]; j++;
        }

        int mid = (m+n)/2;
        if((m+n)%2==0)
        {
            return ((arr[mid]+arr[mid-1])/2.0);
        }
        return arr[mid];
    }
}