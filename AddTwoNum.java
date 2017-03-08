// import java.io.BufferedReader;
// import java.io.InputStreamReader;

// //import for Scanner and other utility  classes
// import java.util.*;


// class AddTwoNum
//  {
//     public static void main(String args[] ) throws Exception {
//         /*
//          * Read input from stdin and provide input before running
//          * Use either of these methods for input
// */
//         //BufferedReader
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         String line = br.readLine();
//         int N = Integer.parseInt(line);

		
//         //Scanner
//         Scanner s = new Scanner(System.in);
//         int A,B;

//         for (int i = 0; i < N*2; i++) {
//         	 line = br.readLine();
//         	 A= Integer.parseInt(line.split(" ")[0]);
//         	 B= Integer.parseInt(line.split(" ")[1]);
//             System.out.println(A+B);
//         //     // System.out.println();
//         }
        

//         // System.out.println("Hello World!");
//     }
// }
/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
 */
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility  classes
import java.util.*;


class AddTwoNum {
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
         * Use either of these methods for input
        */
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        System.out.println(line);
        int N = Integer.parseInt(line.split(" ")[0]);
        int Q = Integer.parseInt(line.split(" ")[1]);
        
        //Scanner
        // Scanner s = new Scanner(System.in);
        // int N = s.nextInt();

        MaxHeap maxHeap = new MaxHeap(Q);
        line = br.readLine();
        String values[] = line.split(" ");

        for (int i = 0; i < N; i++) {
            maxHeap.insert(Integer.parseInt(values[i]));
        }

        maxHeap.maxHeap();
        int sum =0;
        int A,B, maxValue[] = new int[N],temp[]=maxHeap.heap();
        
        for(int l=0, m=temp.length; l<temp.length-2;l++,m--)
          {
            maxValue[l]=temp[m-1];
            System.out.println(maxValue[l]);
          }  

        // maxHeap.print();
        
        for(int j =0;j<Q;j++)
        {
            line = br.readLine();
            A = Integer.parseInt(line.split(" ")[0]);
            B = Integer.parseInt(line.split(" ")[1]);
            sum =sum + maxValue[A-1];
            for(int k = A;k<B;k++)
            {
                sum =sum + maxValue[k];
            }
            System.out.println(sum);
            
        }
        System.out.println(sum);
    }
}

 class MaxHeap
    {
        private int[] Heap;
        private int size;
        private int maxsize;     

        private static final int FRONT = 1;

       public MaxHeap(int maxsize)

        {
            this.maxsize = maxsize;
            this.size = 0;
            Heap = new int[this.maxsize + 1];
            Heap[0] = Integer.MAX_VALUE;
        }

        private int parent(int pos)
        {
            return pos / 2;
        }

        private int leftChild(int pos)
        {
            return (2 * pos);
        }
        
        private int rightChild(int pos)
        {
            return (2 * pos) + 1;
        }

        private boolean isLeaf(int pos)
        {
            if (pos >=  (size / 2)  &&  pos <= size)
            {
                return true;
            }
            return false;
        }
        
        private void swap(int fpos,int spos)
        {
            int tmp;
            tmp = Heap[fpos];
            Heap[fpos] = Heap[spos];

            Heap[spos] = tmp;

        }

        public int[] heap()
        {
            return Heap;
        }
     

        private void maxHeapify(int pos)

        {

            if (!isLeaf(pos))

            { 

                if ( Heap[pos] < Heap[leftChild(pos)]  || Heap[pos] < Heap[rightChild(pos)])

                {

                    if (Heap[leftChild(pos)] > Heap[rightChild(pos)])

                    {

                        swap(pos, leftChild(pos));

                        maxHeapify(leftChild(pos));

                    }else

                    {

                        swap(pos, rightChild(pos));

                        maxHeapify(rightChild(pos));

                    }

                }

            }

        }

     

        public void insert(int element)

        {

            Heap[++size] = element;
            int current = size;

            while(Heap[current] > Heap[parent(current)])

            {
                swap(current,parent(current));
                current = parent(current);
            }   

        }

     

        public void print()

        {

            for (int i = 1; i <= size / 2; i++ )

            {

                System.out.print(" PARENT : " + Heap[i] + " LEFT CHILD : " + Heap[2*i]

                      + " RIGHT CHILD :" + Heap[2 * i  + 1]);

                System.out.println();

            }

        }

     

        public void maxHeap()

        {

            for (int pos = (size / 2); pos >= 1; pos--)

            {

                maxHeapify(pos);

            }

        }

     

        public int remove()

        {

            int popped = Heap[FRONT];

            Heap[FRONT] = Heap[size--]; 

            maxHeapify(FRONT);

            return popped;

        }

     

        // public static void main(String...arg)

        // {

        //     System.out.println("The Max Heap is ");

        //     MaxHeap maxHeap = new MaxHeap(15);
        //     maxHeap.maxHeap();
        //     maxHeap.print();

        //     System.out.println("The max val is " + maxHeap.remove());

        // }

    }
