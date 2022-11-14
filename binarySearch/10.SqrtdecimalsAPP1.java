public class Solution {
    public static double squareRoot(long n, int d) {
        double left=1.0;
        double right=n;
        double epsilon=Math.pow(10,-d);
        while(right-left>=epsilon)
        {
            double mid=left+(right-left)/2.0;
            if(mid*mid<=n) 
            {
                left=mid;
            }
            else
            {
                right=mid;
            }
        }
        return left;
    }
} 
// not run for all test cases 
