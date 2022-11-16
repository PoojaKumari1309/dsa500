 public int approach1(int n)
    {
        int k=0;
      while(n>0)
      {
       k++;
       n=n-k;
      }
      return n==0? k : k-1;
    }
    public int approach2(int n)
    {
        int left=0;
        int right=n;
        while(left<=right)
        {
          int mid=left+(right-left)/2;
          int k=mid*(mid+1)/2;
          if(k==n)return mid;
          else if(k<n) left=mid+1;
          else right=mid-1;
        }
        return right;
        
    }
    
    public int arrangeCoins(int n) {
        int ans= approach2(n);
        return ans;
    }
