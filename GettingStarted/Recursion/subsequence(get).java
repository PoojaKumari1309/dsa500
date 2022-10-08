import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        String str = sc.nextLine();
        ArrayList<String>ans =  gss(str,0); 
        System.out.print(ans.toString());
    }
      public static ArrayList<String> gss(String str,int idx)
    {
        if(idx== str.length())
        {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        ArrayList<String>small = gss(str,idx+1);
        ArrayList<String>answer= new ArrayList<>();
        for(String sub:small)
        {
            answer.add(sub);
        }
        for(String sub:small)
        {
            answer.add(str.charAt(idx)+sub);
        }
        return answer;
    }


    

}
