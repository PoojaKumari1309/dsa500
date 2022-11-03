 public void Randam(int[]nums,int start,int end)//to reduce the probability of worst case
    {
        int randomIdx=(int)(Math.random()*(end-start+1)+start);
        swap(nums,randomIdx,end);
    }
    public void swap(int[]nums,int left,int right)
    {
        int temp=nums[left];
        nums[left]=nums[right];
        nums[right]=temp;
    }
    public int partioning(int[]nums,int start,int end)
    {
           
        int right=start;
        int left=start;
       Randam(nums,start,end);
       int  pivot=nums[end];
       while(right<=end)
       {
        if(nums[right]<=pivot)
        {
           swap(nums,left,right);
           left++;
           right++;
        }
        else
        {
            right++;
        }
     }
       return left-1;
    }

    public void quicksort(int[]nums,int start, int end)
    {
        if(start>=end) return;
        int pivot=partioning(nums,start,end);
        quicksort(nums,start,pivot-1);
        quicksort(nums,pivot+1,end);

    }
    public int[] sortArray(int[] nums) {
        quicksort(nums,0,nums.length-1);
        return nums;
    }
}
