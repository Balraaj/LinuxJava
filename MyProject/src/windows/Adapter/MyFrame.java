package windows.Adapter;

import java.awt.*;
public class MyFrame extends Frame
{
    private String msg = "Welcome";
    private String msg1 = "Mouse Location : ";
    private int x = 0;
    private int y = 0;

    MyFrame()
    {
        addMouseListener(new MyMouseAdapter(this));
        addWindowListener(new MyWindowAdapter(this));
        addMouseMotionListener(new MyMouseMotionAdapter(this));
        setVisible(true);
        setSize(300,300);

    }

    public void setX(int x)
    {
        this.x = x;
    }

    public void setY(int y)
    {
        this.y = y;
    }
    public void setMsg(String msg)
    {
        this.msg = msg;
    }

    public void paint(Graphics g)
    {
        g.drawString(msg,100,100);
        g.drawString(msg1+x+","+y,100,130);
    }

    public static void main(String[] args)
    {
        MyFrame ob = new MyFrame();

    }


}
