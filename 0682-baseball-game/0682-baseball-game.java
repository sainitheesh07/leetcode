class Solution {
    public int calPoints(String[] op) {
        Stack<Integer> s=new Stack<>();
        int e=0;
        for(int i=0;i<op.length;i++){
            String p=op[i];
            if(p.equals("+")){
                int t1=s.pop();
                int t2=s.peek();
                int t=t1+t2;
                s.push(t1);
                s.push(t);
            }
            else if(p.equals("D")){
                int t1=s.peek();
                s.push(t1*2);
            }
            else if(p.equals("C")) s.pop();
            else{
                e=Integer.valueOf(p);
                s.push(e);
            }
        }
        int a=0;
        for(int i:s){
            a+=i;
        }
        return a;
    }
}