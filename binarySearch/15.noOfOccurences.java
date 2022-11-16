public int firstoccurence(int[]nums,int target)
    {
        int left=0;
        int right=nums.length-1;
        while(left<=right)
        {
          int mid=left+(right-left)/2;
          if(nums[mid]>=target)
          {
             
              right=mid-1;
          } 
          else
          {
             left=mid+1;
          }
        }
        return left;
    }
    public int lastoccurence(int[]nums,int target)
    {
        int left=0;
        int right=nums.length-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(nums[mid]>target)
            {
              right=mid-1;  
            }
            else
            {
                
                left=mid+1;
            }
        }
        return right;
    }
    int count(int[] arr, int n, int x) {
        // code here
        int  first=firstoccurence(arr,x);
        int last=lastoccurence(arr,x);
        return last-first+1;
    }
}
