import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Play here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Play extends World
{   int i;
    int j = 0;
    /**
     * Constructor for objects of class Play.
     * 
     */
    public Play()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        

        prepare();
    }
    public void act(){
       // Timer();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        goal goal = new goal();
        addObject(goal,544,290);
        goal.setLocation(537,284);
        stickman stickman = new stickman();
        addObject(stickman,36,268);
        stickman.setLocation(23,257);
    }
   /* public void Timer(){
        showText("Time : "+ i + (j/60),500,80);
        j++;
     } */
}

