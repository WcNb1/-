package com.example.xiaoshixun.factory_c;

public class ThreadPoolFactory {
    public static final int NB_1 =0;
    public static final int NB_2 =1;
    public static final int NB_3 =2;

    public static ITheadPool getThreadPool(int type){
        switch (type){
            case NB_1:
                return CustomThreadPool.getCustomThreadPool();
            case NB_2:
                return SingleThreadPool.getSingleThreadPool();
            case NB_3:
                return SchduleThreadPool.getmSchduleThreadPool();
        }
        return null;

    }
}
