import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FinishLine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FinishLine extends Actor
{
    public FinishLine() {
        GreenfootImage finish = getImage();
        int newWidth = finish.getWidth()/4; 
        int newHeight = finish.getHeight()/4;
        finish.scale(newWidth, newHeight);
    }
    
    /**
     * Act - do whatever the FinishLine wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
