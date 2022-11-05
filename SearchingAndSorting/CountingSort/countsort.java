public int[] sortArray(int[] nums) {
        //frequency of the array to be stored
        int max=50000;
        int min=-50000;
        int freq[]=new int[max-min+1];
        for(int i=0;i<nums.length;i++)
        {
            freq[nums[i]-min]++;
        }
        //sorting 
        int res[]=new int[nums.length];
        int idx=0;
        
        for(int actualidx=0;actualidx<freq.length;actualidx++)
        {
            int val=actualidx+min;
            for(int count=0;count <freq[actualidx];count++)
            {  
                res[idx]=val;
                idx++;
            }
        }
        return res;

    }
}
