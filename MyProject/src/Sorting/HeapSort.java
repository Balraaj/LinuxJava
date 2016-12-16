package Sorting;

public class HeapSort
{
    static void heapify(int[] arr,int i,int heapsize)
    {
        int left = i*2+1;
        int right = i*2+2;
        int max = i;

        if((left<heapsize)&&(arr[left]>arr[max]))
        {
            max = left;
        }

        if((right<heapsize)&&(arr[right]>arr[max]))
        {
            max = right;
        }

        if(max!=i)
        {
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
            heapify(arr,max,heapsize);
        }
    }

    static void buildHeap(int[] arr)
    {
        int top = arr.length/2-1;

        for(int i = top;i>=0;i--)
        {
            heapify(arr,i,arr.length);
        }
    }

    static void sort(int[] arr)
    {
        buildHeap(arr);
        System.out.print("\nAfter building heap : ");
        for(int i =0;i<arr.length;i++)
        {
            System.out.print(" "+arr[i]);
        }
        System.out.print("\n\n");

        int heapsize = arr.length;

        for(int i=arr.length-1;i>0;i--)
        {
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            heapsize--;

            heapify(arr,0,heapsize);
        }
    }

    public static void main(String[] args)
    {
        int[] arr = {12,3,44,-1,3,123,333,123123,-12312};
        sort(arr);

        for(int i = 0;i<arr.length;i++)
        {
            System.out.print(" "+arr[i]);
        }
    }
}
