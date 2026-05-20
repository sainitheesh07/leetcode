class Solution {
    public String largestNumber(int[] nums) {
        String[] strs=new String [nums.length];
        for(int i=0;i<nums.length;i++){
            strs[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(strs,new Comparator<String>(){
            public int compare(String a,String b){
                String l1=a+b;
                String l2=b+a;
                return l2.compareTo(l1);
            }
        });
        if(strs[0].equals("0")) return "0";
        StringBuilder ln=new StringBuilder();
        for(String i:strs){
            ln.append(i);
        }
        return ln.toString();
    }
}