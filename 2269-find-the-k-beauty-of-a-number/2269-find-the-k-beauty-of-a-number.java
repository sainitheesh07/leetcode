class Solution {
    public int divisorSubstrings(int num, int k) {
        int t=0,i=0,j=0;
        String s=String.valueOf(num);
        while(j<s.length()){
            if(j-i+1==k){
                int a=Integer.parseInt(s.substring(i,j+1));
                if(a!=0 && num%a==0) t++;
                i++;
            }
            j++;
        }
        return t;
    }
}