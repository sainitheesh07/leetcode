class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String,Boolean> hp=new HashMap<>();
        for(String i:arr){
            if(hp.containsKey(i)) hp.put(i,false);
            else hp.put(i,true);
        }
        int c=0;
        for(String i:arr){
            if(hp.get(i)==true){
                c++;
                if(c==k) return i;
            }
        }
        return "";
    }
}