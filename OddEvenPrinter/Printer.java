public class Printer implements Runnable {

    public final Counter counter;
    private final int threadId;

    public Printer(Counter counter, int threadId) {
        this.counter = counter;
        this.threadId = threadId;
    }

    @Override
    public void run() {
        while(true){
            synchronized (counter) {
                while (counter.getCounter() <= counter.getMAX_VALUE() && counter.getCounter() % 2 != threadId) {
                    try {
                        counter.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                if (counter.getCounter() > counter.getMAX_VALUE()) {
                    counter.notifyAll();
                    break;
                }
                counter.print();
                counter.notifyAll();
            }
        }
    }
}
