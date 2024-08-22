/*
 * Copyright 2023 Sophos Limited. All rights reserved.
 *
 * 'Sophos' and 'Sophos Anti-Virus' are registered trademarks of Sophos Limited and Sophos Group. All other product
 * and company names mentioned are trademarks or registered trademarks of their respective owners.
 */

package leetCodeSolutions;

class CheckThread extends Thread
{
    public void run(){
        for (int i=0; i<10; i++){
            sleep(1)
            println("value in child Thread is ::: " + i)
        }
    }
}

class RunnableThread implements Runnable
{
    public void run(){
        for (int i=0; i<10; i++){
            println("value in child Thread is ::: " + i)
            Thread.sleep(10)
            Thread.yield()
        }
    }
}

class ThreadDemo
{
    public static void main(String[] args){
        CheckThread ct = new CheckThread()
        ct.start()
        for (int j=0; j<10; j++){
            sleep(1)
            println("value in Main Thread is ::: " + j)
        }
    }
}


class MyRunnable
{
    public static void main(String[] args){
        RunnableThread rt = new RunnableThread()
        Thread t = new Thread(rt)
        t.start()
        //t.join(1)
        for (int j=0; j<100; j++){
            println("value in Main Thread is ::: " + j)
        }
    }
}
