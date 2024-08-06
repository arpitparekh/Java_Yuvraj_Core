package multi_threading;

public class MyMultiThreading {

    public static void main(String[] args) {

        // multi threading
        // extending a Thread class
        // implements Runnable intreface
        ThreadOne t1 = new ThreadOne();
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ThreadTwo t2 = new ThreadTwo();
        Thread th = new Thread(t2);
        th.start();

        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println(Thread.currentThread().getName() + i);
        }

        new Thread(){
            @Override
            public void run() {

            }
            
        }.start();

    }

}

class ThreadOne extends Thread {



    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            System.out.println(Thread.currentThread().getName() + i);
        }

    }

}

class ThreadTwo implements Runnable {

    @Override
    public void run() {
        
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            System.out.println(Thread.currentThread().getName() + i);
        }

    }
    
}
