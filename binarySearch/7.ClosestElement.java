  public static int lowerbound(int[]nums,int target){
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
    
    public static int findClosest(int arr[], int n, int target) 
    { int ceil=lowerbound(arr,target);
      if(ceil==0)return arr[ceil];
      if(ceil==arr.length) return arr[ceil-1];
      if(target-arr[ceil-1]>=arr[ceil]-target) return arr[ceil];
      else return arr[ceil-1];
    } 
