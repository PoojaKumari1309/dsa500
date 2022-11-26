static int gcd(int a,int b)
    {
       if(a%b==0)return b;
       return gcd(b,a%b);
    }
    static int rooms(int N, int M){
        // code here
        int GD=gcd(N,M);
        int foreign=N/GD;
        int indian=M/GD;
        int minRoom=(foreign+indian);
        return minRoom;
        }
