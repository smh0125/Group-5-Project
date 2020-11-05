import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public static int score = 0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        super(700, 425, 1); 
        setBackground(new GreenfootImage("level1.png")); 
        addObject(new PlayerCharacter(), 20, 400);
        addObject(new FinishLine(), 285, 325);
        setPaintOrder(enemy.class, PlayerCharacter.class, FinishLine.class);
        addObject(new enemy(), 10, 100);
        addObject(new enemy(), 300, 200);
        addObject(new enemy(), 248, 150);
        addObject(new enemy(), 145, 250);
        score = 0;
        addObject(new Coin(), 50, 200);
        addObject(new Coin(), 605, 100);
        addObject(new Coin(), 420, 220); 
        
        int x = 10;
        for (int i = 0; i <= 3; i++) {
            int y = 350;
            addObject(new Wall(), x, y);
            x = x + 30;
        }
        
        int y2 = 350;
        for (int i = 0; i <= 7; i++) {
            int x2 = 80;
            addObject(new Wall(), x, y2);
            y2 = y2 - 20;
        }
        
        int x2 = 130;
        for (int i = 0; i <= 2; i++) {
            int y = 190;
            addObject(new Wall(), x2, y);
            x2 = x2 + 35;
        }
        
        int y3 = 410;
        for (int i = 0; i <= 7; i++) {
            int x3 = 230;
            addObject(new Wall(), x3, y3);
            y3 = y3 - 20;
        }
        
        int x3 = 230;
        for (int i = 0; i <= 2; i++) {
            int y = 270;
            addObject(new Wall(), x3, y);
            x3 = x3 + 30;
        }
        
        int y4 = 265;
        for (int i = 0; i <= 7; i++) {
            int x4 = 330;
            addObject(new Wall(), x3, y4);
            y4 = y4 - 20;
        }
        
        int x5 = 320;
        for (int i = 0; i <= 7; i++) {
            int y = 105;
            addObject(new Wall(), x5, y);
            x5 = x5 - 30;
        }
        
        int x6 = 130;
        for (int i = 0; i <= 7; i++) {
            int y = 80;
            addObject(new Wall(), x6, y);
            x6 = x6 + 30;
        }
        
        int y5 = 105;
        for (int i = 0; i <= 1; i++) {
            int x7 = 110;
            addObject(new Wall(), x7, y5);
            y5 = y5 - 20;
        }
        
        int y6 = 75; 
        for (int i = 0; i <= 11; i++) {
            int x8 = 350; 
            addObject(new Wall(), x8, y6);
            y6 += 25;
        }
        
        int y7 = 0; 
        for (int i = 0; i <= 11; i++) {
            int x9 = 500; 
            addObject(new Wall(), x9, y7);
            y7 += 25;
        }
        
        int x10 = 500; 
        for (int i = 0; i <= 3; i++) {
            int y8 = 275; 
            addObject(new Wall(), x10, y8);
            x10 += 25;
        }
        
        int x11 = 350; 
        for (int i = 0; i <= 3; i++) {
            int y9 = 350; 
            addObject(new Wall(), x11, y9);
            x11 += 25;
        }
        
        
}
    public void act() {
     showText("Score: " + score, 50, 25);   
        
    }
 
}
