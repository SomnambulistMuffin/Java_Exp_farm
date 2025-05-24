package vut;

import javafx.scene.shape.Ellipse;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Ellipse2D;

/**
 * @author 211109592_W_MASEKO
 * 214096076_AM_RAMOKGOPA
 * 217202071_RC_MOTEBELE
 * 217210597_MJ_RAMARUMO
 * 215420926_TB_SETOUTO
 * 215079698_S_ZWANE
 */
public class TrioCircles_Class {

    private int x, y;

    public  TrioCircles_Class(){
        this.x=0;
        this.y = 0;

    }

    public TrioCircles_Class(int x, int y) {
        setX(x);
        setY(y);
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public void displayTrioCircles(Graphics2D g2d) {
        Ellipse2D.Double circle1, circle2, circle3;
        int x1, x2, y1, y2;
        x1 = x + 65;
        x2 = x1 + 65;
        y1 = y;
        y2 = y1;

        circle1 = new Ellipse2D.Double(x, y, 100, 100);
        g2d.setColor(Color.yellow);
        g2d.fill(circle1);
        circle2 = new Ellipse2D.Double(x1, y1, 100, 100);
        g2d.setColor(Color.cyan);
        g2d.fill(circle2);
        circle3 = new Ellipse2D.Double(x2, y2, 100, 100);
        g2d.setColor(Color.pink);
        g2d.fill(circle3);
    }

    public void leftClickTrioCircles(Graphics2D g2d){
        Ellipse2D.Double circle1, circle2, circle3;
        int x1, x2, y1, y2;
        x1 = x + 65;
        x2 = x1 + 65;
        y1 = y;
        y2 = y1;

        circle1 = new Ellipse2D.Double(x, y, 100, 100);
        g2d.setColor(Color.blue);
        g2d.fill(circle1);
        circle2 = new Ellipse2D.Double(x1, y1, 100, 100);
        g2d.setColor(Color.yellow);
        g2d.fill(circle2);
        circle3 = new Ellipse2D.Double(x2, y2, 100, 100);
        g2d.setColor(Color.red);
        g2d.fill(circle3);

    }

    public void midClickTrioCircles(Graphics2D g2d){
        Ellipse2D.Double circle1, circle2, circle3;
        int x1, x2, y1, y2;
        x1 = x + 65;
        x2 = x1 + 65;
        y1 = y;
        y2 = y1;

        circle1 = new Ellipse2D.Double(x, y, 100, 100);
        g2d.setColor(Color.orange);
        g2d.fill(circle1);
        circle2 = new Ellipse2D.Double(x1, y1, 100, 100);
        g2d.setColor(Color.green);
        g2d.fill(circle2);
        circle3 = new Ellipse2D.Double(x2, y2, 100, 100);
        g2d.setColor(Color.magenta);
        g2d.fill(circle3);

    }

    public void rightClickTrioCircles(Graphics2D g2d){
        Ellipse2D.Double circle1, circle2, circle3;
        int x1, x2, y1, y2;
        x1 = x + 65;
        x2 = x1 + 65;
        y1 = y;
        y2 = y1;

        circle1 = new Ellipse2D.Double(x, y, 100, 100);
        g2d.setColor(Color.gray);
        g2d.fill(circle1);
        circle2 = new Ellipse2D.Double(x1, y1, 100, 100);
        g2d.setColor(Color.cyan);
        g2d.fill(circle2);
        circle3 = new Ellipse2D.Double(x2, y2, 100, 100);
        g2d.setColor(Color.pink);
        g2d.fill(circle3);

    }
}

