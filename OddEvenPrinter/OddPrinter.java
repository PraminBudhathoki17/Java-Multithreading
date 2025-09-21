public class OddPrinter implements Runnable {
    private Counter counter;
    public OddPrinter(Counter counter){
        this.counter = counter;
    }

    @Override
    public void run() {
        while(true){
            synchronized (counter){
                if(counter.getCounter()%2==0 && counter.getCounter()<=counter.getMAX_VALUE()){
                    try {
                        counter.wait();
                    }catch (InterruptedException e){
                        throw new RuntimeException(e);
                    }
                }
                if(counter.getCounter()>counter.getMAX_VALUE()){
                    counter.notifyAll();
                    break;
                }
                counter.print();
                counter.notifyAll();

            }
        }
    }
}
