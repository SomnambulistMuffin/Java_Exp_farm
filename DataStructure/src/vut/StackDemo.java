/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut;

import java.util.Stack;

/**
 *
 * @author st
 */
public class StackDemo
{

   
    public static void main(String[] args)
    {
     
        Stack lifo = new Stack();
        //add items to stack
        System.out.println("Origional items stored in stack"); 
        for (int i = 3; i <=13;new Integer(i++))
        { 
          lifo.push(new Integer(i++)*2);
            System.out.println(lifo.peek());     
        }
        System.out.println("after removing lifo");
        //last in first out
        System.out.println("---------------");
        while (!lifo.empty()){
            lifo.pop();
            System.out.println(lifo);
        }
    }
    
}
