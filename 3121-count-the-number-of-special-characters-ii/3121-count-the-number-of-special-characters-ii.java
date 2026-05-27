class Solution {
    public int numberOfSpecialChars(String word) {
        int[] upper=new int[26];
        int[] lower=new int[26];
        Arrays.fill(upper,-1);
        Arrays.fill(lower,-1);
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(Character.isLowerCase(c)){
                lower[c-'a']=i;
            }
            else{
                if(upper[c-'A']==-1) upper[c-'A']=i;
            }
        }
        int count=0;
        for(int i=0;i<26;i++){
            if(lower[i]<upper[i] && lower[i]!=-1 && upper[i]!=-1) count++;
        }
        return count;
    }
}