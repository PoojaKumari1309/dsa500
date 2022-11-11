    public int[] sortArray(int[] nums) {
        int max=50000;
        int min=-50000;
        int[] freq=new int[max-min+1];
        for(int i=0;i<nums.length;i++)
        {
           freq[nums[i]-min]++;
        }
     // forming the suffix array 
        for(int i=freq.length-2;i>=0;i--)
        {
            freq[i]+=freq[i+1];
        }
        //sort
        int[]res=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
          int idx=nums.length-freq[nums[i]-min];
          freq[nums[i]-min]--;
          res[idx]=nums[i];
        }
        return res;
    }
