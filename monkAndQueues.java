import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.io.FileReader;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.Files;import java.nio.charset.Charset;import java.util.Scanner;
class monkAndQueues

{
	public static void main(String args[] ) throws Exception {long startTime = System.nanoTime();
	Path path=Paths.get(args[0]);
       Scanner in = new Scanner(path);
       final int[] count = new int[100001];
       final int[] minpq = new int[1000001];
       int minPQCurLast=0;
       int maxPQCurLast=0;
       final int[] maxpq = new int[1000001];
       final StringBuilder sb = new StringBuilder();
       final int Q = in.nextInt();
       int size=0;
       for(int q=0;q<Q;q++){
       		int op = in.nextInt();
       		if(op==1){
       			size++;
       			int val=in.nextInt();
       			count[val]++;
       			if(count[val]>1)//if val already present 
       				continue;
       			//add minPq, increment curLast
       			insertMinPQ(minpq,minPQCurLast, val);
       			minPQCurLast++;
       			//add maxPq, increment curLast
       			insertMaxPQ(maxpq,minPQCurLast, val);
       			maxPQCurLast++;	
       		}
       		else if(op==2){
       			int val =in.nextInt();
       			if(count[val]<1)
       				sb.append("-1\n");
       			else{
       				count[val]--;
       				size--;
       			}
       		}
       		else if(op==3){
       			if(size<1)
       			{
       				sb.append("-1\n");
       				continue;
       			}
       			while(maxPQCurLast>0){
       				int max = getMaxMaxPq(maxpq, maxPQCurLast);
       				if(count[max]<1)
       				{
       					delMaxMaxPq(maxpq, maxPQCurLast);
       					maxPQCurLast--;
       					size--;
       				}
       				else{
       					sb.append(max+"\n");
       					break;
       				}
       			}
       		}
       		else if(op==4){
       			if(size<1)
       			{
       				sb.append("-1\n");
       				continue;
       			}
       			while(minPQCurLast>0){
       				int min = getMinMinPq(minpq, minPQCurLast);
       				if(count[min]<1)
       				{
       					delMinMinPq(minpq, minPQCurLast);
       					minPQCurLast--;
       					size--;
       				}
       				else{
       					sb.append(min+"\n");
       					break;
       				}
       			}
       		}
       }
       System.out.println(sb.toString());
		long totalTime = System.nanoTime() - startTime;
		System.out.println(totalTime/1e9);
    }
    
    private static void insertMinPQ(int[] pq, int curLast, int val){
    	pq[++curLast]=val;
    	minPQSwim(pq,curLast);
    }
    private static void minPQSwim(int[] pq, int curLast){
    	while(curLast>1 && pq[curLast] < pq[curLast/2]){
    		exch(pq,curLast,curLast/2);
    		curLast = curLast/2;
    	}
    }
    private static int getMinMinPq(int[] pq, int curLast){
    	if(curLast>0)
    		return pq[1];
    	return -1;
    }
    private static int delMinMinPq(int[] pq, int curLast){
    	int temp = pq[1];
    	exch(pq,1,curLast);
    	curLast--;
    	sinkMinPq(pq,1,curLast);
    	return temp;
    }
    private static void sinkMinPq(int[] pq, int start, int curLast){
    	while(start*2<=curLast){
    		int firstChild=start*2;
    		int secondChild=firstChild+1;
    		if(secondChild>curLast || pq[firstChild]<pq[secondChild]){
    			if(pq[firstChild]<pq[start])
    			{
    				exch(pq,start,firstChild);
    				start=firstChild;
    			}
    			else
    				break;
    		}
    		else{
    			if(pq[secondChild]<pq[start]){
    				exch(pq,start,secondChild);
    				start=secondChild;
    			}
    			else
    				break;
    		}
    	}
    }
    
    private static void insertMaxPQ(int[] pq, int curLast, int val){
    	pq[++curLast]=val;
    	maxPQSwim(pq,curLast);
    }
    private static void maxPQSwim(int[] pq, int curLast){
    	while(curLast>1 && pq[curLast] > pq[curLast/2]){
    		exch(pq,curLast,curLast/2);
    		curLast = curLast/2;
    	}
    }
    private static int getMaxMaxPq(int[] pq, int curLast){
    	if(curLast>0)
    		return pq[1];
    	return -1;
    }
    private static int delMaxMaxPq(int[] pq, int curLast){
    	int temp = pq[1];
    	exch(pq,1,curLast);
    	curLast--;
    	sinkMaxPq(pq,1,curLast);
    	return temp;
    }
    private static void sinkMaxPq(int[] pq, int start, int curLast){
    	while(start*2<=curLast){
    		int firstChild=start*2;
    		int secondChild=firstChild+1;
    		if(secondChild>curLast || pq[firstChild]>pq[secondChild]){
    			if(pq[firstChild]>pq[start])
    			{
    				exch(pq,start,firstChild);
    				start=firstChild;
    			}
    			else
    				break;
    		}
    		else{
    			if(pq[secondChild]>pq[start]){
    				exch(pq,start,secondChild);
    				start=secondChild;
    			}
    			else
    				break;
    		}
    	}
    }
    private static void exch(int[] arr, int i, int j){
    	int temp = arr[i];
    	arr[i]=arr[j];
    	arr[j]=temp;
    }
	}/*
	public static void main(String []args) throws IOException 
	{
		long startTime = System.nanoTime();
		Charset charset = Charset.forName("UTF-8");
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Path path=Paths.get(args[0]);
		//System.out.println(path);
		//BufferedReader br=new BufferedReader(new InputStreamReader("testcase2.txt"));
		BufferedReader br=Files.newBufferedReader(path,charset);
		PriorityQueue<Integer> max=new PriorityQueue<Integer>(10,Collections.reverseOrder());
		PriorityQueue<Integer> min=new PriorityQueue<Integer>();
		String st=br.readLine();
		Set<Integer> arr=new HashSet<Integer>();
		int T=Integer.parseInt(st);
		int []Arr=null;//new int[T+1];
		int []Arrcount=new int[100005];
		int b;	
		String  []s=new String[2];
		for(int i=1;i<=T;i++)
		{
			s=br.readLine().split(" ");
			int a=Integer.parseInt(s[0]);
			
			switch(Integer.parseInt(s[0]))
			{
				case 1:
					 b=Integer.parseInt(s[1]);
					Arrcount[b]++;
					
					if(!arr.contains(b))
					{ max.add(b);
					min.add(b);arr.add(b); }
					break;
				case 2:
					 b=Integer.parseInt(s[1]);	
					if(Arrcount[b]>0)
						Arrcount[b]--;
					else
					System.out.println("-1");
					if(Arrcount[b]==0)
					arr.remove(b);
					break;
				
				case 3:
					if(max.isEmpty())
					{System.out.println("-1"); break;}
					while(  max.size()>=1 && Arrcount[max.peek()]==0)
						{ int temp =max.poll();}
					if(max.size()>=1)
						System.out.println(max.peek());
					else
						System.out.println("-1");
					break;
				default:
					if(min.isEmpty())
					{
						System.out.println("-1");
						 break;}
						
					while(min.peek()!=null && Arrcount[min.peek()]==0)
						{ 
						
							min.poll();
						}
					if(min.size()>=1)
						{
							
							System.out.println(min.peek());}
					else
						System.out.println("-1");
					break;
			}
		}long totalTime = System.nanoTime() - startTime;
		System.out.println(totalTime/1e9);
	
	}
}*/
