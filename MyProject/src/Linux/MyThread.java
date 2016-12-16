package Linux;

import java.lang.Runnable;
/**
 * Created by balraj on 24/6/16.
 */

class MyClass implements Runnable
{
   public MyClass(String name)
   {
       Thread T = new Thread(this,name);
       T.start();
       System.out.println("New Thread is starting");

   }

    public void run()
    {
        try
        {
            for(int i=0;i<10;i++)
            {
                System.out.println("New Thread : "+i);
                Thread.sleep(10000);
            }
        }
        catch (InterruptedException E)
        {
            System.out.println("Exception found");
        }
    }

}


public class MyThread {

    public static void main(String[] args) {
        Thread T = Thread.currentThread();
        MyClass obj=new MyClass("Balraj");


        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Main Thread : " + i);
                T.sleep(2000);
            }
        }
        catch (InterruptedException E)
        {
          System.out.println("Exception found");
        }

    }
}