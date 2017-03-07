import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class alphacount {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String str=in.next();
        //String pattern="([a]|[b]|[c]|[d]|[e]|[f]|[g]|[h]|[i]|[j]|[k]|[l]|[m]|[n]|[o]|[p]|[q]|[r]|[s]|[t]|[u]|[v]|[x]|[y]|[z])";
        int sum=0;
        char a=' ';
        for(int i=97;i<123;i++)
            {
                String pattern ="(["+(char)i+"])";
               Pattern r = Pattern.compile(pattern);
            Matcher m = r.matcher(str);
            int count=0;
            while (m.find( )) {
         
                count++;
                 //System.out.println(m.group(0));
             } 
            if(sum<count)
                { 
                sum=count; a=(char)i;}
         }
        System.out.println(a);
    }
}
