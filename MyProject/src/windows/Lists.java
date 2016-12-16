package windows;

import java.awt.*;
import java.awt.event.*;

public class Lists extends Frame implements ItemListener
{
    String msg1 = "Selected item : ";
    String msg2 = "";
    Choice mylist;
    Lists()
    {
        setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        mylist = new Choice();
        mylist.add("Windows");
        mylist.add("Mac");
        mylist.add("Linux");
        mylist.add("BSD");

        mylist.addItemListener(this);
        add(mylist);

        setSize(300,300);
        setVisible(true);
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent w)
            {
                setVisible(false);
            }
        });

    }

    public void itemStateChanged(ItemEvent e)
    {
        msg2 = mylist.getSelectedItem();
        repaint();
    }

    public void paint(Graphics g)
    {


        g.drawString(msg1+msg2,100,100);
    }

    public static void main(String[] args)
    {
        Lists l = new Lists();
    }
}
