package Thread;

public class ThreadSync extends Thread
{
    public static  final int ODD = 1;
    public static final int EVEN = 2;
    int type = 0;
    Temp obj = new Temp();

    ThreadSync(int TYPE)
    {
        this.type = TYPE;
        new Thread(this).start();
    }

    public void run()
    {
        synchronized (obj)
        {
            obj.print(type);
        }
    }

    public static void main(String[] args)
    {
        ThreadSync t1 = new ThreadSync(ThreadSync.ODD);
        ThreadSync t2 = new ThreadSync(ThreadSync.EVEN);
    }
}

class Temp
{
    void print(int TYPE)
    {
        int i = 0;
        if(TYPE==ThreadSync.ODD)
        {
            i = 1;
        }

        for(;i<20;i+=2)
        {
            System.out.println(i);
        }
    }
}
