class Solution{
    static char get(int n)
        {
            if(n<10)return (char)('0'+n);
            if(n==10)return 'A';
            if(n==11)return 'B';
            if(n==12)return 'C';
            if(n==13)return 'D';
            if(n==14)return 'E';
            return 'F';
        }
    static String getNumber(int B, int N){
        
        StringBuilder str=new StringBuilder();
        
        while(N!=0)
        {
        char remainder=get(N%B);
        str.append(remainder);
        N=N/B;
            
        }
        return str.reverse().toString();
    }
}
