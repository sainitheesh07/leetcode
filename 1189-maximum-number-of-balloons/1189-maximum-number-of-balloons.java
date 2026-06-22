class Solution {
    public int maxNumberOfBalloons(String text) {
        String s="balloon";
        if(text.length()<s.length()) return 0;
        int[] arr=new int [26];
        for(int i=0;i<text.length();i++){
            arr[text.charAt(i)-'a']++;
        }
        return Math.min(Math.min(arr[0],arr[1]),Math.min(arr['l'-'a']/2,Math.min(arr['n'-'a'],arr['o'-'a']/2)));
    }
}