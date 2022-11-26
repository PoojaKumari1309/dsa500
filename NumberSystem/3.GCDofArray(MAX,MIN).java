  public int gcd1(int a,int b)
    {
        if(a%b==0)return b;
        return gcd1(b,a%b);
    } 
    public int findGCD(int[] nums) {
         Arrays.sort(nums);
         int GCD=gcd1(nums[0],nums[nums.length-1]);
      return GCD;
    }
