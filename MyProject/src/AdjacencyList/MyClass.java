package AdjacencyList;
import java.util.Scanner;
public class MyClass
{
    public static void main(String[] args)
    {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("How many vertices : ");
        n = in.nextInt();

        MyList[] list = new MyList[n];

        for(int i=0;i<n;i++)
        {
            list[i] = new MyList();
        }

        for(int i=0;i<n;i++)
        {
            int TotalVertices;
            System.out.print("\nEnter no of adjacent vertices to "+i+" : ");
            TotalVertices = in.nextInt();

            for(int j=0;j<TotalVertices;j++)
            {
                int value;
                System.out.print("\nEnter adjacent vertix : ");
                value = in.nextInt();

                list[i].insert(value);

            }

        }

        MyQueue result = new MyQueue();
        MyList.dfs_dir(list,0,result);

        result.printQ();

       // System.out.print("\n\nBFS IS : ");
       // MyList.bfs(list);



    }

}
