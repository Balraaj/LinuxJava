package windows;

import javafx.scene.control.CheckBox;

import java.awt.*;
import java.awt.event.*;

public class MyClass extends Frame implements ItemListener
{
    String msg1 = "Windows : ";
    String msg2 = "False";
    String msg3 = "Linux : ";
    String msg4 = "False";
    Checkbox c1,c2;

    MyClass()
    {
        setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        c1 = new Checkbox("Windows");
        c2 = new Checkbox("Linux");
        add(c1);
        add(c2);
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                setVisible(false);
            }
        });
        c1.addItemListener(this);
        c2.addItemListener(this);
        setSize(300,300);
        setVisible(true);
    }

    public void paint(Graphics g)
    {
        g.drawString(msg1,100,100);
        g.drawString(msg2,180,100);
        g.drawString(msg3,100,140);
        g.drawString(msg4,180,140);
    }
    public void itemStateChanged(ItemEvent e)
    {
        if(c1.getState())
        {
            msg2 = "True";
        }
        else
        {
            msg2 = "False";
        }

        if(c2.getState())
        {
            msg4 = "True";
        }
        else
        {
            msg4 = "False";
        }

        repaint();
    }


    public static void main(String[] args)
    {
        MyClass m = new MyClass();
    }
}

