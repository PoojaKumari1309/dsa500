    public int lowerbound(int[]nums,int target){
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
    public List<Integer> findClosestElements(int[] arr, int k, int target) {
        int ceil=lowerbound(arr,target);
        int floor=ceil-1;
        List<Integer> res=new ArrayList<>();
        while(floor>=0 && ceil<arr.length && res.size()<k)
        {
            if((target-arr[floor]<=arr[ceil]-target))
            {
                res.add(arr[floor]);
                floor--;
            }
            else
            {
                res.add(arr[ceil]);
                ceil++;
            }
        }
        while(floor>=0 && res.size()<k)
        {
                 res.add(arr[floor]);
                floor--;
        }
        while(ceil<arr.length && res.size()<k)
        {
                res.add(arr[ceil]);
                ceil++;
        }
        Collections.sort(res);
        return res;
    }
}
