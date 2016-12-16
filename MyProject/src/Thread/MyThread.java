package Thread;

public class MyThread extends Thread
{
    Thread t;
    int value;
    MyThread(int x)
    {
        value = x;
        t = new Thread(this);
        t.start();

    }

    public void run()
    {
        print(value);
    }

    synchronized void print(int x)
    {
        System.out.print("\nTable of :"+x);

        for(int i=1;i<=10;i++)
        {
            System.out.print("\n"+(x*i));
        }
    }

    public static void main(String[] args)
    {
        MyThread t1 = new MyThread(5);
        MyThread t2 = new MyThread(10);
        try
        {
            t1.t.join();
            t2.t.join();
            System.out.print("\nThis is main thread");
            for(int i =0;i<=10;i++)
            {
                System.out.print("\n"+i*1);
            }
        }
        catch(InterruptedException e)
        {

        }
    }
}
