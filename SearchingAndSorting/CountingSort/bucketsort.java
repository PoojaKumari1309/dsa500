public int[] sortArray(int[] nums) {
        int max=50000;
        int min=-50000;
        ArrayList<Integer>[]bucket=new ArrayList[max-min+1];
        for(int i=0;i<bucket.length;i++)
        {
            bucket[i]=new ArrayList<>();
        }
        for(int i=0;i<nums.length;i++)
        {
            bucket[nums[i]-min].add(nums[i]);
        }
         int[]res=new int[nums.length];
         int idx=0;
        for(int actualidx=0;actualidx<bucket.length;actualidx++)
        {
            for(int i=0;i<bucket[actualidx].size();i++)
            {
                int val=bucket[actualidx].get(i);
                res[idx++]=val;
            }
        
        }
        return res;
    }
