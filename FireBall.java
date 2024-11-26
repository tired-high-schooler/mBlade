import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class FireBall extends Actor
{
    public FireBall(){
        GreenfootImage image = new GreenfootImage("images/fire_ball.png");
        image.scale(image.getWidth() / 5, image.getHeight() / 5);
        setImage(image);
    }

    public void act(){
        if(PubVars.frame % 2 == 0){
            turn(90);
        }
        
    }
}
