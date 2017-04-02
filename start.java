import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class start extends Actor
{
    /**
     * Act - do whatever the start wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    VersusMode st1 = new VersusMode();
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)) isClicked(); 
    }
    public void isClicked(){
        getWorld().addObject(new easy(),100,210);
        getWorld().addObject(new normal(),300,210);
        getWorld().addObject(new hard(),500,210);
        getWorld().addObject(new VersusMode(),298,324);
        Greenfoot.playSound("click.mp3");
        getWorld().removeObject(this);
    }
}
