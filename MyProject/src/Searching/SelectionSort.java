package Searching;

public class SelectionSort
{
    static void sort(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int index = i;

            for(int j = i+1;j<arr.length;j++)
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
        int[] arr={13,2,1,-1,234,1231231,987};
        sort(arr);

        System.out.print("After sorting : ");
        for(int i =0;i<arr.length;i++)
        {
            System.out.print(" "+arr[i]);
        }
    }
}
