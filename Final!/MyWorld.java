import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name)  
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
public static int coleccionar = 0; //contar
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
        
    }
    public void act()
    { 
     showText("Pecesitos: " + coleccionar, 430,8); 
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        WallHeightBig wallHeightBig = new WallHeightBig();
        addObject(wallHeightBig,244,540);
        wallHeightBig.setLocation(198,322);
        wallHeightBig.setLocation(796,268);
        WallHeightSmall wallHeightSmall = new WallHeightSmall();
        addObject(wallHeightSmall,243,534);
        WallHeightSmall wallHeightSmall2 = new WallHeightSmall();
        addObject(wallHeightSmall2,687,200);
        WallHeightSmall wallHeightSmall3 = new WallHeightSmall();
        addObject(wallHeightSmall3,641,235);
        WallHeightSmall wallHeightSmall4 = new WallHeightSmall();
        addObject(wallHeightSmall4,584,304);
        WallHeightSmall wallHeightSmall5 = new WallHeightSmall();
        addObject(wallHeightSmall5,656,316);
        wallHeightSmall4.setLocation(268,175);
        wallHeightSmall3.setLocation(258,229);
        wallHeightSmall.setLocation(403,247);
        wallHeightSmall5.setLocation(410,329);
        wallHeightSmall2.setLocation(642,146);
        WallHeightSmall wallHeightSmall6 = new WallHeightSmall();
        addObject(wallHeightSmall6,648,307);
        WallHeightSmall wallHeightSmall7 = new WallHeightSmall();
        addObject(wallHeightSmall7,589,291);
        WallHeightMedium wallHeightMedium = new WallHeightMedium();
        addObject(wallHeightMedium,505,265);
        wallHeightSmall3.setLocation(91,389);
        wallHeightSmall3.setLocation(323,470);
        wallHeightMedium.setLocation(256,168);
        WallHeightMedium wallHeightMedium2 = new WallHeightMedium();
        addObject(wallHeightMedium2,561,377);
        wallHeightSmall5.setLocation(476,552);
        wallHeightSmall.setLocation(238,579);
        wallHeightMedium2.setLocation(412,324);
        WallHeightMedium wallHeightMedium3 = new WallHeightMedium();
        addObject(wallHeightMedium3,590,218);
        wallHeightMedium3.setLocation(614,194);
        wallHeightSmall2.setLocation(552,263);
        wallHeightSmall6.setLocation(171,224);
        wallHeightMedium3.setLocation(643,152);
        WallHeightMedium wallHeightMedium4 = new WallHeightMedium();
        addObject(wallHeightMedium4,57,324);
        wallHeightMedium4.setLocation(6,309);
        WallHeightMedium wallHeightMedium5 = new WallHeightMedium();
        addObject(wallHeightMedium5,98,480);
        wallHeightMedium5.setLocation(6,502);
        WallWidthBig wallWidthBig = new WallWidthBig();
        addObject(wallWidthBig,488,348);
        wallWidthBig.setLocation(439,9);
        WallWidthSmall wallWidthSmall = new WallWidthSmall();
        addObject(wallWidthSmall,52,592);
        WallWidthSmall wallWidthSmall2 = new WallWidthSmall();
        addObject(wallWidthSmall2,55,192);
        wallWidthSmall2.setLocation(678,301);
        wallWidthSmall.setLocation(783,202);
        WallWidthSmall wallWidthSmall3 = new WallWidthSmall();
        addObject(wallWidthSmall3,645,98);
        wallWidthSmall3.setLocation(532,292);
        WallWidthSmall wallWidthSmall4 = new WallWidthSmall();
        addObject(wallWidthSmall4,585,386);
        wallWidthSmall4.setLocation(145,254);
        wallWidthSmall4.setLocation(34,0);
        wallHeightSmall7.setLocation(27,110);
        wallHeightSmall7.setLocation(12,81);
        WallWidthMedium wallWidthMedium = new WallWidthMedium();
        addObject(wallWidthMedium,448,204);
        wallWidthMedium.setLocation(448,204);
        WallWidthMedium wallWidthMedium2 = new WallWidthMedium();
        addObject(wallWidthMedium2,611,431);
        wallWidthMedium2.setLocation(200,396);
        wallWidthMedium2.setLocation(196,401);
        WallWidthMedium wallWidthMedium3 = new WallWidthMedium();
        addObject(wallWidthMedium3,448,205);
        wallWidthMedium3.setLocation(480,204);
        WallWidthSmall wallWidthSmall5 = new WallWidthSmall();
        addObject(wallWidthSmall5,475,382);
        wallWidthSmall5.setLocation(208,498);
        WallWidthSmall wallWidthSmall6 = new WallWidthSmall();
        addObject(wallWidthSmall6,312,364);
        wallWidthSmall6.setLocation(678,374);
        WallHeightMedium wallHeightMedium6 = new WallHeightMedium();
        addObject(wallHeightMedium6,593,429);
        wallHeightMedium6.setLocation(709,490);
        wallWidthSmall6.setLocation(775,594);
        WallWidthSmall wallWidthSmall7 = new WallWidthSmall();
        addObject(wallWidthSmall7,607,372);
        wallWidthSmall7.setLocation(622,384);
        removeObject(wallWidthSmall7);
        WallHeightSmall wallHeightSmall8 = new WallHeightSmall();
        addObject(wallHeightSmall8,545,372);
        wallHeightSmall8.setLocation(624,401);
        removeObject(wallHeightSmall8);
        WallWidthMedium wallWidthMedium4 = new WallWidthMedium();
        addObject(wallWidthMedium4,654,491);
        wallWidthSmall6.setLocation(635,363);
        wallWidthMedium4.setLocation(682,592);
        WallHeightSmall wallHeightSmall822 = new WallHeightSmall();
        addObject(wallHeightSmall822,794,550);
        wallHeightSmall8.setLocation(793,540);
        WallWidthMedium wallWidthMedium5 = new WallWidthMedium();
        addObject(wallWidthMedium5,543,364);
        wallWidthMedium5.setLocation(102,203);
        wallWidthMedium5.setLocation(82,204);
        WallWidthMedium wallWidthMedium6 = new WallWidthMedium();
        addObject(wallWidthMedium6,523,368);
        wallWidthMedium6.setLocation(643,104);
        WallWidthMedium wallWidthMedium7 = new WallWidthMedium();
        addObject(wallWidthMedium7,525,184);
        wallWidthMedium7.setLocation(408,107);
        WallWidthMedium wallWidthMedium8 = new WallWidthMedium();
        addObject(wallWidthMedium8,295,221);
        wallWidthMedium8.setLocation(208,107);
        WallWidthSmall wallWidthSmall744 = new WallWidthSmall();
        addObject(wallWidthSmall744,203,298);
        wallWidthSmall7.setLocation(220,299);
        wallWidthSmall6.setLocation(304,297);
        WallWidthMedium wallWidthMedium9 = new WallWidthMedium();
        addObject(wallWidthMedium9,628,406);
        wallWidthMedium9.setLocation(413,400);
        WallWidthMedium wallWidthMedium10 = new WallWidthMedium();
        addObject(wallWidthMedium10,608,434);
        wallWidthMedium10.setLocation(617,399);
        WallWidthMedium wallWidthMedium11 = new WallWidthMedium();
        addObject(wallWidthMedium11,565,443);
        wallWidthMedium11.setLocation(349,599);
        WallWidthMedium wallWidthMedium12 = new WallWidthMedium();
        addObject(wallWidthMedium12,379,541);
        wallWidthMedium12.setLocation(183,588);
        WallWidthSmall wallWidthSmall8 = new WallWidthSmall();
        addObject(wallWidthSmall8,202,451);
        wallWidthSmall8.setLocation(48,591);
        wallHeightSmall3.setLocation(318,481);
        wallWidthMedium12.setLocation(246,590);
        wallWidthMedium12.setLocation(246,590);
        wallWidthMedium12.setLocation(200,573);
        wallWidthMedium12.setLocation(230,594);
        wallWidthSmall5.setLocation(194,499);
        wallHeightSmall.setLocation(243,504);
        wallWidthSmall5.setLocation(210,498);
        wallWidthMedium9.setLocation(324,407);
        wallHeightSmall3.setLocation(323,415);
        wallHeightMedium2.setLocation(409,337);
        wallWidthMedium3.setLocation(488,205);
        wallWidthSmall3.setLocation(518,295);
        wallWidthSmall8.setLocation(310,340);
        wallHeightMedium.setLocation(224,274);
        wallHeightSmall4.setLocation(327,191);
        wallHeightMedium.setLocation(261,202);
        wallWidthSmall6.setLocation(270,299);
        wallWidthSmall8.setLocation(179,303);
        wallHeightSmall6.setLocation(178,272);
        wallHeightSmall4.setLocation(91,378);
        wallHeightMedium3.setLocation(639,260);
        wallWidthMedium6.setLocation(684,111);
        wallHeightSmall7.setLocation(4,58);
        wallWidthSmall4.setLocation(43,10);
        wallHeightSmall.setLocation(244,540);
        wallWidthMedium10.setLocation(533,399);
        wallWidthSmall3.setLocation(536,303);
        wallHeightSmall2.setLocation(547,252);
        wallWidthSmall.setLocation(750,205);

        wallHeightSmall.setLocation(244,540);
        wallWidthSmall5.setLocation(217,499);
        wallHeightSmall4.setLocation(96,344);
        wallHeightSmall6.setLocation(180,226);
        wallHeightMedium.setLocation(246,304);
        wallWidthMedium3.setLocation(392,205);
        wallHeightMedium2.setLocation(402,246);
        wallWidthMedium9.setLocation(439,396);
        wallWidthMedium9.setLocation(555,398);
        wallHeightSmall3.setLocation(324,464);
        wallWidthMedium.setLocation(451,491);
        wallWidthMedium11.setLocation(379,593);
        wallWidthMedium12.setLocation(187,590);
        wallWidthMedium6.setLocation(571,106);
        wallHeightMedium3.setLocation(640,135);
        WallWidthSmall wallWidthSmall10 = new WallWidthSmall();
        addObject(wallWidthSmall10,231,476);
        wallWidthSmall10.setLocation(61,587);
        wallHeightSmall.setLocation(243,547);
        wallWidthSmall5.setLocation(190,495);
        wallHeightSmall.setLocation(240,540);
        wallWidthMedium.setLocation(531,496);
        wallWidthMedium2.setLocation(193,400);
        wallWidthMedium9.setLocation(391,396);
        wallWidthMedium9.setLocation(609,394);
        wallWidthSmall8.setLocation(545,356);
        wallHeightMedium2.setLocation(404,304);
        wallWidthSmall3.setLocation(517,296);
        wallWidthSmall8.setLocation(506,380);
        wallWidthMedium3.setLocation(448,204);
        wallHeightMedium.setLocation(261,201);
        wallHeightSmall6.setLocation(167,249);
        wallWidthMedium10.setLocation(400,402);
        wallHeightMedium3.setLocation(636,293);
        wallWidthSmall8.setLocation(694,105);
        Cat cat = new Cat();
        addObject(cat,534,186);
        cat.setLocation(43,150);
        wallHeightSmall.setLocation(230,529);
        wallHeightSmall.setLocation(240,542);
        WallHeightSmall wallHeightSmall10 = new WallHeightSmall();
        addObject(wallHeightSmall10,641,161);
        wallHeightSmall10.setLocation(638,154);
        wallHeightMedium3.setLocation(649,339);
        wallHeightMedium3.setLocation(636,339);
        wallHeightSmall10.setLocation(666,222);
        removeObject(wallHeightSmall10);
        wallHeightMedium3.setLocation(639,203);

        wallWidthSmall8.setLocation(719,102);
        removeObject(wallWidthSmall8);
        Fish fish = new Fish();
        addObject(fish,666,223);
        fish.setLocation(683,234);
        fish.setLocation(495,252);
        Fish fish2 = new Fish();
        addObject(fish2,295,437);
        fish2.setLocation(182,542);
        
        Salida salida = new Salida();
        addObject(salida,522,554);
        salida.setLocation(555,565);
        Greenfoot.stop();
    }
}
