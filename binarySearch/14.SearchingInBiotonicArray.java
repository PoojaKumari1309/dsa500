 public int peakIndexInMountainArray(int[] arr) {
       int left=1;
       int right=arr.length-2;
       while(left<=right)
       {
           int mid=left+(right-left)/2;
           if(arr[mid]>arr[mid-1]&& arr[mid]>arr[mid+1])
           {
               return mid;
           }
           else if(arr[mid]>arr[mid-1])
           {
               left=mid+1;
           }
           else{
               right=mid-1; 
           }
       }
       return -1;
    }
    
    public int incSearch(int[]A,int left,int right,int target)
    {
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(A[mid]<target) left=mid+1;
            else if(A[mid]==target)return mid;
            else right=mid-1;
        }
        return -1;
    }
    public int decSearch(int[]A,int left,int right,int target)
    {
         while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(A[mid]>target) left=mid+1;
            else if(A[mid]==target)return mid;
            else right=mid-1;
        }
        return -1;
    }
    
    public int solve(int[] A, int B) {
        int peakpoint=peakIndexInMountainArray(A);
        int left=incSearch(A,0,peakpoint-1,B);
        int right=decSearch(A,peakpoint+1,A.length-1,B);
        if(left==-1)
        {
            return right;
        }
        return left;
    }
}
