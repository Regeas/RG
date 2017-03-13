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
    int gg;
    boolean g;
    public stickman(){
        g=true;
        n=0;
        gg=5;
        for(int i = 0 ; i<m.length;i++){
            m[i] = new GreenfootImage("st"+(i)+".png");
        }
    }
    public void act() 
    {
        Move();
        anima();
        gg++;
    }    
    public void Move(){
        if(Greenfoot.isKeyDown("a")&&g){
            if(gg>=5){
            setLocation(getX()+2,getY());
        n++;
        g=!g;
        gg=0;
        }
        }
        if(Greenfoot.isKeyDown("d")&&!g){
             if(gg>=5){
            setLocation(getX()+2,getY());
            gg=0;
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
