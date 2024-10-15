import java.applet.*;
import java.awt.*;
/*<applet code=Welcome width=500 height=500>
</applet>*/
public class  Welcome extends Applet
{
public void paint(Graphics g)
{
g.setColor(Color.blue);
setBackground(Color.black);
g.drawString("Welcome to Applet Program",15,20);
}
}