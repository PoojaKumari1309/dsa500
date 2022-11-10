 int transitionPoint(int arr[], int n) {
        if(n==0||arr[n-1]==0)return -1;
        int left=0;
        int right=n-1;
        while(left<=right)
        {
            int mid=(left+(right-left)/2);
            if(arr[mid]==0)left=mid+1;
            else right=mid-1;
        }
        return left;
        
    }
