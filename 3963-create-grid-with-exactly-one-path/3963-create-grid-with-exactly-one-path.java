class Solution {
    public String[] createGrid(int m, int n) {
        String[]a=new String[m];
        for(int i=0;i<m;i++){
            a[i]=new String(".");
            for(int j=0;j<n-1;j++){
                if(i==m-1) a[i]=a[i]+".";
                else a[i]=a[i]+"#";
            }
        }
        return a;
    }
}