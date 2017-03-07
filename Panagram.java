import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Panagram {

    public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s ="We promptly judged antique ivory buckles for the  prize";//br.readLine().toLowerCase();
        String pattern = "([abcdefghijklmnopqrstuvwxyz{1}])";
	//String pattern = "([abcde?])";

        // Create a Pattern object
        Pattern r = Pattern.compile(pattern);

        // Now create matcher object.
        Matcher m = r.matcher(s.toLowerCase());
	int count=0;
	int []c=new int[26];
        while (m.find( )) {
		count=(int)m.group().charAt(0);
		count =count-97;
		if(count<26 && count>=0)
            	{c[count]++;}
             } 
	String pan="pangram";
	for(int i=0;i<26;i++)
	{
	System.out.println(c[i]);
		if(c[i]<=0)
		pan="not pangram";
	}
	System.out.println(pan);
    }
}
