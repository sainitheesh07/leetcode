class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int l=0;
        for(int i:arr1){
            l=Math.max(l,i);
        }
        int[] count=new int[l+1];
        for(int i=0;i<arr1.length;i++){
            count[arr1[i]]++;
        }
        int[] result=new int[arr1.length];
        int index=0;
        for(int i=0;i<arr2.length;i++){
            while(count[arr2[i]]>0){
                result[index]=arr2[i];
                index++;
                count[arr2[i]]--;
            }
        }
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                result[index]=i;
                index++;
                count[i]--;
            }
        }
        return result;
    }
}