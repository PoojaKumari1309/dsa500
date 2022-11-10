public String frequencySort(String s) {
       int[]freq=new int[128];
       for(int i=0;i<s.length();i++)
       {
           char ch=s.charAt(i);
           freq[ch]++;
       }
       StringBuilder[]bucket=new StringBuilder[s.length()+1];
       for(int i=0;i<bucket.length;i++)
       {
           bucket[i]=new StringBuilder();
       }
       for(int i=0;i<128;i++)
       {
        char ch=(char)i;
        for(int c=0;c<freq[i];c++)
        {
            bucket[freq[i]].append(ch);
        }
       }
       StringBuilder res=new StringBuilder();
       for(int j=bucket.length-1;j>=0;j--)
       {
           res.append(bucket[j]);
          
       }
       return res.toString();
    }
