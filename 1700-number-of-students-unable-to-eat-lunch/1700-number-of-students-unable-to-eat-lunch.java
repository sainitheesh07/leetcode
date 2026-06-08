class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] count=new int[2];
        for(int i:students) count[i]++;
        for(int i:sandwiches){
            if(count[i]==0) return count[0]+count[1];
            count[i]--;
        }
        return 0;
    }
}