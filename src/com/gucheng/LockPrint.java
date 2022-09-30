package com.gucheng;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockPrint {
    static volatile boolean isArray1Print = true;
    public static void main(String[] args)  {
        char[] array1 = {'1','2','3','4','5'};
        char[] array2 = {'a','b','c','d','e'};
        Lock lock = new ReentrantLock();
        Object a = new Object();
        Object b = new Object();


        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<array1.length;) {
                    if (isArray1Print) {
                        lock.lock();
                        try {
                            System.out.print(array1[i]);
                            isArray1Print = false;
                            i++;
                        } finally {
                            lock.unlock();
                        }

                    }


                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<array2.length;) {
                    if (!isArray1Print) {
                        lock.lock();
                        try {
                            System.out.print(array2[i]);
                            isArray1Print = true;
                            i++;
                        } finally {
                            lock.unlock();
                        }

                    }

                }
            }
        }).start();

    }
}
