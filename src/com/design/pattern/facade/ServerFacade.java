package com.design.pattern.facade;

public class ServerFacade {

    private final ScheduleServer scheduleServer;
    public ServerFacade(ScheduleServer scheduleServer) {
        this.scheduleServer = scheduleServer;
    }
    public void startServer(){
        System.out.println("Starting server");
        scheduleServer.startBooting();
        scheduleServer.readSystemConfigFile();
        scheduleServer.init();
        scheduleServer.initializeContext();
        scheduleServer.initializeListeners();
        scheduleServer.createSystemObjects();
    }
    public void stopServer(){
        System.out.println("Shutting off server");
        scheduleServer.releaseProcesses();
        scheduleServer.destory();
        scheduleServer.destroySystemObjects();
        scheduleServer.destoryListeners();
        scheduleServer.destoryContext();
        scheduleServer.shutdown();
    }

}
