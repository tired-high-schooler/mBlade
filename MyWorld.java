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
        GameStats.health = 10;
        addObject(new Blade(), 0, 0);
        Goober[] goobers = new Goober[40];
        for(int i = 0; i < 40; i++){
            goobers[i] = new Goober();
        }
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 5; j++){
                addObject(goobers[10*i + j], 60*j + 20, i*40 + 100);
            }
        }
    }
    public void act(){
        
        GameStats.frame++;
        showText(GameStats.frame + "", 100, 100);
        
 
            
            
        
    }
}
