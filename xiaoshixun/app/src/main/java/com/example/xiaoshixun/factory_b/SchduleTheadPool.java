package com.example.xiaoshixun.factory_b;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SchduleTheadPool implements ThreadPoolinterface {
    private ScheduledExecutorService scheduledExecutorService;

    public SchduleTheadPool() {
        scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
    }

    @Override
    public void executeTask(Runnable runnable) {
        if (scheduledExecutorService!=null){
            scheduledExecutorService.schedule(runnable,2, TimeUnit.SECONDS);
        }
    }

    @Override
    public void removeTask() {
        if (scheduledExecutorService!=null){
            scheduledExecutorService.shutdown();
        }
    }
}
