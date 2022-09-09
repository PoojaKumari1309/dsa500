class Solution {
    static long nthFibonacci(long n){
        long a=0;
        long b=1;
        long fibo=0;
        
        for(int i=2;i<=n;i++)
        { fibo=(a+b)%1000000007;
          a=b;
          b=fibo;
        }
        return fibo;
    
    }
}
