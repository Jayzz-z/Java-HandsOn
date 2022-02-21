package  Feb16HandsOn.Ques1;

class MyClass extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Child Thread executing");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("InterruptedException occur and handled by catch");
        }
    }
}
