package vut;

//import declarations
import java.awt.*;
import  java.awt.geom.*;
import sun.java2d.loops.DrawRect;

/**
 *
 * @author 215079698
 */

public class FlagClass {

    private int x,y,w,h;
    private String title = "the national Flag";

    public FlagClass(){
        this.x =0;
        this.y=0;
        this.w = 0;
        this.h = 0;
    }

    public FlagClass(int x, int y,int w,int h) {
        setX(x);
        setY(y);
        setW(w);
        setH(h);
    }

    public void setX(int x) {
        if (x >= 0) {
            this.x = x;
        }else{
            throw new IllegalArgumentException("Enter a valid coordinate");
        }

    }
    public void setY(int y) {
        if (y >= 0) {
            this.y = y;
        }else{
            throw new IllegalArgumentException("Enter a valid coordinate");
        }

    }
    public void setW(int w) {
        if (w >= 0) {
            this.w = w;
        }else{
            throw new IllegalArgumentException("Enter a valid coordinate");
        }

    }
    public void setH(int h) {
        if (h >= 0) {
            this.h = h;
        }else{
            throw new IllegalArgumentException("Enter a valid coordinate");
        }

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

    public void dispFlag( Graphics g) {
       Graphics2D g2 = (Graphics2D)g;

       //pole
        BasicStroke Stroke = new BasicStroke(10);
        g2.setStroke(Stroke);

        g2.setColor(Color.BLACK); //changing color of stroke

        Line2D.Double line1 = new Line2D.Double(25,0,25,400);// drrawing the line for the pole
        g2.draw(line1);

        Ellipse2D.Double circle1 = new Ellipse2D.Double(0,400,80,30);
        g2.fill(circle1);

        //flag

        g2.setColor(Color.ORANGE); //orange stripe
        Rectangle2D.Double rectOrange = new Rectangle2D.Double(x,y,306,68);
        g2.fill(rectOrange);

        g2.setColor(Color.WHITE); //White stripe
        Rectangle2D.Double rectWhite = new Rectangle2D.Double(x,y+68,306,68);
        g2.fill(rectWhite);

        g2.setColor(Color.GREEN); //Green stripe
        Rectangle2D.Double rectGreen = new Rectangle2D.Double(x,y+(68*2),306,68);
        g2.fill(rectGreen);

        //wheel

        g.setColor(Color.blue);
        g2.setStroke(new java.awt.BasicStroke(2));
        g.drawOval((x+155)-15,(y+68),68,68);

        //spoke of wheel
        int spoke= 0;
        int x =210;// central x-coordinate
        int y =130;//central y-coordinate

        double x1,y1;
        double d; // diameter

        x=(x-5); // this is just to help with aligning the flag


        g.setColor(Color.blue);

        // loop for drawing wheel spoke lines
        for (int i = 1; i <= 24; i++) {
            d=(double)spoke*3.14/24; //diameter calculation
            x1= x+(double)30*(Math.cos(d)); // spoke width at the top part pf circle
            y1 = y+(double)33*(Math.sin(d));//spoke width at bottom of the circle
            g.drawLine(x,y,(int)x1,(int)y1);
            spoke = spoke +(360/24);
        }


    }
}
