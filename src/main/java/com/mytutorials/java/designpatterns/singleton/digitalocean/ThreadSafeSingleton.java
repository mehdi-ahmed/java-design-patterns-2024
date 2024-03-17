package com.mytutorials.java.designpatterns.singleton.digitalocean;

public class ThreadSafeSingleton {

    public static volatile ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
    }

    public static synchronized ThreadSafeSingleton getInstance() {

        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }

    public static ThreadSafeSingleton getInstanceUsingDoubleLocking() {
        // If an instance was already created, don't do anything - avoid locking threads
        // outer if is used to prevent redundant locks
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {

                //  inner if is used to let a concurrent thread know whether another has already created the object or not.

                // The first thread that has acquired the lock checks and sees that there is no such object
                // and creates it. It releases the lock and the second one can do the same -
                // it has to check if the object exists because the first one may have created it.
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
}
