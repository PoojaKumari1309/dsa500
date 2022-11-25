public int gcd1(int a,int b)
    {
        if(a%b==0)return b;
        return gcd1(b,a%b);
    }
    public int gcd(int N , int arr[]) 
    { 
       //code here.
       int GCD=arr[0];
       for(int i=1;i<N;i++)
       {
          GCD=gcd1(GCD,arr[i]);
       }
       
      return GCD;
       
    } 
