import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld(){    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);
        GameStats.frame = 0;
        GameStats.health = 3;
        GameStats.goobers = 0;
        addObject(new Blade(), 0, 0);
        for(int i = 0; i < 40; i++){
        }
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 10; j++){
                addObject(new Goober(), 60*j + 20, i*40 + 100);
                GameStats.goobers++;
            }
        }
    }
    public void act(){
        
        GameStats.frame++;
        
        if(GameStats.health == 0){
            Greenfoot.setWorld(new GameOver());
        }
        if(GameStats.goobers == 0){
            Greenfoot.setWorld(new LevelTwo());
        }
        showText("Health: " + GameStats.health, 300, 12);
        
 
            
            
        
    }
}
