/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut.flagClass;

import java.awt.Color;
import java.awt.*;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import jdk.nashorn.internal.objects.NativeError;

/**
 *
 * @author madking
 */
public class flagclass {

    private int x, y, w, h;

    public flagclass(int x, int y, int w, int h) {
        setX(x);
        setY(y);
        setW(w);
        setH(h);

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getW() {
        return w;
    }

    public int getH() {
        return h;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setW(int w) {
        this.w = w;
    }

    public void setH(int h) {
        this.h = h;
    }

    public void myrect(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        Rectangle2D.Double oragebox = new Rectangle2D.Double(306, 68, 150, 60);
        Rectangle2D.Double whitebox = new Rectangle2D.Double(306, 128, 150, 60);
        Rectangle2D.Double greenbox = new Rectangle2D.Double(306, 188, 150, 60);

        // g2.drawString("The natinal Flag", x, y);
        g2.setColor(Color.black);

        g2.setColor(Color.orange);
        g2.fill(oragebox);

        g2.setColor(Color.white);
        g2.fill(whitebox);

        g2.setColor(Color.green);
        g2.fill(greenbox);

        g2.setStroke(new BasicStroke(8));
        g2.setColor(Color.black);

        g2.drawLine(306, 60, 306, 400);
        g2.fillOval(275, 395, 120, 50);

        g2.setStroke(new BasicStroke(4));
        g2.setColor(Color.cyan);
        g2.drawOval(356, 128, 60, 60);


        int xcord = 386, ycord = 158, a = 0;
        double x, y, b = 3.14, c = 180.0, d;
        double r = 30;

        for (int i = 0; i <= 24; i++) {
            d = (double) a * b / c;
            x = xcord + (double) r * Math.cos(d);
            y = ycord + (double) r * Math.sin(d);
            g2.drawLine(xcord, ycord, (int) x, (int) y);
            a += 360 / 24;
        }

    }

}
