package com.design.pattern.facade;

public class Main {
    public static void main(String[] args) {

        // Regular Way without Facade
        ScheduleServer scheduleServer = new ScheduleServer();

        //Server Init and Start
        scheduleServer.startBooting();
        scheduleServer.readSystemConfigFile();
        scheduleServer.init();
        scheduleServer.initializeContext();
        scheduleServer.initializeListeners();
        scheduleServer.createSystemObjects();

        System.out.println("Sever Started");

        // Server Shutdown
        scheduleServer.releaseProcesses();
        scheduleServer.destory();
        scheduleServer.destroySystemObjects();
        scheduleServer.destoryListeners();
        scheduleServer.destoryContext();
        scheduleServer.shutdown();
        System.out.println("Sever Stop");
        System.out.println();
        System.out.println();

        // With Facade
        ServerFacade facade = new ServerFacade(scheduleServer);
        System.out.println("#########");
        facade.startServer();
        System.out.println("#########");
        facade.stopServer();
        System.out.println("#########");

    }
}
