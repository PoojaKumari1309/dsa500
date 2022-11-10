 public int[] frequencySort(int[] nums) {
        int max=100;
        int min =-100;
        //filling the frequency array
        int[] freq=new int[max-min+1];
        for(int i=0;i<nums.length;i++)
        {
            freq[nums[i]-min]++;
        }
        ArrayList<Integer>[]bucket=new ArrayList[nums.length+1];
        for(int i=0;i<bucket.length;i++)
        {
           bucket[i]=new ArrayList<>();
        }
        for(int i=0;i<freq.length;i++)
        {
           int  val=i+min;
            for(int c=0;c<freq[i];c++)
            {
                bucket[freq[i]].add(val);
            }
        }
        int idx=0;
        for(int i=1;i<bucket.length;i++)
        {
            for(int j=bucket[i].size()-1;j>=0;j--)
            {
               nums[idx++]=bucket[i].get(j);
            }
        }
        return nums;
    }
