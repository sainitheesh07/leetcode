class Solution {
    static Map<String,Integer> hp=new HashMap<>();
    static{
        hp.put("I",1);
        hp.put("V",5);
        hp.put("X",10);
        hp.put("L",50);
        hp.put("C",100);
        hp.put("D",500);
        hp.put("M",1000);
        hp.put("IV",4);
        hp.put("IX",9);
        hp.put("XL",40);
        hp.put("XC",90);
        hp.put("CD",400);
        hp.put("CM",900);
    }
    public int romanToInt(String s) {
        int i=0,sum=0;
        while(i<s.length()){
            if(i<s.length()-1){
                String t=s.substring(i,i+2);
                if(hp.containsKey(t)){
                    sum+=hp.get(t);
                    i+=2;
                    continue;
                }
            }
            String o=s.substring(i,i+1);
            sum+=hp.get(o);
            i+=1;
        }
        return sum;
    }
}