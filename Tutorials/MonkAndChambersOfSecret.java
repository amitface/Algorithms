/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.*/
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


class MonkAndChambersOfSecret {
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
         * Use either of these methods for input
         */
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt((line.split(" "))[0]);
        int X = Integer.parseInt((line.split(" "))[1]);    
        int  temp;
        int initial;
        Deque<Integer> queue = new ArrayDeque<Integer>();
        Deque<Integer> dequeue = new ArrayDeque<Integer>();
        Deque<Integer> position = new ArrayDeque<Integer>();
        Deque<Integer> deposition = new ArrayDeque<Integer>();
        line = br.readLine();
        String str[] = line.split(" ");
        for(int i =0;i< str.length; i++)
        {
            queue.add(Integer.parseInt(str[i]));
            position.add(i+1);
        }
        for (int i = 0; i < X; i++) {
            temp = queue.pop();
            dequeue.add(temp);
            initial = position.pop();
            deposition.add(initial);
            for(int j = 0;j < (X>queue.size()?X:queue.size()); j++)
            {
                   if(queue.size()==0)   
                break;    
                if(queue.peek()!=null && temp<queue.peek())
                    {
                        temp = queue.peek();
                        initial = position.peek();
                    }
                dequeue.add(queue.pop());
                deposition.add(position.pop());                
             
            }
            dequeue.remove(temp);
            deposition.remove(initial);
            System.out.println(initial);
            for(int j=0;j<dequeue.size();j++)
            {
                queue.add(dequeue.pop());
                position.add(deposition.pop());
            }
            
            
            if(queue.size()==0)   
                break;
        }
    }
}
