class Solution {
    public boolean check(String s1,String s2){
        int n=s1.length(),m=s2.length();
        if(n>m) return false;
        return s2.substring(0,n).equals(s1) && s2.substring(m-n).equals(s1);
    }
    public int countPrefixSuffixPairs(String[] words) {
        int n=words.length,count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(check(words[i],words[j])) count++;
            }
        }
        return count;
    }
}