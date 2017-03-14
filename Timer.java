import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
 
/**
 * Write a description of class Counter1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Timer extends Actor
{
    static int time;
    /**
     * Act - do whatever the Counter1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Timer(){
        time = 0;
    }
    public void act() 
    {
        setImage(new GreenfootImage("Time : " + (time/60), 24, Color.BLACK, Color.WHITE));
    }    
}