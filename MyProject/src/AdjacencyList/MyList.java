package AdjacencyList;

public class MyList
{
    Node head;
    Node end;
    MyList()
    {
        //System.out.println("Constructor invoked");
        head = new Node(0);
        end = head;
    }

    void insert(int value)
    {
        head.value++;
        end.next = new Node(value);
        end = end.next;
    }

    void print()
    {
        Node run = this.head;

        while(run!=null)
        {
            System.out.print(" "+run.value);
            run=run.next;
        }
    }

   static void bfs(MyList[] arr)
    {
        MyQueue Q = new MyQueue();
        MyQueue result = new MyQueue();
        Q.enqueue(0);

        while(!Q.isEmpty())
        {
            int u = Q.dequeue();
            result.enqueue(u);

            // Visit all the adjacent vertices of u

            for(Node v = arr[u].head.next;v!=null;v = v.next)
            {
                if(v.color==Node.WHITE)
                {
                    v.setColor(Node.BLACK);
                    Q.enqueue(v.value);

                    // Mark 'v' as visited in all the adjacency lists

                    for(int i=0;i<arr.length;i++)
                    {
                        for(Node n = arr[i].head.next;n!=null;n=n.next)
                        {
                            if (n.value == v.value)
                            {
                                n.setColor(Node.BLACK);
                            }
                        }
                    }

                }
            }

            // Mark 'u' visited in all the adjacency lists

            for(int i = 0;i<arr.length;i++)
            {
                for(Node run = arr[i].head.next;run!=null;run=run.next)
                {
                    if(run.value==u)
                    {
                        run.color=Node.BLACK;
                    }
                }
            }
        }

        result.printQ();

    }


    static void dfs(MyList[] arr,int i,MyQueue result)
    {
        result.enqueue(i);
        for(Node j = arr[i].head.next;j!=null;j = j.next)
        {
            if(j.color==Node.WHITE)
            {
                j.setColor(Node.BLACK);
                dfs(arr,j.value,result);
            }
        }
    }

    static void dfs_dir(MyList[] arr,int i,MyQueue result)
    {
        result.enqueue(i);

        for(int k = 0;k<arr.length;k++)
        {
            for (Node run = arr[k].head.next; run != null; run = run.next)
            {
                if (run.value == i)
                {
                    run.setColor(Node.BLACK);
                }
            }
        }

        for(Node j = arr[i].head.next;j!=null;j = j.next)
        {
            if(j.color==Node.WHITE)
            {
                dfs_dir(arr,j.value,result);
            }
        }



    }


}
