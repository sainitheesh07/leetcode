class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char ch='\0';
        int t=0;
        for(int i=0;i<letters.length;i++){
            char c=letters[i];
            if(c>target){
                ch=c;
                break;
            }
            else t++;
        }
        if(t==letters.length) return letters[0];
        return ch;
    }
}