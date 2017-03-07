import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

 class Solution {

    static long K=0;
    static void setmod(long M){
        K=M;
            }
    public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      //  Scanner in = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int  T = Integer.parseInt(line);
      ok:  for(int i=0;i<T;i++)
            {
            String []st= br.readLine().split(" ");
            int N=Integer.parseInt(st[0]);
            long M=Long.parseLong(st[1]);
            setmod(M);
          
            long sum=0;
            long high=0;
            long arr[]=new long[N];
            String []s=br.readLine().split(" ");
            for(int j=0;j<N;j++)
               arr[j]=Long.parseLong(s[j]);
                
              
              high = maxSubArraySum(arr, 0, N-1);
             System.out.println(high);
            }
        }
    // A utility funtion to find maximum of two integers
static long max(long a, long b) { return (a > b)? a : b; }
 
// A utility funtion to find maximum of three integers
static long max(long a, long b, long c) { return max(max(a, b), c); }
 
// Find the maximum possible sum in arr[] auch that arr[m] is part of it
static long maxCrossingSum(long arr[], int l, int m, int h)
{
    // Include elements on left of mid.
    long sum = 0;
    long left_sum = 0;
    for (int i = m; i >= l; i--)
    {
        sum = (sum + arr[i])%K;
        if (sum > left_sum)
          left_sum = sum;
    }
 
    // Include elements on right of mid
    sum = 0;
    long right_sum = 0;
    for (int i = m+1; i <= h; i++)
    {
        sum = (sum + arr[i])%K;
        if (sum > right_sum)
          right_sum = sum;
    }
 
    // Return sum of elements on left and right of mid
    return (left_sum + right_sum)%K;
}
 
// Returns sum of maxium sum subarray in aa[l..h]
    static long maxSubArraySum(long arr[], int l, int h)
    {
       // Base Case: Only one element
       if (l == h)
         return arr[l]%K;

       // Find middle point
       int m = (l + h)/2;
//System.out.println(m);
       /* Return maximum of following three possible cases
          a) Maximum subarray sum in left half
          b) Maximum subarray sum in right half
          c) Maximum subarray sum such that the subarray crosses the midpoint */
       return max(maxSubArraySum(arr, l, m),
                  maxSubArraySum(arr, m+1, h),
                  maxCrossingSum(arr, l, m, h));
    }
}
