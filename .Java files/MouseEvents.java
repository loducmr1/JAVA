import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="MouseEvents" width=300 height=300></applet>
*/
public class MouseEvents extends Applet implements MouseListener,MouseMotionListener
{
String msg="";
int mouseX=0,mouseY=0;
public void init()
{
addMouseListener(this);
addMouseMotionListener(this);
}
public void mouseClicked(MouseEvent me)
{
mouseX=0;
mouseY=10;
msg="Mouse Clicked.";
repaint();
}
public void mouseEntered(MouseEvent me)
{
mouseX=0;
mouseY=10;
msg="Mouse Entered.";
repaint();
}
public void mouseExited(MouseEvent me)
{
mouseX=0;
mouseY=10;
msg="Mouse Exited.";
repaint();
}
public void mousePressed(MouseEvent me)
{
mouseX=me.getX();
mouseY=me.getY();
msg="Mouse Pressed.";
repaint();
}
public void mouseReleased(MouseEvent me)
{
mouseX=0;
mouseY=10;
msg="Mouse Released.";
repaint();
}
public void mouseDragged(MouseEvent me)
{
mouseX=me.getX();
mouseY=me.getY();
msg="Mouse Dragged.";
showStatus("Dragging mouse at "+mouseX+","+mouseY);
repaint();
}
public void mouseMoved(MouseEvent me)
{
showStatus("Moving mouse at "+me.getX()+","+me.getY());
}
public void paint(Graphics g)
{
g.drawString(msg,mouseX,mouseY);
}
}