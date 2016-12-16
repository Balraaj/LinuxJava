package AdjacencyList;

public class MyQueue
{
    int start = 0;
    int end = 0;

    int[] arr = new int[100];

    void enqueue(int x)
    {

            arr[end++] = x;


    }

    int dequeue()
    {
       return arr[start++];
    }

    boolean isEmpty()
    {
        return (start==end);
    }

    boolean InQueue(int value)
    {
        boolean flag = false;
        for(int i=start;i<end;i++)
        {
            if(arr[i]==value)
            {
                flag = true;
            }
        }

        return flag;
    }

    void printQ()
    {
        for(int i=start;i<end;i++)
        {
            System.out.print(" "+this.arr[i]);
        }
    }
}
