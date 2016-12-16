package Sorting;

public class SelectionSort
{
    static void sort(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int index = i;

            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[index])
                {
                    index = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }

    public static void main(String[] args)
    {
        int[] arr = {123,-1,987,-23423,123,3,4,6,34};
        sort(arr);

        for(int i = 0;i<arr.length;i++)
        {
            System.out.print(" "+arr[i]);
        }
    }
}
