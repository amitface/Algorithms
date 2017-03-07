import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Arrays;

public class GridChallenge {

     static void sortCharArray(int N, char ch[][])
         {
         
          
     }public static void quickSort(char [] array) {
        recursiveQuickSort(array, 0, array.length - 1);
    }

    public static void recursiveQuickSort(char[] array, int startIdx, int endIdx) {
     
        int idx = partition(array, startIdx, endIdx);

        // Recursively call quicksort with left part of the partitioned array
        if (startIdx < idx - 1) {
            recursiveQuickSort(array, startIdx, idx - 1);
        }

        // Recursively call quick sort with right part of the partitioned array
        if (endIdx > idx) {
            recursiveQuickSort(array, idx, endIdx);
        }
    }

    public static int partition(char[] array, int left, int right) {
        int pivot = array[left]; // taking first element as pivot

        while (left <= right) {
            //searching number which is greater than pivot, bottom up
            while (array[left] < pivot) {
                left++;
            }
            //searching number which is less than pivot, top down
            while (array[right] > pivot) {
                right--;
            }

            // swap the values
            if (left <= right) {
                char tmp = array[left];
                array[left] = array[right];
                array[right] = tmp;

                //increment left index and decrement right index
                left++;
                right--;
            }
        }
        return left;
    }


    public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        int N=Integer.parseInt(br.readLine());
        
         char[][]ch=new char[N][N];
        for(int i=0;i<N;i++)
            { String s=br.readLine();
            for(int j=0;j<N;j++)
                ch[i][j]=s.charAt(j); 
        }
        //sortCharArray(N,ch);
        for(int i=0;i<N;i++)
         Arrays.sort(ch[i]);
       for(int i=0;i<N;i++)
            {
            for(int j=0;j<N;j++)
                System.out.print(ch[i][j]);
            System.out.println();      
        } /**/
    }
}
