/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut.applet;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import javax.swing.JApplet;
import javax.swing.JOptionPane;

/**
 *
 * @author st
 */
public class streetLights extends JApplet {

    private Color r = Color.white;
    private Color o = Color.white;
    private Color gr = Color.white;

    public void init() {

    }

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        //robot        
        g2.setStroke(new BasicStroke(2));
        Point2D a = new Point2D.Double(40, 20);
        Point2D b = new Point2D.Double(100, 20);
        Point2D c = new Point2D.Double(100, 200);
        Point2D d = new Point2D.Double(40, 200);

        Line2D.Double l1 = new Line2D.Double(a, b);
        Line2D.Double l2 = new Line2D.Double(b, c);
        Line2D.Double l3 = new Line2D.Double(d, c);
        Line2D.Double l4 = new Line2D.Double(a, d);

        g2.draw(l1);
        g2.draw(l2);
        g2.draw(l3);
        g2.draw(l4);

        //pole
        g2.setStroke(new BasicStroke(10));
        Point2D e = new Point2D.Double(70, 205);
        Point2D f = new Point2D.Double(70, 400);
        Line2D.Double l5 = new Line2D.Double(e, f);
        g2.draw(l5);

        //lihgts
        g2.setStroke(new BasicStroke(1));
        g2.setColor(gr);
        Ellipse2D e1 = new Ellipse2D.Double(55, 40, 30, 30);
        g2.fill(e1);
        g2.setColor(o);
        Ellipse2D e2 = new Ellipse2D.Double(55, 95, 30, 30);
        g2.fill(e2);
        g2.setColor(r);
        Ellipse2D e3 = new Ellipse2D.Double(55, 150, 30, 30);
        g2.fill(e3);

        //base
        g2.setColor(Color.black);
        Ellipse2D e4 = new Ellipse2D.Double(30, 400, 80, 30);
        g2.fill(e4);

        //car
        //chasie
        Point2D cp1 = new Point2D.Double(190, 300);
        Point2D cp2 = new Point2D.Double(290, 300);
        Point2D cp3 = new Point2D.Double(330, 260);
        Point2D cp4 = new Point2D.Double(400, 260);
        Point2D cp5 = new Point2D.Double(450, 300);
        Point2D cp6 = new Point2D.Double(500, 300);
        Point2D cp7 = new Point2D.Double(500, 380);
        Point2D cp8 = new Point2D.Double(180, 380);
        Point2D cp9 = new Point2D.Double(180, 330);
        //lights
        Arc2D headLight = new Arc2D.Double(160, 285, 35, 50, -80, 100, 0);
        //wheels
        Ellipse2D front = new Ellipse2D.Double(225, 355, 50, 50);
        Ellipse2D back = new Ellipse2D.Double(420, 355, 50, 50);
        Ellipse2D frontHub = new Ellipse2D.Double(240, 370, 20, 20);
        Ellipse2D backHub = new Ellipse2D.Double(435, 370, 20, 20);

        Line2D.Double cl1 = new Line2D.Double(cp1, cp2);
        Line2D.Double cl2 = new Line2D.Double(cp2, cp3);
        Line2D.Double cl3 = new Line2D.Double(cp3, cp4);
        Line2D.Double cl4 = new Line2D.Double(cp4, cp5);
        Line2D.Double cl5 = new Line2D.Double(cp5, cp6);
        Line2D.Double cl6 = new Line2D.Double(cp6, cp7);
        Line2D.Double cl7 = new Line2D.Double(cp7, cp8);
        Line2D.Double cl8 = new Line2D.Double(cp8, cp9);
        Line2D.Double cl9 = new Line2D.Double(cp9, cp1);
        Line2D.Double cl10 = new Line2D.Double(cp2, cp5);

        g2.draw(cl1);
        g2.draw(cl2);
        g2.draw(cl3);
        g2.draw(cl4);
        g2.draw(cl5);
        g2.draw(cl6);
        g2.draw(cl7);
        g2.draw(cl8);
        g2.draw(cl9);
        g2.draw(cl10);

        g2.draw(headLight);
        g2.draw(front);
        g2.draw(back);
        g2.setColor(Color.white);
        g2.fill(frontHub);
        g2.fill(backHub);
        g2.setColor(Color.black);
        g2.draw(frontHub);
        g2.draw(backHub);
        this.addMouseListener(new ClickEvent());

    }

    private class ClickEvent implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent me) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            //JOptionPane.showMessageDialog(null, "Hello");

            if (me.getClickCount() == 1) {
                r = Color.red;
                o = Color.white;
                gr = Color.white;
            } else if (me.getClickCount() == 2) {
                r = Color.white;
                o = Color.orange;
                gr = Color.white;
            } else if (me.getClickCount() == 3) {
                r = Color.white;
                o = Color.white;
                gr = Color.green;
            }
            repaint();
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

    }

//    private class Ellipse2DMouseListner implements MouseListener{
//
//        @Override
//        public void mouseClicked(MouseEvent e) {
//            if ()
//        }
//
//        @Override
//        public void mousePressed(MouseEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        }
//
//        @Override
//        public void mouseReleased(MouseEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        }
//
//        @Override
//        public void mouseEntered(MouseEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        }
//
//        @Override
//        public void mouseExited(MouseEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        }
//        
//    }
}
