 public static int search (int arr[], int n, int x, int k) {
        //Complete the function
        int requiredJumps=0;
        int MinimumJumps=0;
        int i=0;
        while(i<n)
        {
            if(arr[i]==x)
            {
                return i;
            }
           requiredJumps=Math.abs(arr[i]-x);
           MinimumJumps=requiredJumps/k;
           if(requiredJumps%k!=0) MinimumJumps++;
           i=i+MinimumJumps;
        }
        return -1;
    }
    
    
