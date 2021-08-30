class fetchData extends Thread {
    public void run() {
        try {
            System.out.println("fetchData started.");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("fetchData executed.");
    }
    public static void main(String args[]) {
        fetchData fd = new fetchData();
        fd.start();
    }
}

class processData implements Runnable {
    public void run() {
        try {
            System.out.println("processData started.");
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println(e);

        }
        System.out.println("processData executed.");
    }
    public static void main(String args[]) {
        processData pd = new processData();
        Thread th1 = new Thread(pd);
        th1.start();
    }
}

public class Q_3{
    public static void main(String args[]) {
        fetchData fd = new fetchData();
        processData pd = new processData();
        Thread th2 = new Thread(pd);
        th2.setPriority(Thread.MIN_PRIORITY);
        fd.setPriority(Thread.MAX_PRIORITY);
        try {
            fd.start();
            fd.join();
            th2.start();
        } catch(InterruptedException e) {
             System.out.println(e);    
        }

    }
}