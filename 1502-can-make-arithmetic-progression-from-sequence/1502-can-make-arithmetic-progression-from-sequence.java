class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
      Arrays.sort(arr);
      for(int i=0;i<arr.length-2;i++){
        if(Math.abs(arr[i]-arr[i+1])!=Math.abs(arr[i+2]-arr[i+1])) return false;
      }  
      return true;
    }
}