class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> matrix = new ArrayList<>();
        Arrays.sort(arr);
        int n=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            n=Math.min(arr[i]-arr[i-1],n);
        }
        System.out.println(n);
        for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[i-1]==n){
                ArrayList<Integer> a=new ArrayList();
                a.add(arr[i-1]);
                a.add(arr[i]);
                matrix.add(a);
            }
        }
        return matrix;
    }
}