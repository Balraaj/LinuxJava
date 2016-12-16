package Sorting;

public class CountSort
{

    static int[] countSort(int[] arr)
    {
        int n = 0;
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i]>n)
            {
                n = arr[i];
            }
        }


        int[] temp = new int[n+1];


        for(int i=0;i<arr.length;i++)
        {
            temp[arr[i]] ++;
        }

        for(int i =1;i<n+1;i++)
        {
            temp[i] = temp[i]+temp[i-1];
        }

        int[] c = new int[arr.length];

        for(int i = arr.length-1;i>=0;i--)
        {
            c[temp[arr[i]]-1] = arr[i];
            temp[arr[i]]--;
        }

        return c;
    }


    public static void main(String[] args)
    {
        int[] arr = {100,3,2,1,34,23,1,98};

        arr = countSort(arr);

        for(int i =0;i<arr.length;i++)
        {
            System.out.print(" "+arr[i]);
        }
    }
}
