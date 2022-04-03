package com.fafa.newdesignpattern.facade;


/**
 * 客户端
 *
 * @author Sire
 * @version 1.0
 * @date 2022-04-03 22:39
 */
public class Client {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();

        homeTheaterFacade.ready();

        homeTheaterFacade.play();
        homeTheaterFacade.pause();
        homeTheaterFacade.end();

        //……
    }
}
