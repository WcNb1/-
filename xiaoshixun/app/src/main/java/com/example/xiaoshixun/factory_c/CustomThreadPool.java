package com.example.xiaoshixun.factory_c;

import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class CustomThreadPool extends ITheadPool {
    private static CustomThreadPool mCustomThreadPool;
    private ThreadPoolExecutor mExecutor;

    private CustomThreadPool() {
        mExecutor = new ThreadPoolExecutor(5,30,30,
                TimeUnit.SECONDS,new LinkedBlockingQueue<Runnable>(), Executors.defaultThreadFactory());
    }

    public synchronized static CustomThreadPool getCustomThreadPool() {
        if (mCustomThreadPool==null){
            synchronized (CustomThreadPool.class){
                if (mCustomThreadPool==null){
                    mCustomThreadPool=new CustomThreadPool();
                }
            }
        }
        return mCustomThreadPool;
    }

    @Override
    public void executeTask(Runnable runnable) {
        if (mExecutor!=null){
            mExecutor.execute(runnable);
        }
        super.executeTask(runnable);
    }

    @Override
    public void removeTask() {

    }

    @Override
    public void removeTask(Runnable runnable) {
        if (mExecutor!=null)
            mExecutor.remove(runnable);
        super.removeTask(runnable);
    }
}
