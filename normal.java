import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class normal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class normal extends Actor
{
    /**
     * Act - do whatever the normal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         if(Greenfoot.mouseClicked(this)){ 
             Greenfoot.setWorld(new Play());
             Greenfoot.playSound("click.mp3");
             if(Play.dif != 2){
         Play.dif = 2;}
    }    
    }
}