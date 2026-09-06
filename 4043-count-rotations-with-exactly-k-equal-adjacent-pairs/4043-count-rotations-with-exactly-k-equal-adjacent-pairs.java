class Solution {
    public int countRotations(String s, int k) {
        int count=0;
        for(int i=0;i<s.length();i++){
            int c=0;
            String t=s.substring(i)+s.substring(0,i);
            for(int j=0;j<s.length()-1;j++){
                if(t.charAt(j)==t.charAt(j+1)) c++;
            }
            if(c==k) count++;
        }
        return count;
    }
}