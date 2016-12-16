package windows.TextInput;

import java.awt.*;
import java.awt.event.*;

public class TextInput extends Frame implements ActionListener
{
    private Label l1,l2;
    private TextField t1,t2;
    Button b1;
    public void actionPerformed(ActionEvent e)
    {
        StringBuffer str = new StringBuffer(t1.getText());
        str = str.reverse();

        String temp = str.toString();
        temp = temp.toUpperCase();
        t2.setText(temp);
    }
   TextInput()
    {
        setLayout(new FlowLayout(FlowLayout.CENTER,10,10));

        l1 = new Label("String :     ");
        l2 = new Label("Reverse :  ");
        t1 = new TextField(35);
        t2 = new TextField(35);
        b1 = new Button("Show");

        b1.addActionListener(this);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        setSize(400,200);
        setVisible(true);

    }

    public static void main(String[] args)

    {
        TextInput a = new TextInput();
    }



}
