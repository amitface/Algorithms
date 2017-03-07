import java.util.*;
class Solution
{
   static int max_n=5000000;
   static int mod=100000;
   static int [] memo = new int[max_n+5];
   static int fib(int n)
   {
      if(n==1)return 0;
      if(n==2) return 1;
     else 
      memo[n]=(fib(n-1) + fib(n-2))%mod;
      return memo[n];
   }
   public static void main(String []argh)
   {
      Scanner sc= new Scanner(System.in);
      for(int i=max_n;i>=1;i--)
      {
         fib(i);
      }
      int n=sc.nextInt();
      System.out.println(memo[n]);
      
   }
   
}/*import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. 
        Scanner in = new Scanner(System.in);
        String s= in.nextLine();
        int k= in.nextInt();
        int len=s.length()-k+1;
        
        String []str = new String[len];
        int [] arr= new int[len];
        for(int i=0;i<len;i++)
            {
           StringBuilder temp = new StringBuilder();
            for(int j=i,t=0;j<i+k;j++,t++)
                {
                temp.append(s.charAt(j));
                 }
             str[i]=temp.toString();
       //     System.out.println(str[i]);
        }
        //System.out.print(Arrays.toString(arr));
       // System.out.print(Arrays.deepToString(str));
        
        
        for(int i=0;i<len-1;++i)
            { 
            for(int j=i+1;j<len ;++j)
                {
                  if((str[i].compareTo(str[j]))>0)
                  {
                //      System.out.println(" if - "+str[i]);
                    String temp =str[i];
                      //System.out.print(" temp - "+temp);
                      str[i]=str[j];
                    
                      //System.out.print(" ||  str[i]  - "+str[i]);
                   
                      str[j]=temp;
                      //System.out.print(" ||  str[j]  - "+str[j]);
                      //System.out.println();
                                 
                  }
                
                }
        }
        System.out.println(str[0]);
         System.out.println(str[len-1]);
                   //System.out.println(Arrays.deepToString(str));
    }
}*/
/*import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. 
        Scanner in = new Scanner(System.in);
        String s=in.nextLine();
        int T= Integer.parseInt(s);
        ArrayList<String> table = new ArrayList<String>();
//  ArrayList<ArrayList[]> table = new ArrayList<ArrayList[]>[T];
        for(int i=0;i<T;i++)
            {
                table.add(in.nextLine());
               // String []str=t.split(" ");
            //System.out.println(str);
		
              //  for(int k=0;k<str.length;k++)
                //    {
                  //  int l=Integer.parseInt(str[k]);
                    //table[i][k].add(l);
                //}
            }
        String p=in.nextLine();
        int K=Integer.parseInt(p);
        for(int j=0;j<K;j++)
            {
            String t=in.nextLine();
                String []str=t.split(" ");
		String []st=table.get(Integer.parseInt(str[1])-1).toString().split(" ");
            System.out.println(st[Integer.parseInt(str[0])-1]);
        }
    }
}
*/
/*
import java.io.*;
import java.util.*;
import java.util.regex.*;
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. 
	Scanner in = new Scanner(System.in);
	
		char[] al={'a','s','d','f','g','h','j','k','l','q','w','e','r','t','y','u','i','o','p','z','x','c','v','b','n','m'};
		int [] arr= new int[26];
		int p=0;
	while(in.hasNext()){
String s= in.next();
	for(int i=0;i<26;i++)
	{
		String pattern ="(["+al[i]+"])";
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(s);
		int count=0;
  		   while (m.find( )) {
         	       count++;
         	        } 
			
		arr[i]=count;
		if(count>0)
		p=count;
		System.out.println(al[i]+" = "+count);
	}
	int sch=0;
	int check=0;
		
	for(int i=0;i<26;i++)
	{
		if(arr[i]>0 && arr[i]!=p)
		{
			check++;
		}
		else if(arr[i]==p)
		sch++;
	}

	if(check>1 && sch>1)
	System.out.println("NO");
	else
	System.out.println("YES");}
	
    }
}*/
/*import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. 
        Scanner in = new Scanner(System.in);
        String s= in.next();
        int T=Integer.parseInt(s);
        for(int j=0; j<T;j++)
        {	
            int k=0,pointer=0,count=0;
            int n=in.nextInt();
            int[]arr= new int[n];
            int m=in.nextInt();
            for(int i=0;i<n;i++)
                {
                int temp =in.nextInt();
                arr[i]=temp;
                if(temp==0)
                {  k++;}
            }
            int [] point= new int[k];
            for(int i=0,l=0;i<n;i++)
               {   if(arr[i]==0)
                {       
                point[l]= arr[i];l++;              
              }
            }
            System.out.println(Arrays.toString(point));
            
            System.out.println();
            
        }	
		/*do            
		{
		try{
			if((arr[a+1]-arr[a])==1)
			{
				a++;
			}	
			
			if((arr[a+m]==0)
			{
				a+=m;
			}
				if((arr[a]-1)==arr[a-1])
			{
					a--;	
			}
		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("true");
			break;
   			 }
		}while(a<n)

            
       
    }
}
*/
