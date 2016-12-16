package Sorting;

public class QuickSort
{
   /* static int part(int[] arr,int start,int end)
    {
        int pivot = arr[end];
        int index = start;

        for(int i =start;i<end;i++)
        {
            if(arr[i]<pivot)
            {
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;

                index++;
            }
        }

        arr[end] = arr[index];
        arr[index] = pivot;
        return index;
    }*/

    static int part(int[] arr,int start,int end)
    {
        int i = start+1;
        int j = end;
        int pivot = arr[start];

        while(i<=j)
        {
            while((i<=end)&&(arr[i]<pivot))
            {
                i++;
            }

            while((j>start)&&(arr[j]>pivot))
            {
                j--;
            }

            if(i<j)
            {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        arr[start] = arr[j];
        arr[j] = pivot;
        return j;
    }

    static void sort(int[] arr,int start,int end)
    {
        if(start<end)
        {
            int pivot = part(arr,start,end);
            sort(arr,start,pivot-1);
            sort(arr,pivot+1,end);
        }
    }


    public static void main(String[] args)
    {
        int[] arr = {6,5,4,3,2,1};
        sort(arr,0,arr.length-1);

        for(int i = 0;i<arr.length;i++)
        {
            System.out.print(" "+arr[i]);

        }
    }



}
