package Searching;

public class BubbleSort
{
    static void sort(int[] arr)
    {
        for(int i =0;i<arr.length-1;i++)
        {
            for(int j = 0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args)
    {
        int[] arr={123,2,-12,234,1,56464,0,5};
        sort(arr);

        System.out.print("After sorting : ");

        for(int i = 0;i<arr.length;i++)
        {
            System.out.print(" "+arr[i]);
        }
    }
}
