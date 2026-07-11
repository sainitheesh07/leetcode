class Solution {
    String contains(String s,List<String> d){
        String r="";
        for(int i=0;i<d.size();i++){
            if(s.startsWith(d.get(i)) && r.equals("")) r=d.get(i);
            if(s.startsWith(d.get(i)) && !r.equals("") && r.length()>d.get(i).length()){
                r=d.get(i);
            }
        }
        return (r=="")?s:r;
    }
    public String replaceWords(List<String> dictionary, String sentence) {
        String[] arr=sentence.split(" ");
        String t="";
        for(int i=0;i<arr.length;i++){
            t+=contains(arr[i],dictionary);
            if(arr.length-1!=i) t+=" ";
        }
        return t;
    }
}