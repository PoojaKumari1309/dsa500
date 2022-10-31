static void swap(int[]arr,int i,int j)
   {
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
   }
   static void binSort(int A[], int N)
   {
     int left=0;
     int right=0;
     while(right<A.length)
     {
        if(A[right]==0)
        { 
            swap(A,left,right);
            right++;
            left++;
        }
        else
       {
          right++;
      }
   }
