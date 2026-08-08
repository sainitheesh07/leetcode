class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int s=0,t=0;
        int[] arr1=new int [101];
        int[] arr2=new int[101];
        for(int i:nums1) arr1[i]++;
        for(int i:nums2) arr2[i]++;
        for(int i=1;i<101;i++){
            if(arr1[i]!=0 && arr2[i]!=0){
                t+=arr1[i];
                s+=arr2[i];
            }
        }
        System.out.println(s+" "+t);
        return new int[] {t,s};
    }
}