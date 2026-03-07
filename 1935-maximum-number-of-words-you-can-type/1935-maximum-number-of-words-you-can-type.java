class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        HashSet<Character> b=new HashSet<>();
        String[] arr=text.split(" ");
        int l=0;
        for(char c:brokenLetters.toCharArray()){
            b.add(c);
        }
        for(String i:arr){
            for(char c:i.toCharArray()){
                if(b.contains(c)){
                    l++;
                    break;
                }
            }
        }
        return arr.length-l;
    }
}