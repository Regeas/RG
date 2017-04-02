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
        
        
    }

   
    public void act(){
        checkDif();
        if(stickman.check!=true && bot.check2!=true){
        Timer.time++;
    }
    }
    public void checkDif(){
    if(Play.dif == 4){
         prepare2();
    }
    else{
        prepare();
    }
    }

    public void prepare()
    {if(getObjects(stickman.class).isEmpty()){
        addObject(new stickman(),23,267);
        addObject(new bot(),23, 200);
        addObject(new re(),480,370);
        addObject(new main(),540,370);
    }}
    
    public void prepare2()
    {
       if(getObjects(stickman.class).isEmpty()){
        addObject(new stickman(),23,267);
        addObject(new stickman2(),23, 200);
        addObject(new re(),480,370);
        addObject(new main(),540,370);
    }  
}
}

