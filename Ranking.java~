
/* IMPORTANT: class must not be public. */

/*
 * uncomment this if you want to read input.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
class Ranking {
	static int binarySearch(int[] inputArr, int key) {
         
        int start = 0;
        int end = inputArr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == inputArr[mid]) {
                return mid;
            }
            if (key < inputArr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
         while (start <= end) {
            int mid = (start + end) / 2;
            if (key == inputArr[mid]) {
                return mid;
            }
            if (key < inputArr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

	
	static int[] rank(int []arr)
	{
		int []temp=new int[arr.length];
		int Rank=1;
		temp[0]=Rank;	
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i-1]==arr[i])
				{	temp[i]=Rank;
					continue;			
			}else{
			Rank++;
			temp[i]=Rank;
		}
		}

		return temp; 
	}

    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        String []st=br.readLine().split(" ");
        int []M=new int[N];
        int []temp=new int[N];
        int []temp1=new int[N];
        for (int i = 0; i < N; i++) {
        	 M[i] = Integer.parseInt(st[i]);
        	 temp[i]=M[i];
        }
        Arrays.sort(M);
	for (int i = 0; i < N / 2; i++) {
  int tem = M[i];
  M[i] = M[M.length - 1 - i];
  M[M.length - 1 - i] = tem;
}


temp1=rank(M);
for (int i = 0; i < N / 2; i++) {
  int tem = temp1[i];
  temp1[i] = temp1[temp1.length - 1 - i];
  temp1[temp1.length - 1 - i] = tem;
}
for (int i = 0; i < N / 2; i++) {
  int tem = M[i];
  M[i] = M[M.length - 1 - i];
  M[M.length - 1 - i] = tem;
}
	//System.out.println(Arrays.toString(temp1));
		for (int i = 0; i <N; i++) {
			int a=binarySearch(M,temp[i]);
			//System.out.print("temp1[i]= "+temp1[a]);
			//System.out.print("temp[i]= "+temp[i]);
			//System.out.println(Arrays.toString(M));
        	System.out.print(temp[a]+" ");
        }
       
    }
    

}

