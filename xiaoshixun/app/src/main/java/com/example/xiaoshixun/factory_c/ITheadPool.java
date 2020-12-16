package com.example.xiaoshixun.factory_c;

import java.util.concurrent.TimeUnit;

public abstract class ITheadPool {
    public void executeTask(Runnable runnable){

    }

    public void executeTimerTask(Runnable runnable, long firstStantTimer,long intervelTime, TimeUnit timeUnit){

    }

    public abstract void removeTask();

    public void removeTask(Runnable runnable){}
}
