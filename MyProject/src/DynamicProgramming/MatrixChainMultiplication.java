package DynamicProgramming;

public class MatrixChainMultiplication
{
    static int[][] multiply(int[] arr)
    {

        int n = arr.length-1;
        int[][] temp = new int[n][n];

        for(int i=0;i<n;i++)
        {
            temp[i][i] = 0;
        }

        for(int l =2;l<n+1;l++)
        {
            for(int i=0;i<n-l+1;i++)
            {
                int j = i+l-1;
                temp[i][j] = 9999999;

                for(int k = i;k<j;k++)
                {
                    int q = temp[i][k]+temp[k+1][j]+arr[i]*arr[k+1]*arr[j+1];
                    if(q<temp[i][j])
                    {
                        temp[i][j] = q;
                    }
                }
            }
        }
        return temp;

    }

    public static void main(String[] args)
    {
        int[] arr ={30,35,15,5,10,20,25};
        int[][] temp = multiply(arr);

        System.out.print("Total : "+temp[0][5]);
    }
}
