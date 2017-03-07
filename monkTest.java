

    import java.io.IOException;
    import java.nio.file.FileSystemException;
   
    import java.io.InputStream;
    import java.io.BufferedReader;
    import java.io.BufferedWriter;
    import java.io.FileReader;
    import java.io.FileInputStream;
    import java.nio.file.NoSuchFileException;
    import java.nio.file.Files;
    import java.nio.charset.Charset;
    import java.util.Arrays;
    import java.util.ArrayList;
     import java.nio.file.Path;
    import java.nio.file.Paths;
    import java.net.URI;
    class monkTest
    {
    	static int largest=0;
    	static int smallest=0;
    	public static void main(String []args) throws IOException 
    	{
		Charset charset = Charset.forName("UTF-8");long startTime = System.nanoTime();
		
		//InputStream n=new FileInputStream("testcase2.txt");
		//Path path=Paths.get(args[0]);
		Path path1=Paths.get("testcase2.txt");
		Path path2=Paths.get("Answercase2.txt");
		BufferedReader br=null;
		BufferedWriter writer = Files.newBufferedWriter(path2, charset);
		try{    	
		
		br=Files.newBufferedReader(path1, charset);
		
    		String st=br.readLine();
    		int T=Integer.parseInt(st);
		System.out.println(path);
		String []s=br.readLine().split(" ");
		ArrayList<Integer> Arr=new ArrayList<Integer>();
			
			Arr.add(0);
			long mul=1;
			
				insert_minvalue(Arr,Integer.parseInt(s[0]));
				insert_minvalue(Arr,Integer.parseInt(s[1]));
				System.out.println("-1"); 
				System.out.println("-1");
				insert_minvalue(Arr,Integer.parseInt(s[2]));
			mul=Arr.get(1)*Arr.get(2)*Arr.get(3);System.out.println(mul);
			for(int i=3;i<s.length;i++)
			{
				int a=Integer.parseInt(s[i]);
				int b=minimum(Arr);
				if(a>b)
				{
					int ext=extract_minimum(Arr);
					mul=mul/ext;
					insert_minvalue(Arr,a);
					mul=mul*a;
				}
				else
				{
					System.out.println(mul);
					continue;
				}
				System.out.println(mul);
			}
    		}
		catch(NoSuchFileException x) {
    			System.err.format("%s does not exist\n", x.getFile());
		}
		finally{br.close();}
		 
		long totalTime = System.nanoTime() - startTime;
		System.out.println(totalTime/1e9);/**/
    	}

	
	static int extract_minimum (ArrayList <Integer> Arr)
	{
	    if(Arr.size() == 1)
	    {
		//System.out.println("Can?t remove element as queue is empty");
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
			min_heapify(Arr,smallest,N);
		}
	}
	static void swap(int A,int B,ArrayList<Integer> Arr)
	{
		int temp=Arr.get(A);		
		Arr.set(A,Arr.get(B));		
		Arr.set(B,temp);
	}
	static int minimum(ArrayList<Integer> Arr)
	{
		return Arr.get(1);		
	}
    	
    }



