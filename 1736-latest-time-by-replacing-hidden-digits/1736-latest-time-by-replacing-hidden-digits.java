class Solution {
    public String maximumTime(String time) {
        StringBuilder res=new StringBuilder();
        if(time.charAt(0)=='?'){
            if(time.charAt(1)>='4' && time.charAt(1)<='9') res.append('1');
            else res.append('2');
        }
        else res.append(time.charAt(0));

        if(time.charAt(1)=='?'){
            if(res.charAt(0)=='2') res.append('3');
            else res.append('9');
        }
        else res.append(time.charAt(1));
        res.append(':');
        if(time.charAt(3)=='?') res.append('5');
        else res.append(time.charAt(3));

        if(time.charAt(4)=='?') res.append('9');
        else res.append(time.charAt(4));
        return res.toString();
    }
}