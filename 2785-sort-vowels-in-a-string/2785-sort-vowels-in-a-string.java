class Solution {
    public String sortVowels(String s) {
        Set<Character> l=Set.of('A','E','I','O','U','a','i','e','o','u');
        List<Character> v=new ArrayList<>();
        for(char c:s.toCharArray()){
            if(l.contains(c)) v.add(c);
        }
        Collections.sort(v);
        int i=0;
        StringBuilder res=new StringBuilder();
        for(char c:s.toCharArray()){
            if(l.contains(c)) res.append(v.get(i++));
            else res.append(c);
        }
        return res.toString();
    }
}