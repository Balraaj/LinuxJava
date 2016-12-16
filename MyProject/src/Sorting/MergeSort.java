package Sorting;

public class MergeSort
{
    static void merge(int[] arr,int start,int mid,int end)
    {
        int n = mid-start+1;
        int m = end-mid;
        int index = start;

        int[] arr1 = new int[n];
        int[] arr2 = new int[m];

        for(int i=0;i<n;i++)
        {
            arr1[i] = arr[index++];
        }

        for(int i=0;i<m;i++)
        {
            arr2[i] = arr[index++];
        }

        int i = 0;
        int j = 0;
        index = start;

        while((i<n)&&(j<m))
        {
            if(arr1[i]<arr2[j])
            {
                arr[index++] = arr1[i++];
            }
            else
            {
                arr[index++] = arr2[j++];
            }
        }

        while(i<n)
        {
            arr[index++] = arr1[i++];
        }

        while(j<m)
        {
            arr[index++] = arr2[j++];
        }
    }

    static void sort(int[] arr,int start,int end)
    {
        if(start<end)
        {
            int mid =(start+end)/2;
            sort(arr,start,mid);
            sort(arr,mid+1,end);
            merge(arr,start,mid,end);
        }
    }


    public static void main(String[] args)
    {
        int[] arr = {123,2,-123,-65,334,1,2,1};
        sort(arr,0,arr.length-1);

        for(int i =0;i<arr.length;i++)
        {
            System.out.print(" "+arr[i]);
        }
    }
}
