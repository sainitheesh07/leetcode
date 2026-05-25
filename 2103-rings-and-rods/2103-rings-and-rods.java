class Solution {
    public int countPoints(String rings) {
        int[] r=new int[10];
        int[] g=new int[10];
        int[] b=new int[10];
        for(int i=0;i<rings.length();i+=2){
            char c=rings.charAt(i);
            int index=rings.charAt(i+1)-'0';
            if(c=='R') r[index]++;
            else if(c=='G') g[index]++;
            else b[index]++;
        }
        int c=0;
        for(int i=0;i<10;i++){
            if(r[i]>0 && g[i]>0 && b[i]>0) c++;
        }
        return c;
    }
}