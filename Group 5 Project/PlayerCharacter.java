import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayerCharacter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerCharacter extends Actor
{
    /**
     * Act - do whatever the PlayerCharacter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    MyWorld thisGame;
    public void act() 
    {
      keyInput(); 
      atFinishLine();
      touchingEnemy();
      grabCoin();
    } 
    
    public void grabCoin(){
     Actor coin = getOneIntersectingObject(Coin.class);
     if(coin != null) {
         getWorld().removeObject(coin);
         thisGame.score++;
        }
    }
    
    public PlayerCharacter() {
        GreenfootImage man = new GreenfootImage("man01.png");
        setRotation(0);
        setImage(man);
    }
    
    public void touchingEnemy() {
        if (isTouching(enemy.class)) {
            Greenfoot.stop(); 
            World gameOver = new GameOverScreen(); 
            Greenfoot.setWorld(gameOver);
        }
    }
    
    public void atFinishLine() {
        if (isTouching(FinishLine.class)) {
            if (thisGame.score == 3) {   
             Greenfoot.stop();
             World winScreen = new WinScreen(); 
             Greenfoot.setWorld(winScreen);
        }
      }
    }
   
    public void keyInput() {
        checkLeft();
        checkRight();
        checkUp();
        checkDown(); 
    }
    
    public void checkLeft() {
        if (Greenfoot.isKeyDown("left")) {
            if (getOneObjectAtOffset(5, 0, Wall.class) == null) {
            setRotation(0);
            move(-5);
        }
    }
    }
    
    public void checkRight() {
        if (Greenfoot.isKeyDown("right")) {
            if (getOneObjectAtOffset(5, 0, Wall.class) == null) {
            setRotation(0);
            move(5);
        }
    }
    }
    
    public void checkUp() {
        if (Greenfoot.isKeyDown("up")) {
            if (getOneObjectAtOffset(5, 0, Wall.class) == null) {
            setRotation(270);
            move(5);
            setRotation(0);
        }
    }
    }
    
    public void checkDown() {
        if (Greenfoot.isKeyDown("down")) {
            if (getOneObjectAtOffset(5, 0, Wall.class) == null) {
            setRotation(90);
            move(5);
            setRotation(0);
        }
    }
    }
}
