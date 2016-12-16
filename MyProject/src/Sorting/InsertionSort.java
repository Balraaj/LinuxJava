package Sorting;

public class InsertionSort
{
    static void sort(int[] arr)
    {
        for(int i =1;i<arr.length;i++)
        {
            int value = arr[i];
            int j = i-1;

            while((j>=0)&&(arr[j]>value))
            {
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = value;
        }
    }

    public static void main(String[] args)
    {
        int[] arr = {123,98,32,-12,76,-9998,0};
        sort(arr);

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(" "+arr[i]);
        }
    }
}
