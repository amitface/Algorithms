import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
class Heapify
{
	static int largest=0;
	public static void main(String []args) throws IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int []Arr=new int[8];
		String  []s=br.readLine().split(" ");
		for(int i=1;i<=s.length;i++)
			Arr[i]=Integer.parseInt(s[i-1]);
		System.out.println(Arrays.toString(Arr));
		build_maxheap(Arr);
		System.out.println(Arrays.toString(Arr));
	}

	static void build_maxheap(int Arr[])
	{
		for(int i=Arr.length/2;i>=1;i--)
			max_heapify(Arr,i,7);
		
	}
	static void max_heapify(int Arr[], int i, int N)
	{
		int left=2*i;
		int right =2*i+1;
		if(left<=N && Arr[left]>Arr[i])
			largest=left;
		else
			largest=i;

		if(right<=N && Arr[right]>Arr[largest])
			largest=right;
		if(largest !=i)
		{
			swap(i,largest,Arr);
			max_heapify(Arr,largest,N);
		}
	}
	static void swap(int A,int B,int[]Arr)
	{
		int temp=Arr[A];
		Arr[A]=Arr[B];
		Arr[B]=temp;
	}
	
}
