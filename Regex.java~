import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Regex
    {
    public static void main(String [] args)
        {
        Scanner in =new Scanner(System.in);
        // String to be scanned to find the pattern.
      	//String pattern = "(\\s|')";
	//String pattern="([a]|[b]|[c]|[d]|[e]|[f]|[g]|[h]|[i]|[j]|[k]|[l]|[m]|[n]|[o]|[p]|[q]|[r]|[s]|[t]|[u]|[v]|[x]|[y]|[z])";
	//String pattern ="(["+char[i]+"])";
     // leading zeros String pattern = "^(([0]+)|([-0]+))";
	//leading zeros and ending zeros	String pattern = "^(([0]+[.](\\d+[0]+|[0]+\\d+|\\d+))|([-0]+[.](\\d+[0]+|[0]+\\d+|\\d+))|(\\d+[.](\\d+[0]+)))($)";
	// ip pattern String pattern = "^([0-9]|[0-9][0-9]|[0-2][0-5][0-5]|[0-1][0-9][0-9]|[0-2][0-4][0-9])([.])([0-9]|[0-9][0-9]|[0-2][0-5][0-5]|[0-1][0-9][0-9]|[0-2][0-4][0-9])([.])([0-9]|[0-9][0-9]|[0-2][0-5][0-5]|[0-1][0-9][0-9]|[0-2][0-4][0-9])([.])([0-9]|[0-9][0-9]|[0-2][0-5][0-5]|[0-1][0-9][0-9]|[0-2][0-4][0-9])($)";
      // Create a Pattern object
	//String pattern="(\\S{3})";
	/*String pattern="([A-Za-z]+)([=])([A-Za-z]+)";
      Pattern r = Pattern.compile(pattern);
	
      
        while(in.hasNext())
            {
                String line =in.nextLine();   
            // Now create matcher object.
      Matcher m = r.matcher(line);
int count=0;
      while (m.find( )) {
         
         count++;
        System.out.println(m.group(0));
      } 
System.out.println(count);
else {
         System.out.println("false");

      }*/
   String [] str ={ "username","pwd","profile","role","key"};
       
	String line =in.nextLine();
      
                for(int i=0;i<5;i++){
	            	//String pattern="(["+str[i]+"])"+"([=])([A-Za-z]+)";
String pattern="("+str[i]+")"+"([=])([A-Za-z]+)";
System.out.println(pattern);
	     	 Pattern r = Pattern.compile(pattern);
	     	 Matcher m = r.matcher(line);
 while (m.find( )) {
        		System.out.println(str[i]+": "+m.group(0));
      }
            }
        
    }
}
