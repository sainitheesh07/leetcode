class Solution {
    String bit(int n){
        StringBuilder s=new StringBuilder();
        while(n>0){
            if(n%2==0) s.append('0');
            else s.append('1');
            n/=2;
        }
        return s.reverse().toString();
    }
    public int binaryGap(int n){
        String b=bit(n);
        int last=0,gap=0;
        for(int i=0;i<b.length();i++){
            if(b.charAt(i)=='1'){
                if(last!=-1){
                    gap=Math.max(gap,i-last);
                }
                last=i;
            }
            
        }
        return gap;
    }
}