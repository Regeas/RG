import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class stickman here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class stickman extends Actor
{
    /**
     * Act - do whatever the stickman wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage m[] = new GreenfootImage[4];
    int n;
    int cd;
    boolean g;
    static boolean check;
    public stickman(){
        g=true;
        n=0;
        check = false;
        cd=0;
        for(int i = 0 ; i<m.length;i++){
            m[i] = new GreenfootImage("st"+(i)+".png");
        }
    }
    public void act() 
    {
        Move();
        anima();
        cd++;
        
        if(getX() == 533){
         getWorld().addObject(new board(),300,200);
         check = true;
         Greenfoot.playSound("win.wav");
        }
    }    
    public void Move(){
        if(Greenfoot.isKeyDown("a")&& g &&!Greenfoot.isKeyDown("d")){
            if(cd>=0){
            setLocation(getX()+3,getY());
            n++;
            g=!g;
            cd=0;
        }
        }
        if(Greenfoot.isKeyDown("d")&& !g && !Greenfoot.isKeyDown("a")){
             if(cd>=0){
            setLocation(getX()+3,getY());
            cd=0;
            g=!g;
            n++;
        }
        }
    }
    public void anima(){
        n=n%m.length;
        setImage(m[n]);
    }
}
