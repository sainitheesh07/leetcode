class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<String,Character> hp=new HashMap<>();
        HashMap<Character,String> hs=new HashMap<>();
        String[] arr=s.split(" ");
        if(pattern.length()!=arr.length) return false;
        for(int i=0;i<arr.length;i++){
            char c=pattern.charAt(i);
            String t=arr[i];
            if(hs.containsKey(c)){
                if(!hs.get(c).equals(t)) return false;
            }
            else hs.put(c,t);

            if(hp.containsKey(t)){
                if(hp.get(t)!=c) return false;
            }
            else hp.put(t,c);
        }
        return true;
    }
}