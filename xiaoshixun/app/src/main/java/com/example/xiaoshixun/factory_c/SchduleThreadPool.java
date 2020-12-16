package com.example.xiaoshixun.factory_c;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SchduleThreadPool extends ITheadPool {
    private static SchduleThreadPool mSchduleThreadPool;
    private ScheduledExecutorService mExecutorService;


    @Override
    public void executeTimerTask(Runnable runnable, long firstStantTimer, long intervelTime, TimeUnit timeUnit) {
        mExecutorService.scheduleWithFixedDelay(runnable, firstStantTimer, intervelTime, timeUnit);
    }

    private SchduleThreadPool(){
        mExecutorService= Executors.newSingleThreadScheduledExecutor();
    }

    public synchronized static SchduleThreadPool getmSchduleThreadPool() {
        if (mSchduleThreadPool==null){
            synchronized (SchduleThreadPool.class){
                if (mSchduleThreadPool==null){
                    mSchduleThreadPool=new SchduleThreadPool();
                }
            }
        }
        return mSchduleThreadPool;
    }

    @Override
    public void removeTask() {

    }
}
