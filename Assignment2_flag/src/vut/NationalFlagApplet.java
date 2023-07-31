package vut;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;



/**
 *
 */
public class NationalFlagApplet extends Applet {
    private int x;
    private int y;
    private int w = 306;
    private int h = (68*4);
    private  FlagClass objFlag;
    private Graphics g1D;
    private Graphics2D g2D;

    @Override
    public void init() {
        resize(500,500);
    }

    public NationalFlagApplet(){

        x = Integer.parseInt(JOptionPane.showInputDialog("Please Enter x coordinate for flag"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Please Enter y coordinate for flag"));

        objFlag = new FlagClass(x,y,w,h);
        this.addMouseListener(new MyFlag());
    }

    public void paint(Graphics g){

        Graphics2D g2= (Graphics2D)g;

        g1D = g.create();
        objFlag.dispFlag(g2);

        g2D = g2;
    }

    public void dispString(Graphics2D graf2){
        Font myFont = new Font("Arial",Font.BOLD,18);
        graf2.setFont(myFont);
        graf2.setColor(Color.RED);
        graf2.drawString("The National Flag",34,380);

    }

    // clicking the mouse button
    private  class MyFlag implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent me) {
            Graphics2D gr2=(Graphics2D)g1D;
//displaying the title
            if (me.getButton()== me.BUTTON3) {
                if (me.getClickCount() == 1) {
                    dispString(gr2);
                }

            }
            //checking how many times left mouse button is clicked then change colour according to number of clicks
            if (me.getButton()== me.BUTTON1) {
                if (me.getClickCount() == 1) {
                    gr2.setColor(Color.MAGENTA);
                    repaint();
                }else if(me.getClickCount()==2){
                    Color Purple = new Color(255,0,255);
                    gr2.setColor(Purple);
                    repaint();
                }else if (me.getClickCount()>2){
                    gr2.setColor(Color.GREEN);
                    repaint();
                }
            }


        }

        @Override
        public void mousePressed(MouseEvent me) {

//throw new UnsupportedOperationException("not yet supported");
        }

        @Override
        public void mouseReleased(MouseEvent me) {
            throw new UnsupportedOperationException("not yet supported");
        }

        @Override
        public void mouseEntered(MouseEvent me) {
            throw new UnsupportedOperationException("not yet supported");
        }

        @Override
        public void mouseExited(MouseEvent me) {
            throw new UnsupportedOperationException("not yet supported");
        }
    }
}
