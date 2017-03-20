import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


class QueueInsertionTesting {
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
         * Use either of these methods for input
        */
        //BufferedReader
             BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        int limit = 100000;
        // PriorityQueue<String> queue = new PriorityQueue<String>(100000,(new QuidComparator()));
        Queue<Quid> queue = new PriorityQueue<Quid>();
        
        for (int i = 0; i < N; i++) {
            String str[] = br.readLine().split(" ");
            switch(str[0])
            {
                case "E":
                        queue.add(new Quid(Integer.parseInt(str[1]),Integer.parseInt(str[2])));
                         // System.out.println(queue.toString());
                            for (Quid a : queue)
                                System.out.println(a.getid()+" "+a.getrollNum());
                        // limit--;
                    break;
                case "D":
                    Quid temp = (Quid)queue.poll();
                    System.out.println(temp.getid()+" "+temp.getrollNum());
                        // System.out.println(queue.poll());

                    break;
            }
        }
    }
}

class Quid implements Comparable<Quid>
{
    int id, rollNum;
    Quid(int id, int rollNum)
    {
      this.id = id;
      this.rollNum = rollNum;      
    }
    
    public int getid()
    {
        return id;
    }
    
    public int getrollNum()
    {
        return rollNum;
    }
    
    public int compareTo(Quid q)
    {
        System.out.println("ID "+id+ " | q.id "+ q.id);
        if(id==q.id)
            return 0;
        else if(id< q.id)
            return -1;
        else 
            return 1;
    }
}

// class QuidComparator implements Comparator<Quid>/**/
// {
    
//     public int compare(Quid s1,Quid s2){  
//         // if(s1.getid() == s2.getid() && s1.getpriority()> s2.getpriority())  
//         //     return -1;  
//         // else
//         if(s1.getid()==s2.getid())  
//             return 0;  
//         else 
//             return -1;  
//         }  
// }

class QuidComparator implements Comparator<String>/**/
{
    
    public int compare(String s1,String s2){  
        // if(s1.getid() == s2.getid() && s1.getpriority()> s2.getpriority())  
        //     return -1;  
        // else
        return s1.compareTo(s2);
        // if(s1.equals(s2))  
        //    {
        //         System.out.println("s1 "+s1+ " | s2 "+ s2);
        //     return 0;  
        //    } 
        // else 
        //     return 1;  
        }  
}
// 5
// E 1 1
// E 2 1
// E 1 2
// D
// D