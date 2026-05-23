class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0,j=0,m=nums1.length,k=0,n=nums2.length;
        int[] arr=new int [m+n];
        while(i<m && j<n){
            if(nums1[i]>nums2[j]) arr[k++]=nums2[j++];
            else arr[k++]=nums1[i++]; 
        }
        for(;i<m;i++){
            arr[k++]=nums1[i];
        }
        for(;j<n;j++){
            arr[k++]=nums2[j];
        }
        System.out.println(Arrays.toString(arr));
        double c;
        if((m+n)%2==0) c=(double)(arr[(m+n)/2]+arr[(m+n-1)/2])/2;
        else c=arr[(m+n)/2];
        return c;
    }
}