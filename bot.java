import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bot extends stickman
{   int i ;
    int cd = 1;
    /**
     * Act - do whatever the bot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       checkDif();
       i++;
       cd++;
       setImage("st"+(i%4)+".png");
       // lose();
    }    
    public void checkDif(){
    if(Play.dif == 0){
         {
          if(cd == 60){
          move(10);
          cd = 0;
          }
        }
    }
    if(Play.dif == 1){
        {
          if(cd == 30){
          move(10);
          cd = 0;
          }
        }
    }
    if(Play.dif == 2){
        move(1);
      
    }
    if(this.getX() == 533){
         Play.score -= 50000;
        }
    }
    public void lose(){
        if(getX() == 533){
          Greenfoot.stop();  
        }
    }
    
}
