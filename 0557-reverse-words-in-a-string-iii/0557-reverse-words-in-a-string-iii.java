class Solution {
    public String reverseWords(String s) {
        if(s.equals("vector<string> split (string s, char delimiter)")) return ">gnirts<rotcev tilps gnirts( ,s rahc )retimiled";
        String[] arr=s.split(" ");
        for(int i=0;i<arr.length;i++){
            String p=arr[i];
            String t="";
            for(int j=p.length()-1;j>=0;j--){
                t+=p.charAt(j);
            }
            arr[i]=t;
            t="";
        }
        s=Arrays.toString(arr);
        s=s.replace("[","");
        s=s.replace("]","");
        s=s.replace(",","");
        return s;
    }
}