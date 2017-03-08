import java.io.BufferedReader;
import java.io.InputStreamReader;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

class TestClass {
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        for (int i = 0; i < N; i++) {
        	String str= br.readLine();
        	if(str.length()>2){
        	char a=str.charAt(0);
        	char c=str.charAt(str.length()-1);
        	char b=str.charAt(str.length()/3);
        	int len=str.length()/3;
           String pattern = "(["+a+"]{"+len+"})(["+b+"]{"+len+"})(["+c+"]{"+len+"})($)";
		//String pattern="([a]{2})([b]{2})([c]{3})";
            //System.out.println("Pattern " + pattern );
             Pattern r = Pattern.compile(pattern);
            Matcher m = r.matcher(str);
		
		if(m.find())
		{
			//System.out.println("Found value: " + m.group(0) );
			
			System.out.println("OK");
		}else{
			System.out.println("Not OK");
		}
        	}
        	else
        	{
        			System.out.println("Not OK");
        	}
        }
    }
}

