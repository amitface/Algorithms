import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.io.FileReader;
class ArjitApex
{
		 public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
		*/
        BufferedReader br = new BufferedReader(new FileReader("ArjitApex.txt"));
        String line = br.readLine();
        int T = Integer.parseInt(line);
        int M,N,G,H;
        String []st=new String[2];
        String Ans="Good";
        //int countgood,countgreat;
        for (int i = 0; i < T; i++) {
        	st=br.readLine().split(" ");
        	M=Integer.parseInt(st[0]);
        	N=Integer.parseInt(st[1]);
		//System.out.println("M= "+M+" N="+N);
		
        	int [][]arrM=new int[M][2];
        	int [][]arrN=new int[N][2];
		int [][]arrvisited=new int[N][2];
        	for(int j=0;j<M;j++)
        	{
        		st=br.readLine().split(" ");
        		arrM[j][0]=Integer.parseInt(st[0]);
        		arrM[j][1]=Integer.parseInt(st[1]);
        	}
        	for(int j=0;j<N;j++)
        	{
        		st=br.readLine().split(" ");
        		arrN[j][0]=Integer.parseInt(st[0]);
        		arrN[j][1]=Integer.parseInt(st[1]);
        	}
        	st=br.readLine().split(" ");
        	G=Integer.parseInt(st[0]);
        	H=Integer.parseInt(st[1]);
		//countgood=0;countgreat=0;
        	for(int j=0;j<M;j++)
        	{
        		for(int k=0;k<N;k++)
        		{	
        			if(arrvisited[k][0]!=1 && arrM[j][0]==arrN[k][0])
        			{
					arrvisited[k][0]=1;
        				G--;
        				if(arrvisited[k][1]!=1 && arrM[j][1]==arrN[k][1])
        					{H--;arrvisited[k][1]=1;}break;
        			}
        		}if(H<=0){Ans="Great";break;}
        	}
        	
        //System.out.println("countgood= "+countgood+"countgreat= "+countgreat);
	//System.out.println("G= "+G+" H="+H);
	if(G<=0)
		System.out.println(Ans);
	else
        	System.out.println(":(");/**/
     
        }
    }
}
