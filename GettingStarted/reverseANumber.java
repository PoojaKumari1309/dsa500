class Solution {
    public int reverse(int x)
    {
        int num=x;
        int digit=0;
        int rev=0;
        while(num!=0)
        {
        digit=num%10;
            if(rev>(Integer.MAX_VALUE)/10 || rev<(Integer.MIN_VALUE)/10)
            {
                return 0;
            }
            rev=(rev*10)+digit;
            num=num/10;
        }
        
        return rev;
    }
}
