class Message{
    String text;
    boolean isEmpty;

    Message(){
        this.isEmpty = false;
    }

    synchronized void write(String value){
        while(!isEmpty){
            try {
                wait();
            } catch (Exception e) {
                System.out.println("Write was interrupted");
            }
        }
        this.text = value;
        this.isEmpty = false;
        System.out.println(value+" written.");
        notify();
    }

    synchronized String read(){
        while(isEmpty){
            try {
                wait();
            } catch (Exception e) {
                System.out.println("Read was interrupted");
            }
        }
        String value = this.text;
        this.text = null;
        this.isEmpty = true;
        notify();
        return value;
    }
}

class Reader extends Thread{
    Message m;

    Reader(Message m){
        this.m = m;
    }

    public void run(){
        while(true){
            System.out.println(m.read());
            try {
                Thread.sleep(1000);    
            } catch (InterruptedException e) {
                System.out.println("Reader interrupted");
            }
        }
    }
}

class Writer extends Thread{
    Message m;

    Writer(Message m){
        this.m = m;
    }

    public void run(){
        int i = 0;
        while(true){
            m.write("Msg No. "+i);
            i++;
            try {
                Thread.sleep(1000);    
            } catch (InterruptedException e) {
                System.out.println("Writer interrupted");
            }
            
        }
    }
}

public class Q_4{
    public static void main(String[]args){
        Message msg = new Message();
        Writer writerThread = new Writer(msg);
        Reader readerThread = new Reader(msg);

        writerThread.start();
        readerThread.start();
    }
}