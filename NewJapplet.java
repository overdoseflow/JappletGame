import javax.swing.JApplet;
import java.awt.Color;
import java.awt.event.*;
import java.awt.Graphics;

public class NewJApplet extends JApplet implements KeyListener{

  int x=250, y=200;
  int i=0,m=0;
    
    public void init() {
        addKeyListener(this);
    }
    
    @Override
    public void keyTyped(KeyEvent k){
    }
    @Override
    public void keyPressed(KeyEvent k){
    
    Graphics g =getGraphics();
    g.clearRect(x, y, 20, 20);
    int tus=k.getKeyCode();
    
    switch(tus){
    
        case KeyEvent.VK_UP:
            y-=20;
            break;
            
        case KeyEvent.VK_DOWN:
            y+=20;
            break;
            
        case KeyEvent.VK_LEFT:
            x-=20;
            break;
            
        case KeyEvent.VK_RIGHT:
            x+=20;
            break;
    }
    repaint();
    }
    @Override
    public void keyReleased(KeyEvent k){}
    

    public void paint(Graphics g){
        
        g.setColor(Color.red);
        g.fillOval(x, y, 20, 20);
    
    }
}
