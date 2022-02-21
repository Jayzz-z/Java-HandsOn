package  Feb16HandsOn.Ques2;

class MyClass extends Thread {
    String threadName;

    public MyClass(String threadName) {

        this.threadName = threadName;
    }

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(threadName+" Thread executing "+i);
               // Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
