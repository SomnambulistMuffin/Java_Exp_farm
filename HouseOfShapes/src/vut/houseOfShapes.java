/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut;

import java.applet.Applet;
import java.awt.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

/**
 *
 * @author Nthabi
 */
public class houseOfShapes extends Applet {

    @Override
    public void init() {
    }

    @Override
    public void paint(Graphics pen) {
        Graphics2D pen2D = (Graphics2D) pen;

        int x = 250;
        int y = 200;
        int w = 500;
        int h = 300;

        //rectangles
        Rectangle house, garage, door, car;
        house = new Rectangle(x, y, w, h);
        garage = new Rectangle(w + x, y, w - (x / 5) + (x / 5), y + (y / 4));
        door = new Rectangle(w - (x / 4), h, w / 5, y);
        car = new Rectangle(w + x + (w / 5), h, w - x + (x / 5), y / 4);

        Line2D.Double lineHouseLeft, lineHouseRight, lineHouseStr8, lineCarLeft, lineCarRight, lineCarStr8;
        lineHouseLeft = new Line2D.Double(x, y, (w - x) + (x / 5), y / 2);
        lineHouseRight = new Line2D.Double(w + x, y, (w + x) - (x / 5), y / 2);
        lineHouseStr8 = new Line2D.Double(x + (x / 5), y / 2, (w + x) - (x / 5), y / 2);
        lineCarLeft = new Line2D.Double(w + (x * 2) - (w / 5), h, (w + x) + x - (x / 5), h - (y / 4));
        lineCarRight = new Line2D.Double(w + w + (w / 5), h, w + w + (x / 5), h - (y / 4));
        lineCarStr8 = new Line2D.Double((w + x) + x - (x / 5), h - (y / 4), w + w + (x / 5), h - (y / 4));

        //circles
        Ellipse2D.Double myWheel1, mywheel2;
        myWheel1 = new Ellipse2D.Double(w + w - (w / 5), h + (y / 8), (x / 5), (y / 4));

        mywheel2 = new Ellipse2D.Double(w + w + (x / 5), h + (y / 8), (x / 5), (y / 4));

        pen2D.setColor(Color.MAGENTA);
        pen2D.draw(house);
        pen2D.fill(house);
        pen2D.setColor(Color.YELLOW);
        pen2D.draw(garage);
        pen2D.fill(garage);
        pen2D.setColor(Color.GREEN);
        pen2D.draw(door);
        pen2D.fill(door);
        pen2D.setColor(Color.RED);
        pen2D.draw(car);
        pen2D.fill(car);
        pen2D.setColor(Color.cyan);
        pen2D.draw(lineHouseLeft);
        pen2D.fill(lineHouseLeft);
        pen2D.setColor(Color.ORANGE);
        pen2D.draw(lineHouseRight);
        pen2D.fill(lineHouseRight);
        pen2D.setColor(Color.PINK);
        pen2D.draw(lineHouseStr8);
        pen2D.fill(lineHouseStr8);
        pen2D.setColor(Color.blue);
        pen2D.draw(lineCarLeft);
        pen2D.fill(lineCarLeft);
        pen2D.setColor(Color.darkGray);
        pen2D.draw(lineCarRight);
        pen2D.fill(lineCarRight);
        pen2D.setColor(Color.GRAY);
        pen2D.draw(lineCarStr8);
        pen2D.fill(lineCarStr8);
        pen2D.setColor(Color.black);
        pen2D.draw(myWheel1);
        pen2D.fill(myWheel1);
        pen2D.setColor(Color.black);
        pen2D.draw(mywheel2);
        pen2D.fill(mywheel2);
    }
}
