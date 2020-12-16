package com.example.xiaoshixun.sginle;

public class Theadpoolmanager {

    private static Theadpoolmanager threadPoolExecutor;

    /*private Theadpoolmanager(){
        threadPoolExecutor =
                new ThreadPoolExecutor(5, 20, 30, TimeUnit.SECONDS,
                new LinkedBlockingDeque<Runnable>(), Executors.defaultThreadFactory());

    }*/

    public static Theadpoolmanager getThreadPoolExecutor() {
        if (threadPoolExecutor == null) {
            synchronized (Theadpoolmanager.class) {
                if (threadPoolExecutor == null) {
                    threadPoolExecutor = new Theadpoolmanager();
                }
            }
        }

        return threadPoolExecutor;
    }

}
