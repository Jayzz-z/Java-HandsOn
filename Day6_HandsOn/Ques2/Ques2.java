package  Feb16HandsOn.Ques2;

class Ques2 {
    public static void main(String[] args) throws InterruptedException {
        MyClass thread1 = new MyClass("Thread 1");
        MyClass thread2 = new MyClass("Thread 2");
        thread1.start();
        thread2.start();
    }
}
