class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph=paragraph.toLowerCase();
        String[] p=paragraph.split("[^a-z]+");
        System.out.println(Arrays.toString(p));
        HashMap<String,Integer> hp=new HashMap<>();
        HashSet<String> hs=new HashSet<>();
        for(String b:banned){
            hs.add(b);
        }
        for(int i=0;i<p.length;i++){
            if(!hs.contains(p[i])) hp.put(p[i],hp.getOrDefault(p[i],0)+1);
        }
        String as="";
        int a=-1;
        for(String i:hp.keySet()){
            System.out.println(i+" "+hp.get(i));
            if(hp.get(i)>a){
                a=hp.get(i);
                as=i;
            }
        }
        return as;
    }
}