package com.example.xiaoshixun.factory_c;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadPool extends ITheadPool {
    private static SingleThreadPool mSingleThreadPool;
    private ExecutorService mExecutorService;
    private SingleThreadPool(){
        mExecutorService= Executors.newSingleThreadExecutor();
    }

    public static synchronized SingleThreadPool getSingleThreadPool() {
        if (mSingleThreadPool==null){
            synchronized (SingleThreadPool.class){
                if (mSingleThreadPool==null){
                    mSingleThreadPool=new SingleThreadPool();
                }
            }
        }

        return mSingleThreadPool;
    }

    @Override
    public void executeTask(Runnable runnable) {

        super.executeTask(runnable);
        if (mExecutorService!=null){
            mExecutorService.execute(runnable);
        }
    }

    @Override
    public void removeTask() {
        if (mExecutorService!=null){
            mExecutorService.shutdown();
        }
    }
}
