package windows.Adapter;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyWindowAdapter extends WindowAdapter
{
    MyFrame myframe;

    MyWindowAdapter(MyFrame myframe)
    {
        this.myframe = myframe;
    }

    public void windowClosing(WindowEvent e)
    {
        myframe.setVisible(false);
    }
}
