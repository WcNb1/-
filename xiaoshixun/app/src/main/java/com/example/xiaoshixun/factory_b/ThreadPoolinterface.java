package com.example.xiaoshixun.factory_b;

public interface ThreadPoolinterface {
    void executeTask(Runnable runnable);

    void removeTask();
}
