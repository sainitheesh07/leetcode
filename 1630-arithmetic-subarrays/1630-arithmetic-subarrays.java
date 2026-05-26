class Solution {
    public boolean check(int[] arr){
        Arrays.sort(arr);
        int c=arr[1]-arr[0];
        for(int i=2;i<arr.length;i++){
            if(arr[i]-arr[i-1]!=c) return false;
        }
        return true;
    }
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> f=new ArrayList<>();
        for(int i=0;i<l.length;i++){
            f.add(check(Arrays.copyOfRange(nums,l[i],r[i]+1)));
        }
        return f;
    }
}