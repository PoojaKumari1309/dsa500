class Solution {
    public static int prime(int n)
    {    if(n==1)
            {
                return 0;
            }
        for(int i=2;i*i<=n;i++)
        
        {
            if(n%i==0)
            {
                return 0;
            }
            
        }
        return 1;
    }
    ArrayList<Integer> primeRange(int M, int N) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=M;i<=N;i++)
        
        {
            if(prime(i)==1)
            {
                arr.add(i);
            }
        }
        return arr;
    
    }
}
