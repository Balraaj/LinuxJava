package Searching;

public class LinearSearch
{
    static boolean search(int[] arr,int value)
    {
        boolean flag = false;
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i]==value)
            {
                flag = true;
                break;
            }
        }

        return flag;
    }

    public static void main(String[] args)
    {
        int[] arr = {123,2,34,12,5,6,9};
        boolean var = search(arr,2);
        if(var)
        {
            System.out.print("Value found");
        }
        else
        {
            System.out.print("Value not found");
        }
    }
}
