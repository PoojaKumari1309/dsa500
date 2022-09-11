class Compute 
{
    static pair getMinMax(long a[], long n)  
    {
    long max=Long.MIN_VALUE;
    long min=Long.MAX_VALUE;
    for(int i=0;i<n;i++)
    {
       min= Math.min(min,a[i]);
       max=Math.max(max,a[i]);
    }
    return new pair(min,max);
    }
}
