
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


class TestClass {
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
         * Use either of these methods for input */

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);

        

        for (int i = 0; i < N; i++) {
            int S,K;
            String temp[];
            S = Integer.parseInt(br.readLine());
            K = Integer.parseInt(br.readLine());
            
            Boolean deleteFriend=false;

    		for (int l = 1 ;l< S-1; l++)
    		{
    			LinkedList linkedList = new LinkedList();
    			temp = br.readLine().split(" ");
    			
    			for(String var: temp)
    				linkedList.add(var);
    			for(int a = 0;a<linkedList.size()-1;a++)
    				if (Integer.parseInt((String)linkedList.get(a)) < Integer.parseInt((String)linkedList.get(a+1)))	
    				{
    					linkedList.remove(a);
    					deleteFriend = true;
    					K--;
		            	break;
    				}
    				
				if(deleteFriend == false)
				        linkedList.remove(linkedList.size()-1);
		        		
		        if(K==0)
		        		break;
    		}
		         
		            
       

        System.out.println("Hello World!");
    }
}
}