import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class stickman2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class stickman2 extends stickman
{
    int n;
    int cd;
    boolean g;
    static boolean check;

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
        if(Greenfoot.isKeyDown("left")&&g){
            if(cd>=0){
            setLocation(getX()+3,getY());
            n++;
            g=!g;
            cd=0;
        }
        }
        if(Greenfoot.isKeyDown("right")&&!g){
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


