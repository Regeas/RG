import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bot extends stickman
{   int i;
    int cd = 1;
    private boolean lose;
    public static boolean check2;
    /**
     * Act - do whatever the bot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       if(Play.dif!=4){
       checkDif();
       if(lose == false && getX() != 533){
           if(cd == 1){
           i = i+1;
       setImage("st"+(i%4)+".png");}
    }
       cd++;
       losing();
       
    }
}
  public void checkDif(){
   if(Play.dif!=4){
    if(lose == false && getX() != 533){
        if(Play.dif == 1){
         {
          if(cd == 60){
          move(10);
          cd = 0;
          }
        }
    }
    else if(Play.dif == 2){
        {
          if(cd == 30){
          move(10);
          cd = 0;
          }
        }
    }
    else if(Play.dif == 3){
        {
          if(cd == 10){
          move(5);
          cd = 0;
          }
        }     
    }else if(Play.dif == 4){
    }
}
    }}
    
    
    public void losing(){
    
    {
        if(this.getX() == 533){
            if(getWorld().getObjects(board.class).isEmpty()){
            getWorld().addObject(new board(), 300, 200);
            lose = true;
            check2 = true;
        }
    }
}
}
    }
    

