class Solution {
    boolean pat(String a,String b){
        for(int i=0;i<a.length();i++){
            if(a.indexOf(a.charAt(i))!=b.indexOf(b.charAt(i))) return false;
        }
        return true;
    }
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> l=new ArrayList<>();
        for(String i:words){
            if(pat(i,pattern)) l.add(i);
        }
        return l;
    }
}