package windows.Adapter;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class MyMouseMotionAdapter extends MouseMotionAdapter
{
    MyFrame myframe;

    MyMouseMotionAdapter(MyFrame myframe)
    {
        this.myframe = myframe;
    }

    public void mouseMoved(MouseEvent e)
    {
        myframe.setX(e.getX());
        myframe.setY(e.getY());
        myframe.repaint();
    }

    public void mouseDragged(MouseEvent e)
    {
        myframe.setX(e.getX());
        myframe.setY(e.getY());
        myframe.repaint();
    }
}
