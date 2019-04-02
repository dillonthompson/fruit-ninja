import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpaceWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpaceWorld extends ScrollingWorld
{

    /**
     * Constructor for objects of class SpacWorld.
     * 
     */
    public SpaceWorld()
    {
        super(600, 600, 1, true);
    }

    public void act() {
        scroll();
    }
}
