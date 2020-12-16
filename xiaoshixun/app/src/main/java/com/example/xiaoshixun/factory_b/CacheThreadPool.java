package com.example.xiaoshixun.factory_b;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class CacheThreadPool implements ThreadPoolinterface {
    private ExecutorService executorService;
    public CacheThreadPool() {
        executorService= Executors.newCachedThreadPool();
    }

    @Override
    public void executeTask(Runnable runnable) {
        if (executorService==null){
            return;
        }
        executorService.execute(runnable);
    }

    @Override
    public void removeTask() {
        if (executorService==null){
            return;
        }
        executorService.shutdown();
    }
}
