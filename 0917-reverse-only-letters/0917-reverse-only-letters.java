class Solution {
    public String reverseOnlyLetters(String s) {
        int i=0,j=s.length()-1;
        char[] arr=s.toCharArray();
        while(i<j){
            char c=arr[i];
            char ch=arr[j];
            if(Character.isLetter(c) && Character.isLetter(ch)){
                char t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
                i++;
                j--;
            }
            if(!Character.isLetter(c)) i++;
            if(!Character.isLetter(ch)) j--;
        }
        StringBuilder sb=new StringBuilder();
        for(char t:arr){
            sb.append(t);
        }
        return sb.toString();
    }
}