/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.*/
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


class QueueSample {
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
         * Use either of these methods for input

        //BufferedReader*/
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        PriorityQueue<String> queue=new PriorityQueue<String>();  
        

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            String str[] = s.split(" ");
            switch(str[0])
            {
                case "E":
                    queue.add(str[1]);
                    System.out.println(queue.size());
                    break;
                case "D":
                    if(queue.peek()==null)
                        System.out.println("-1 0");
                    else
                        System.out.println(queue.remove()+" "+queue.size());
                    break;
            }            
        }        
    }
}
