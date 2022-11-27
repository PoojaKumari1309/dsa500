static int Approach1(int n )
    {
        if(n==1)return 0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)return 0;
        }
        return 1;
    }
    static int Approach2(int n )
    {
        if(n<=1)return 0;
        if(n<=3)return 1;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)return 0;
        }
        return 1;
    }
     static int Approach3(int n )
    {
        if(n<=1)return 0;
        if(n<=3)return 1;
        for(int i=2;(i*i)<=n;i++)
        {
            if(n%i==0)return 0;
        }
        return 1;
    }
    static int isPrime(int N){
       return  Approach3(N);
        // code here
    }
