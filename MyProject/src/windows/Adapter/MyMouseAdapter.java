package windows.Adapter;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyMouseAdapter extends MouseAdapter
{
    MyFrame myframe;

    public MyMouseAdapter(MyFrame myframe)
    {
        this.myframe = myframe;
    }

    public void mouseClicked(MouseEvent e)
    {
        myframe.setMsg("Mouse Clicked");
        myframe.repaint();
    }

    public void mouseEntered(MouseEvent e)
    {
        myframe.setMsg("Mouse Entered");
        myframe.repaint();
    }

    public void mouseExited(MouseEvent e)
    {
        myframe.setMsg("Mouse Exited");
        myframe.repaint();
    }
}



