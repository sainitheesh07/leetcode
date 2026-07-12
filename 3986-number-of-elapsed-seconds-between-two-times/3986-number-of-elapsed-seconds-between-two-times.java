class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        int sh=((startTime.charAt(0)-'0')*10)+startTime.charAt(1)-'0';
        int eh=((endTime.charAt(0)-'0')*10)+endTime.charAt(1)-'0';

        int sm=((startTime.charAt(3)-'0')*10)+startTime.charAt(4)-'0';
        int em=((endTime.charAt(3)-'0')*10)+endTime.charAt(4)-'0';
        
        int ss=((startTime.charAt(6)-'0')*10)+startTime.charAt(7)-'0';
        int es=((endTime.charAt(6)-'0')*10)+endTime.charAt(7)-'0';
        return ((eh-sh)*3600)+((em-sm)*60)+(es-ss);
    }
}