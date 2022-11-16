 static int findFloor(long arr[], int n, long x)
    {
        int left=0;
        int right=n-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(arr[mid]==x)return mid;
            if(arr[mid]<x) left=mid+1;
            else  right=mid-1;
        }
        return right;
    }
    
}
//ceil value of the array 
 public static int ceilingInSortedArray(int n, int x, int[] arr) {
        // Write your code here.
        int left=0;
        int right=n-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(arr[mid]==x)return arr[mid];
            else if(arr[mid]<x) 
            {
                left=mid+1;
            }
            else 
            {
                right=mid-1;
            }
        }
        return arr[left];
    }
}
