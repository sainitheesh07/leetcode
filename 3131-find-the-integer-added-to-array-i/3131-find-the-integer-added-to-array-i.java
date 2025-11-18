class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int c=0;
        int[] arr=new int [2];
        for(int i=0;i<nums1.length;i++){
            c=nums2[i]-nums1[i];
            if(c==arr[0]) arr[1]++;
            else arr[0]=c;
        }
        return c;
    }
}