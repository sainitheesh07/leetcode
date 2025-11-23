class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
       int n=answerKey.length(),a=0,f=0,t=0,l=0;
       for(int i=0;i<n;i++){
        char c=answerKey.charAt(i);
        if(c=='T') t++;
        else f++;
        while(Math.min(t,f)>k){
            if(answerKey.charAt(l)=='T') t--;
            else f--;
            l++;
        }
        a=Math.max(a,i-l+1);
       }
       return a;
    }
}