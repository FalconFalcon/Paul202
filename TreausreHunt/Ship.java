import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class Ship here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ship extends Actor
{
    private Island island;
    private final int SHIP_STEP = 1;
    
    public void act() 
    {
        // Add your action code here.
    }
    
    
    
    public Island getIsland(){
        return this.island;
    }
    
    public void setIsland(Island island){
        this.island = island;
    }
}
