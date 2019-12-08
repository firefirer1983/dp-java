package com.dp.testsingletonthreadsafe;

import com.dp.testsingletonthreadsafe.SingletonThreadSafe;


class TaskGetTile implements Runnable {
    public void run() {
        SingletonThreadSafe s = SingletonThreadSafe.getInstance();
        System.out.println("instance: " + System.identityHashCode(s));
        System.out.println("tiles: " + s.getTiles(7));
        System.out.println("letter list: " + s.getLetterList());
    }
}