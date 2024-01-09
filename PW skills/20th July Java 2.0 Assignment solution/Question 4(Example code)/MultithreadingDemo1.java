class MultithreadingDemo1 extends Thread  {
    public void run() {
        System.out.println("My thread is in running state.");
    }
    public static void main(String args[]) {
        MultithreadingDemo1 obj=new MultithreadingDemo1();
            obj.start();
    }
}
