
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.ArrayList;

class PriorityQueue
{
	static int largest=0;
	static int smallest=0;
	public static void main(String []args) throws IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ArrayList <Integer> Arr=new ArrayList();
		String  []s=br.readLine().split(" ");
		Arr.add(0);
		for(int i=1;i<=s.length;i++)
			Arr.add(Integer.parseInt(s[i-1]));
		//System.out.println(Arrays.toString(Arr));
		//heap_sort(Arr);
		build_minheap(Arr);
		
		int a=maximum(Arr);
		System.out.println("Min Queue is "+a);
		int b=extract_minimum (Arr);
		System.out.println("Extracted Queue is "+b);
		decrease_value(Arr,2,1);		
		insert_minvalue(Arr,6);
		System.out.println(Arr);
	}

	static int maximum(ArrayList <Integer> Arr)
   	 {
     	   return Arr.get(1);  //as the maximum element is the root element in the max heap.
   	 }
	
	

	static int extract_maximum (ArrayList <Integer> Arr)
	{
	    if(Arr.size() == 1)
	    {
		System.out.println("Can’t remove element as queue is empty");
		return -1;
	    }
	    int max = Arr.get(1);
	    Arr.set(1, Arr.get(Arr.size()-1));
	    //Arr.removeRange(Arr.size()-1,Arr.size());
		Arr.remove(Arr.size()-1);
	    max_heapify(Arr, 1,Arr.size());
	    return max;
	}

	static void increase_value (ArrayList <Integer> Arr, int i, int val)
	{
	    if(val < Arr.get(i))
	    {
		System.out.println("New value is less than current value, can’t be inserted");
		return;
	    }
	    Arr.set(i,val);
	    while( i > 1 && Arr.get(i/2) < Arr.get(i))
	    {
		swap( i/2 ,  i ,Arr);
		i = i/2;
	    }
	}

	static void insert_value (ArrayList <Integer> Arr, int val)
	{
	  int   length = Arr.size() ;
	    Arr.add(-1);  //assuming all the numbers greater than 0 are to be inserted in queue.
	    increase_value (Arr, length, val);
	}

	
	static int minimum(ArrayList <Integer> Arr)
   	 {
     	   return Arr.get(1);  //as the maximum element is the root element in the max heap.
   	 }

	static int extract_minimum (ArrayList <Integer> Arr)
	{
	    if(Arr.size() == 1)
	    {
		System.out.println("Can’t remove element as queue is empty");
		return -1;
	    }
	    int min = Arr.get(1);
	    Arr.set(1, Arr.get(Arr.size()-1));
	    //Arr.removeRange(Arr.size()-1,Arr.size());
		Arr.remove(Arr.size()-1);
	    min_heapify(Arr, 1,Arr.size()-1);
	    return min;
	}

	static void decrease_value (ArrayList <Integer> Arr, int i, int val)
	{
	    if(val > Arr.get(i))
	    {
		System.out.println("New value is less than current value, can’t be inserted");
		return;
	    }
	    Arr.set(i,val);
	    while( i > 1 && Arr.get(i/2) > Arr.get(i))
	    {
		swap( i/2 ,  i ,Arr);
		i = i/2;
	    }
	}
	
	static void insert_minvalue (ArrayList <Integer> Arr,int val)
	{
		int   length = Arr.size() ;
	    Arr.add(val);  //assuming all the numbers greater than 0 are to be inserted in queue.
	    decrease_value (Arr, length, val);
	}
	static void min_heapify(ArrayList <Integer> Arr, int i, int N)
	{
		int left=2*i;
		int right =2*i+1;
		if(left<=N && Arr.get(left)<Arr.get(i))
			smallest=left;
		else
			smallest=i;

		if(right<=N && Arr.get(right)<Arr.get(smallest))
			smallest=right;
		if(smallest !=i)
		{
			swap(i,smallest,Arr);
			System.out.println(Arr);
			min_heapify(Arr,smallest,N);
		}
	}

	static void build_minheap(ArrayList <Integer> Arr)
	{
		for(int i=Arr.size()/2;i>=1;i--)
			min_heapify(Arr,i,Arr.size()-1);
		
	}
	static void max_heapify(ArrayList<Integer> Arr, int i, int N)
	{
		int left=2*i;
		int right =2*i+1;
		if(left<=N && Arr.get(left)>Arr.get(i))
			largest=left;
		else
			largest=i;

		if(right<=N && Arr.get(right)>Arr.get(largest))
			largest=right;
		if(largest !=i)
		{
			swap(i,largest,Arr);
			max_heapify(Arr,largest,N);
		}
	}
	static void swap(int A,int B,ArrayList<Integer> Arr)
	{
		int temp=Arr.get(A);		
		Arr.set(A,Arr.get(B));		
		Arr.set(B,temp);
	}
	
	static void heap_sort(ArrayList <Integer> Ar)
	{
	    int heap_size = 7;
	    build_maxheap(Ar);
	    for(int i = 7; i>=2 ; i-- )
	    {
		swap( 1 ,  i,Ar);
		heap_size = heap_size-1;
		max_heapify(Ar, 1, heap_size);
	    }
	}
	static void build_maxheap(ArrayList <Integer> Arr)
	{
		for(int i=Arr.size()/2;i>=1;i--)
			max_heapify(Arr,i,Arr.size()-1);
		
	}
}
