import java.io.BufferedReader;
import java.io.InputStreamReader;
import  java.util.Arrays;


class GreedyPrinter {
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
		*/
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String line,st ;
        
        for (int i = 0; i < N; i++) {
            line= br.readLine();
            st=br.readLine();
            char []c=new char[st.length()];
            for(int j=0;j<st.length();j++)
            	c[j]=st.charAt(j);
            	Arrays.sort(c);
            System.out.println(line+"  "+Arrays.toString(c));
        }
    }
}
