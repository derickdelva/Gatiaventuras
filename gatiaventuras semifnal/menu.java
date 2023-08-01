import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class menu extends World
{
    flecha flecha = new flecha();
    private int opcion=0;
    /**
     * Constructor for objects of class menu.
     * 
     */
    public menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        flecha flecha = new flecha();
        addObject(flecha,275,250);
        play play = new play();
        addObject(play,408,212);
        salir salir = new salir();
        addObject(salir,182,211);
        play.setLocation(153,219);
        salir.setLocation(445,191);
        play.setLocation(235,208);
        salir.setLocation(288,287);
        play.setLocation(222,210);
        play.setLocation(298,110);
        salir.setLocation(301,262);
        play.setLocation(285,100);
        salir.setLocation(314,266);
        salir.setLocation(328,272);
        salir.setLocation(283,259);
        salir.setLocation(290,259);
        play.setLocation(409,145);
        flecha.setLocation(380,255);
        salir.setLocation(397,259);
        flecha.setLocation(183,113);
        play.setLocation(328,103);
        play.setLocation(325,105);
        flecha.setLocation(187,97);
        salir.setLocation(336,223);
        play.setLocation(284,105);
        salir.setLocation(313,231);
        flecha.setLocation(169,111);
        play.setLocation(327,109);
        salir.setLocation(321,291);
        play.setLocation(328,128);
        flecha.setLocation(166,101);
        play.setLocation(352,91);
        flecha.setLocation(185,95);
        salir.setLocation(332,253);
        salir.setLocation(306,274);
        salir.setLocation(347,256);
        salir.setLocation(352,256);
    }
    
    public void act(){
        if (Greenfoot.isKeyDown("UP") && opcion!=0) {opcion++;}
        if (Greenfoot.isKeyDown("DOWN") && opcion!=1) {opcion--;}
        
        if (opcion>=2) opcion=0;
        if (opcion<0) opcion=1;
        
        flecha.setLocation(275,270 +(opcion*100));
        
        if (Greenfoot.isKeyDown("SPACE") || Greenfoot.isKeyDown("ENTER")){
            switch(opcion){
                case 0: //jugar
                    Greenfoot.setWorld(new MyWorld());
                    break;
                case 1: //Salir
                    Greenfoot.stop();
                    break;
            }
        }
    }
}
