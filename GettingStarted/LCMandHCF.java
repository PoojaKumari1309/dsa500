class Solution {
    static long gcd(long a,long b)
    {
        long rem=0;
        if (a > b)
        {
            while(a%b!=0) {
                rem = a % b;
                a=b;
                b=rem;
            }

            return b;
        }
        else
        {
            while(b%a!=0)
            {
                rem=b%a;
                b=a;
                a=rem;
            }
            return a;
        }

    }

    static Long[] lcmAndGcd(Long A , Long B)
    {
        long GCD=gcd(A,B);
        long lcm=(A*B)/gcd(A,B);
         Long [] res=new Long[2];
         res[0]=lcm;
         res[1]=GCD;
         return res;
    }
};
