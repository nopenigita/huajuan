package cn.itcast.demo.thread;

/**
 * @author huajuan
 */
public class ThreadOrange {

    private static int zong = 9;
    private static int a = 3;
    private static int b = 2;
    private static int time = 10;

    /**
     * 共计9个桔子，有2个小朋友，小朋友A每次拿2个桔子，小朋友B每次拿3个桔子，小朋友10s中吃1个桔子，吃完后继续去拿。
     * 如果剩余的桔子不够小朋友每次拿的数量，则2个小朋友停止拿桔子，并喊一声“不拿了”。 请用java多线程程序表述上面的过程。
     * @param args
     */
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Object lock = new Object();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    synchronized (lock){
                        try {
                            if (zong < a){
                                System.out.println("小朋友A不拿了");
                                lock.wait();
                            }
                            zong = zong - a;
                            Thread.sleep(time * a );
                        }catch (InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
        thread1.start();

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (lock) {
                        try {
                            if (zong < b) {
                                System.out.println("小朋友B不拿了");
                                lock.wait();
                            }
                            zong = zong - b;
                            Thread.sleep(time * b);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
        thread2.start();
    }
}
