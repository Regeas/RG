import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VersusMode here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VersusMode extends Actor
{
    /**
     * Act - do whatever the VersusMode wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){ 
            Greenfoot.setWorld(new Play());
               if(Play.dif != 4){
         Play.dif = 4;}
             Greenfoot.playSound("click.mp3");
    }    
    }    
}
