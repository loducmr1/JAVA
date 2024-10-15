import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="KeyEvents" width=300 height=300></applet>
*/
public class KeyEvents extends Applet implements KeyListener{
Label l;
TextArea t;
public void init(){
l=new Label();
t=new TextArea();
setLayout(null);
l.setBounds(10,50,250,20);
t.setBounds(20,60,250,300);                                                                                                                                                                                                                
t.addKeyListener(this);
add(l);
add(t);
}
public void keyTyped(KeyEvent e){
l.setText("Key Typed.");
}
public void keyPressed(KeyEvent e){
l.setText("Key Pressed.");
}
public void keyReleased(KeyEvent e){
l.setText("Key Released.");
}
}