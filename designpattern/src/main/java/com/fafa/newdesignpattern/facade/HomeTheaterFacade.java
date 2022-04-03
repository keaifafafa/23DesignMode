package com.fafa.newdesignpattern.facade;

/**
 * @author Sire
 * @version 1.0
 * @date 2022-04-03 22:41
 */
public class HomeTheaterFacade {
    /**
     * 定义各个子系统
     */
    private TheaterLight theaterLight;
    private Popcorn popcorn;
    private Stereo stereo;
    private Projector projector;
    private Screen screen;
    private DVDPlayer dvdPlayer;

    /**
     * 构造器
     * 注意调用的是静态的方法【单例模式，可以节约内存，避免重复创建对象】
     */
    public HomeTheaterFacade() {
        super();
        this.theaterLight = TheaterLight.getInstance();
        this.popcorn = Popcorn.getInstance();
        this.stereo = Stereo.getInstance();
        this.projector = Projector.getInstance();
        this.screen = Screen.getInstance();
        this.dvdPlayer = DVDPlayer.getInstance();
    }

    /**
     * 准备阶段
     * 注意是分为四步
     */
    public void ready() {
        System.out.println("==========准备阶段===========");
        popcorn.on();
        popcorn.pop();
        screen.down();
        projector.on();
        stereo.on();
        dvdPlayer.on();
        theaterLight.dim();
    }

    public void play() {
        System.out.println("==========娱乐阶段===========");
        dvdPlayer.play();
    }

    public void pause() {
        System.out.println("==========暂停阶段===========");
        dvdPlayer.pause();
    }

    public void end() {
        System.out.println("==========结束阶段===========");
        popcorn.off();
        theaterLight.bright();
        screen.up();
        projector.off();
        stereo.up();
        dvdPlayer.off();
    }


}
