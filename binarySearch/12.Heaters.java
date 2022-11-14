     public  int lowerbound(int[]nums,int target){
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
    
    public  int findClosest(int arr[], int target) 
    { int ceil=lowerbound(arr,target);
      if(ceil==0)return arr[ceil];
      if(ceil==arr.length) return arr[ceil-1];
      if(target-arr[ceil-1]>=arr[ceil]-target) return arr[ceil];
      else return arr[ceil-1];
    
    }    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(heaters);
         int minradius=0;
         for(int i=0;i<houses.length;i++)
         {
             int closestHeater=findClosest(heaters,houses[i]);
             int radius=Math.abs(closestHeater-houses[i]);
              minradius=Math.max(radius,minradius);
         }
         return minradius;
        
    }
}
