import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Blade extends Actor
{
    MouseInfo mouse;
    int mouseX;
    int mouseY;
    boolean vuln;
    int iframes;
    
    public Blade(){
        int mouseX = 0;
        int mouseY = 0;
        int iframes = 0;
        boolean vuln = true;    
        turn(270);
        GreenfootImage image = new GreenfootImage("images/blade.png");
        image.scale(image.getWidth() / 15, image.getHeight() / 15);
        setImage(image);
        
    }
    public void act(){
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(mouse != null){
           mouseX = mouse.getX();
           mouseY = mouse.getY();
        }
        if(iframes != 0){
            iframes--;
        }
        else if(isTouching(FireBall.class)){
            GameStats.health--;
            iframes = 60;
            System.out.println(GameStats.health);

        }

        setLocation(mouseX, mouseY);
        
      
        
    }
}
