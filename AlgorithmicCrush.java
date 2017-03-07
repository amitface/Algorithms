import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Arrays;

public class AlgorithmicCrush {

    public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br=new BufferedReader(new FileReader("testAlgorithm.txt"));
        String []s=br.readLine().split(" ");
        int N=Integer.parseInt(s[0]);
        int M=Integer.parseInt(s[1]);
        long []Arr=new long[N+1];
        String []st=new String[3];
        long high=0;
        for(int i=0;i<M;i++)
            {
            st=br.readLine().split(" ");
            int a=Integer.parseInt(st[0]);
            int b=Integer.parseInt(st[1]);
            int k=Integer.parseInt(st[2]);
            for(int j=a;j<=b;j++)
            { Arr[j]+=k; if(Arr[j]>high)high=Arr[j];}
        }
        //Arrays.sort(Arr);
        System.out.println(high);
    }
}
