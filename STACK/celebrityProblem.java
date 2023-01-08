class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n)
    {
    	int ans=0;
    	for(int i=1;i<n;i++)
    	{
    	    if(M[i][ans]==0)
    	    {
    	    ans=i;
    	    }
    	}
    	for(int i=0;i<n;i++)
    	{
    	    if(i==ans)continue;
    	    if(M[ans][i]!=0)return -1;
    	    if(M[i][ans]!=1)return -1;
    	}
    	return ans;
    }
}
