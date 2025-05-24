package vut;
import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Ellipse2D;

/**
 *
 */
public class TrioCirclesApplet extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */

    private TrioCircles_Class objCircles;
    private int x, y;
    private Graphics myG;

    public TrioCirclesApplet() {

        x = Integer.parseInt(JOptionPane.showInputDialog("Enter X-Coordinate"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Enter Y-Coordinate"));
        objCircles = new TrioCircles_Class(x, y);

        this.addMouseListener(new myTrioEvent());
    }

    @Override
    public void init() {
        resize(100, 100);
        // TODO start asynchronous download of heavy resources
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        objCircles.displayTrioCircles(g2d);
        myG = g.create();
    }

    //Inner Class
    private class myTrioEvent implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent me) {
           Ellipse2D.Double c1,c2,c3;
            Graphics2D g2d = (Graphics2D)myG;


            if (me.getButton() == MouseEvent.BUTTON1) {
                objCircles.leftClickTrioCircles(g2d);
                repaint();


            }else if (me.getButton() <= MouseEvent.BUTTON2){
                objCircles.midClickTrioCircles(g2d);
                repaint();
                } else if ((me.getButton() <= MouseEvent.BUTTON3)){
                objCircles.rightClickTrioCircles(g2d);
                repaint();
            }

//        When left button clicked – it must change circle1(c1) color to blue and c2 color to
//yellow and c3 color red.
//- When middle button clicked – it must change circle1(c1) color to orange and c2
//color to green and c3 color magenta.
//- When right button clicked – it must change circle1(c1) color to gray and c2 color to
//cyan and c3 color pink.


        }

        @Override
        public void mousePressed(MouseEvent me) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseReleased(MouseEvent me) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseEntered(MouseEvent me) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseExited(MouseEvent me) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    }//Main
}
