import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
class MinHeapify
{
	static int smallest=0;
	public static void main(String []args) throws IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int []Arr=new int[8];
		String  []s=br.readLine().split(" ");
		for(int i=1;i<=s.length;i++)
			Arr[i]=Integer.parseInt(s[i-1]);
		System.out.println(Arrays.toString(Arr));
		build_minheap(Arr);
		
	}

	static void build_minheap(int Arr[])
	{
		for(int i=Arr.length/2;i>=1;i--)
			min_heapify(Arr,i,Arr.length-1);
		
	}
	static void min_heapify(int Arr[], int i, int N)
	{
		int left=2*i;
		int right =2*i+1;
		if(left<=N && Arr[left]<Arr[i])
			smallest=left;
		else
			smallest=i;

		if(right<=N && Arr[right]<Arr[smallest])
			smallest=right;
		if(smallest !=i)
		{
			swap(i,smallest,Arr);
			System.out.println(Arrays.toString(Arr));
			min_heapify(Arr,smallest,N);
		}
	}
	static void swap(int A,int B,int[]Arr)
	{
		int temp=Arr[A];
		Arr[A]=Arr[B];
		Arr[B]=temp;
	}
	
}
