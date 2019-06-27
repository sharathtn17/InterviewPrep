package testProject.test;

public class Curiser implements Runnable {
    
    public void run() {
        System.out.print("go");
    }
    
    public static void main(String arg[]) {
        Thread t = new Thread(new Curiser());
        t.run();
        t.run();
        t.start();
    }
}