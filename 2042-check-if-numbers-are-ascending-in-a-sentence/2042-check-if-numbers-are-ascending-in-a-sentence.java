class Solution {
    public boolean areNumbersAscending(String s) {
        int n=s.length();
        int max=0;
        for(int i=0;i<n;i++){
            if(Character.isDigit(s.charAt(i))){
                int cur=0;
                while(i<n && Character.isDigit(s.charAt(i))){
                    cur*=10;
                    cur+=(s.charAt(i));
                    i++;
                }
                if(cur<=max) return false;
                max=cur;
            }
        }
        return true;
    }
}