/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

/**
 *
 * @author MATSINDE KC 215270827
 * @author  MATHEBE S 216102014
 */
public class Kite {
    private double x,y;
    private Color color;
    private int length;
    
    //default constructor

    public Kite() {
        this(80,100,Color.red,90);
        
        }
    //overloaded constructor

    public Kite(double x, double y, Color color, int length) {
        setX(x);
        setY(y);
        setColor(color);
        setLength(length);
    }

   
    
    public void setX(double x){      
    
        this.x = x;
                
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    //mutator coding
    public void setLength(int length) {
        this.length = length;
    }

    //setting the size
    public void setSize(double percentage) {
        double percent = percentage / 100;
       
        if (percentage > 0) {
            this.length += this.length * percent;
        } else {
            this.length += this.length * percent;
        }
    }
    
    public void DisplayKite(Graphics2D g2) {
         


   //declaration of the lines
    Line2D.Double leftTop, leftBottom, rightTop, rightBottom, tail;

        int leftTopX1, leftTopY1, leftTopX2, leftTopY2;
        int leftBottomX1, leftBottomY1, leftBottomX2, leftBottomY2;
        int rightTopX1, rightTopY1, rightTopX2, rightTopY2;
        int rightBottomX1, rightBottomY1, rightBottomX2, rightBottomY2;
        int tailX1, tailY1, tailX2, tailY2;

        int box = length / 3;

        leftTopX1 = (int)x;
        leftTopY1 = (int)y;
        leftTopX2 = leftTopX1 + box;
        leftTopY2 = leftTopY1 - box;

        rightTopX1 = leftTopX2;
        rightTopY1 = leftTopY2;
        rightTopX2 = rightTopX1 + box;
        rightTopY2 = rightTopY1 + box;

        rightBottomX1 = rightTopX2;
        rightBottomY1 = rightTopY2;
        rightBottomX2 = rightBottomX1 - box;
        rightBottomY2 = rightBottomY1 + (box * 2);

        leftBottomX1 = leftTopX1;
        leftBottomY1 = leftTopY1;
        leftBottomX2 = leftBottomX1 + box;
        leftBottomY2 = leftBottomY1 + (box * 2);

        tailX1 = leftBottomX2;
        tailY1 = leftBottomY2;
        tailX2 = tailX1 - box;
        tailY2 = tailY1 + (box * 3);

        //Left top line coordinates
        leftTop = new Line2D.Double(leftTopX1, leftTopY1, leftTopX2, leftTopY2);
        //Riht top line coordinates
        rightTop = new Line2D.Double(rightTopX1, rightTopY1, rightTopX2, rightTopY2);
        //Right bottom line coordinates
        rightBottom = new Line2D.Double(rightBottomX1, rightBottomY1, rightBottomX2, rightBottomY2);
        //Left bottom line coordinates
        leftBottom = new Line2D.Double(leftBottomX1, leftBottomY1, leftBottomX2, leftBottomY2);
        //The tail coordinates
        tail = new Line2D.Double(tailX1, tailY1, tailX2, tailY2);

        g2.setColor(color);
        g2.draw(leftTop);
        g2.draw(rightTop);
        g2.draw(rightBottom);
        g2.draw(leftBottom);
        g2.draw(tail);
    }
    
}
