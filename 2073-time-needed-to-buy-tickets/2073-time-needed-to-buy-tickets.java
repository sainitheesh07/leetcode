class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> t=new LinkedList<>();
        Queue<Integer> index=new LinkedList<>();
        for(int i=0;i<tickets.length;i++){
            t.offer(tickets[i]);
            index.offer(i);
        }
        int count=0;
        while(!t.isEmpty()){
            int a=t.poll();
            int b=index.poll();
            a--;
            count++;
            if(k==b && a==0) return count;
            if(a>0){
                t.offer(a);
                index.offer(b);
            }
        }
        return count;
    }
}