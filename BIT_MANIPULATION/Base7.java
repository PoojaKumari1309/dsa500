class Solution {
    public String convertToBase7(int num) {
        long res=0,power=1;

        while(num!=0)
        {
            int remainder=num%7;
            res=res+power*remainder;
            num=num/7;
            power=power*10;
        }

        return String.valueOf(res);
        
    }
}
