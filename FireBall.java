import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class FireBall extends Actor


{
    int rotation;
    long initFrame;

    public FireBall(int playerX, int playerY){
        GreenfootImage image = new GreenfootImage("images/fire_ball.png");
        image.scale(image.getWidth() / 20, image.getHeight() / 20);
        setImage(image);
        turnTowards(playerX, playerY);
        this.rotation = getRotation();
        this.initFrame = GameStats.frame;
        

 
    }

    public void act(){
        
        setRotation(rotation);
        move(3);
        setRotation(90);
        if(GameStats.frame % 2 == 0){
            turn(90);
        }
        else{
            turn(180);
        }
        if(GameStats.frame - initFrame > 10000){
            getWorld().removeObject(this);
        }
        
        

        
        
        
    }
}
