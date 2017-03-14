import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Play here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Play extends World
{
    static int time;
    static int dif;
    static int score = 300000;
    /**
     * Constructor for objects of class Play.
     * 
     */
    public Play()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(new Timer(),550,50);
        time=0;
        prepare();
    }
    public void act(){
        if(stickman.check!=true){
        Timer.time++;
    }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(new stickman(),23,267);
        addObject(new bot(),23, 200);
        addObject(new re(),480,370);
        addObject(new main(),540,370);
    }
}


