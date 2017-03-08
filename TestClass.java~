/* IMPORTANT: class must not be public. */

/*
 * uncomment this if you want to read input.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;


import java.util.ArrayList;

class TestClass {
    
    public static ArrayList<String> combinations(String suffix,String prefix,ArrayList<String> st){
	//int count=0;       
 	if(prefix.length()<0)return st;
	//        System.out.println(suffix);
	/*if(!suffix.equals(""))
	{int a=Integer.parseInt(suffix);
	if(a%6==0)
	{
		count%=1000000007;
		count++;
	}
}*/
		st.add(suffix);
        for(int i=0;i<prefix.length();i++)
         combinations(suffix+prefix.charAt(i),prefix.substring(i+1,prefix.length()),st);

	return st;
    }

    public static void main (String args[]){
	ArrayList<String> st= new ArrayList<String>();
        ArrayList<String> count= combinations("","1232", st);
	System.out.println(count);
        }

       // System.out.println("Hello World!");
    
}

