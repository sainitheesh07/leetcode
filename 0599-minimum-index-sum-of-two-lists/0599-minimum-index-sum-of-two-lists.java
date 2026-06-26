class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
       HashMap<String,Integer> h1=new HashMap<>();
       List<String> l=new ArrayList<>();
       for(int i=0;i<list1.length;i++){
            h1.put(list1[i],i);
        }
        int c=Integer.MAX_VALUE;
       for(int i=0;i<list2.length;i++){
        if(h1.containsKey(list2[i])){
            int a=h1.get(list2[i])+i;
            if(a<c){
                c=a;
                l.clear();
                l.add(list2[i]);
            }
            else if(c==a) l.add(list2[i]);
        }
       }
       return l.toArray(new String[0]);
    }
}