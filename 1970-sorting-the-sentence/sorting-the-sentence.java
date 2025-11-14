class Solution {
    public String sortSentence(String s) {
        s=s.trim();
        String[] r=s.split(" ");
        String[] e=new String[r.length];
        for(int i=0;i<r.length;i++){
            String p=r[i];
            char t='\0';
            for(int j=0;j<r[i].length();j++){
                char c=p.charAt(j);
                if(c>47 && c<58) t=c;
            }
            int a=t-'0'-1;
            System.out.println(a);
            e[a]=r[i];
        }
        String res="";
        for(int i=0;i<e.length;i++){
            for(int j=0;j<e[i].length();j++){
                char c=e[i].charAt(j);
                if((c>64 && c<91) || (c>96 && c<123)) res+=c;
            }
            res+=" ";
        }
        res=res.trim();
        return res;
    }
}