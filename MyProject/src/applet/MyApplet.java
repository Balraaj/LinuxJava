package applet;
import java.applet.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MyApplet extends Applet implements MouseListener, MouseMotionListener
{
    String msg = "";
    public void init()
    {
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    public void mouseExited(MouseEvent m)
    {
        msg = "Mouse Exited";
        repaint();
    }

    public void mouseReleased(MouseEvent m)
    {
        msg = "Mouse Released";
        repaint();
    }

    public void mouseEntered(MouseEvent m)
    {

    }

    public void mouseDragged(MouseEvent m)
    {

    }

    public void mousePressed(MouseEvent m)
    {

    }

    public void mouseMoved(MouseEvent m)
    {
        msg = "Mouse Moved";
        repaint();
    }

    public void mouseClicked(MouseEvent m)
    {
        msg = "Mouse Clicked";
        repaint();
    }


  public void paint(Graphics g)
  {
      Font myfont = new Font("sans-serif",Font.BOLD,18);
      g.setFont(myfont);
      g.setColor(Color.GREEN);
      g.drawString(msg,100,100);
  }
}
