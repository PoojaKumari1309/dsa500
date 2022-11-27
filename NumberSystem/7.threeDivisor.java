 public boolean perfectSquare(int n)
    {
        int ans=(int)Math.sqrt(n);
        if(ans*ans==n)return true;
       return false;
    }
    public boolean prime(int n)
    {
        if(n==1)return false;
        for(int i=2;(i*i)<=n;i++)
        {
            if(n%i==0)return false;
        }
        return true;
    }
    public boolean isThree(int n) {
            if(perfectSquare(n)==false) return false;
             int sqrt=(int)Math.sqrt(n);
             if(prime(sqrt)==true)return true;
        return false;
    }
}
