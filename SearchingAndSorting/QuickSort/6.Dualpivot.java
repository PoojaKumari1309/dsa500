public void swap(int []arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void threeWayPartition(int array[], int a, int b)
    {
        int left=0;
        int mid =0;
        int right=array.length-1;
        while(mid<=right)
        {
            if(array[mid]<a)
           { swap(array,left,mid);
            left++;
            mid++;
           }
           else if(array[mid]>=a&& array[mid]<=b)
           {
               mid++;
           }
           else
           {
               swap(array,mid,right);
               right--;
           }
            
        }
    }
