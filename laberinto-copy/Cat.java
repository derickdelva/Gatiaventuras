import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cat extends Actor
{
    /**
     * Act - do whatever the Cat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Cat()
    {
        getImage().scale(getImage().getWidth() / 6 , getImage().getHeight() / 6 );
    }
    public void act()
    {
        moveAround();
        eat();
    }
    public void moveAround()
    {
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation(getX() + 3, getY());
            if (hitWall()==true)
            {
              setLocation(getX() - 3, getY());  
            }
        }
        if (Greenfoot.isKeyDown("left"))
        {
            setLocation(getX() - 3, getY());
            if (hitWall()==true)
            {
              setLocation(getX() + 3, getY());  
            }
            
        }
        if (Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY() - 3);
            if (hitWall()==true)
            {
              setLocation(getX(), getY() + 3); 
            }
            
        }
        if (Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY() + 3);
            if (hitWall()==true)
            {
              setLocation(getX(), getY() - 3); 
            }
            
        }
    }
    public boolean hitWall()
    {
        if (isTouching(Walls.class))
        {
            return true;
        }
        else
        return false;
    }
    public void eat() {
    if (getOneIntersectingObject(Fish.class) != null) {
        getWorld().removeObject(getOneIntersectingObject(Fish.class));
        Yum yum = new Yum();
        getWorld().addObject(yum, 375, 375);
        Greenfoot.delay(20);
        getWorld().removeObject(yum);
    }
}
    
}
