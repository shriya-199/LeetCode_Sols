class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int x = n+m;
        int[] arr = new int[x];
        int i = 0;
        int j = 0;
        int indx =0;
        while(i<n && j<m)
        {
            if(nums1[i]<nums2[j])
            {
                arr[indx++]=nums1[i];
                i++;
            }
            else if(nums1[i]>nums2[j])
            {
                arr[indx++]=nums2[j];
                j++;
            }
            else
            {
                arr[indx++]=nums1[i];
                arr[indx++]=nums2[j];
                i++;
                j++;
            }
        }
        while(i<n)
        {
            arr[indx++]=nums1[i];
            i++;
        }
        while(j<m)
        {
            arr[indx++]=nums2[j];
            j++;
        }
        int low = 0;
        int high = x-1;
        int mid = (low+high)/2;
        if(x%2==0)
        {
            return (double)(arr[mid]+arr[mid+1])/2.0;
        }
        return (double)(arr[mid]);
       
    }
}