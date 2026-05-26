class Solution {
    public int[] scoreValidator(String[] events) {
        int counter=0,score=0;
        int[] arr=new int[2];
        for(int i=0;i<events.length && counter!=10;i++){
            String c=events[i];
            if(c.equals("W")) counter+=1;
            else if(c.equals("WD") || c.equals("NB")) score+=1;
            else score+=c.charAt(0)-'0';
        }
        arr[0]=score;
        arr[1]=counter;
        return arr;
    }
}