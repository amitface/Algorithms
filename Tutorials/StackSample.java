/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


class StackSmaple {
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
         * Use either of these methods for input
         */
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
         Stack st = new Stack();

        for (int i = 0; i < N; i++) {
            String s = br.readLine();            
            String str[] = s.split(" ");
            switch(str[0])
            {
                case "2":
                    st.push(str[1]);
                    break;
                case "1":
                    if(!st.empty())
                        System.out.println(st.pop());
                    else
                        System.out.println("No Food");
                    break;
            }            
        }       
    }
}
