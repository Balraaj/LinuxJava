package Sorting;

public class RadixSort
{
    static int[] sort(int[] arr)
    {
        int m = 0;
        int e = 1;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > 0)
            {
                m = arr[i];
            }
        }

        while (m / e > 0)
        {
            arr = rsort(arr,e);
            e*=10;
        }
        return arr;

    }

    static int[] rsort(int[] arr,int e)
    {
        int[] temp = new int[10];
        int[] c = new int[arr.length];

        for(int i = 0;i<arr.length;i++)
        {
            temp[(arr[i]/e)%10]++;
        }

        for(int i = 1;i<10;i++)
        {
            temp[i] = temp[i-1]+temp[i];
        }

        for(int i = arr.length-1;i>=0;i--)
        {
            c[temp[(arr[i]/e)%10]-1] = arr[i];
            temp[(arr[i]/e)%10]--;
        }

        return c;
    }

    public static void main(String[] args)
    {
        int[] arr = {123,34,1,2,2,98,765};
        arr = sort(arr);

        for(int i = 0;i<arr.length;i++)
        {
            System.out.print(" "+arr[i]);
        }
    }
}
