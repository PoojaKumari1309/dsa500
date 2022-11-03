static void approach2(long arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            long oldval=arr[i]%n;
            long newval=arr[(int)arr[i]]%n;
            arr[i]=oldval+(newval%n)*n;
        }
        for(int i=0;i<n;i++)
        {
            arr[i]=arr[i]/n;
        }
    }
    static void approach1(long arr[],int n)
    {
        long[]res=new long[n];
        for(int i=0;i<n;i++)
        {
            res[i]=arr[(int)arr[i]];
        }
        for(int i=0;i<n;i++)
        {
            arr[i]=res[i];
        }
    }
    static void arrange(long arr[], int n)
    {
       // approach1(arr,n);
       approach2(arr,n);
    }
}
