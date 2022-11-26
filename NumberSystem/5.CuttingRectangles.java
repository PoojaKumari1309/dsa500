 static long gcd1(long a,long b)
    {
        if(a%b==0)return b;
        return gcd1(b,a%b);
    } 
    static List<Long> minimumSquares(long L, long B)
    {
        long gd=gcd1(L,B);
        long Area=(L*B);
        long Square=Area/(gd*gd);
        List<Long> res=new ArrayList<>();
        res.add(Square);
        res.add(gd);
        return res;
        // code here
    }
