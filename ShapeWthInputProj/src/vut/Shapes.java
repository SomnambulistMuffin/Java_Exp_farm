/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut;
import java.awt.*;
/**
 *
 * @author Thaby
 */
public class Shapes {
    private int x,y, recWidth,recHeight;
    public Shapes(int x,int y,int recWidth,int recHeight){
    this.x=x;
    this.y=y;
    this.recWidth=recWidth;
    this.recHeight=recHeight;
            
    }
    public void setMyX(int x){
    this.x=x;
    }
    
       public void setMyY(int y){
    this.y=y;
    }
    public int getX(){
    return x;
    }
    public int getY(){
    return y;
    }
    public int getRecWidth(){
    return recWidth;
    }
     public int getRecHeight(){
    return recHeight;
    }
   public  void displayShape(Graphics2D g2){
   Rectangle box=new Rectangle(x, y,recWidth, recHeight);
   g2.setColor(Color.RED);
   g2.draw(box);
   g2.fill(box);
   }
    
}
