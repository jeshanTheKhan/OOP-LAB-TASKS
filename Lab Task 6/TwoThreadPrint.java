class MyThread extends Thread {
     int start;
     int end;

    public MyThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }
    }
}

public class TwoThreadPrint {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread(1, 10);
        MyThread thread2 = new MyThread(11, 20);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        MyThread thread3 = new MyThread(21, 30);
        thread3.start();

        try {
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
