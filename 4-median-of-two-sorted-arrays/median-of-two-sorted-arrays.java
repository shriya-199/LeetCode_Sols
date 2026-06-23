class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int i = 0;
        int j =0;
        int[] arr = new int[m+n];
        int indx =0;
        while(i<n && j<m)
        {
            if(nums1[i]<nums2[j])
            {
                arr[indx++]=nums1[i];
                i++;
            }
            else if(nums2[j]<nums1[i])
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
        while(j<m)
        {
            arr[indx++]=nums2[j];
            j++;
        }
        while(i<n)
        {
            arr[indx++]=nums1[i];
            i++;
        }
        int size = m+n;
        int mid = size/2;
        if(size%2!=0)
        {
            return arr[mid];
        }
        return (arr[mid]+arr[mid-1])/2.0;
    }
}