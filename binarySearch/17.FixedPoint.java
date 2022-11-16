	public static int equalIndex(ArrayList<Integer> arr, int n){
        // Write your code here.
        for(int i=0;i<arr.size();i++)
        {
           if(arr.get(i)==i)return i;
        }
        return -1;
    }
