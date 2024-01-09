public class DaemonThreads extends Thread {
    public DaemonThreads(String name){
        super(name);
    }
    public void run() {
        // Checking whether the thread is Daemon or not
        if(Thread.currentThread().isDaemon()) {
            System.out.println(getName() + " is Daemon thread");
        }
        else {
            System.out.println(getName() + " is User thread");
        }
    }
    public static void main(String[] args) {
        DaemonThreads t1 = new DaemonThreads("t1");
        DaemonThreads t2 = new DaemonThreads("t2");
        DaemonThreads t3 = new DaemonThreads("t3");
        // Setting user thread t1 to Daemon
        t1.setDaemon(true);
        // starting first 2 threads
        t1.start();
        t2.start();
        // Setting user thread t3 to Daemon
        t3.setDaemon(true);
        t3.start();
    }
}
