package Searching;

public class LineraSerachRecur
{
    static boolean search(int[] arr,int start,int value)
    {
        if(start==arr.length)
        {
            return false;
        }

        else if(arr[start]==value)
        {
            return true;
        }

        else
        {
            return search(arr,start+1,value);
        }
    }


    public static void main(String[] args)
    {
        int[] arr={123,2,34,2,67,8,1};
        boolean flag = search(arr,0,1);

        if(flag)
        {
            System.out.print("Value found");
        }
        else
        {
            System.out.print("Value not found");
        }
    }
}
