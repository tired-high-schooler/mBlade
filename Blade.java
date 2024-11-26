import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Blade extends Actor
{
    MouseInfo mouse;
    int mouseX;
    int mouseY;
    
    public Blade(){
        int mouseX = 0;
        int mouseY = 0;
        turn(270);
        GreenfootImage image = new GreenfootImage("images/blade.png");
        image.scale(image.getWidth() / 5, image.getHeight() / 5);
        setImage(image);
        
    }
    public void act(){
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(mouse != null){
           mouseX = mouse.getX();
           mouseY = mouse.getY();
        }
        setLocation(mouseX, mouseY);
        System.out.println(PubVars.frame);
      
        
    }
}
