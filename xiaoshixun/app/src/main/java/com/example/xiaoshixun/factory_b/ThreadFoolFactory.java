package com.example.xiaoshixun.factory_b;

public class ThreadFoolFactory  {

    public static ThreadPoolinterface getExcutor(int type) {
        switch (type) {
            case 0:
                return new CacheThreadPool();
            case 1:
                return new FixedThreadPool();
            case 2:
                return new SingleThreadPool();
            case 3:
                return new SchduleTheadPool();
        }
        return null;
    }
}
