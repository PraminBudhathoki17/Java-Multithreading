public class Counter{
    private int counter =1;
    private int MAX_VALUE;

    public Counter(int MAX_VALUE){
        this.MAX_VALUE = MAX_VALUE;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int count) {
        this.counter = count;
    }

    public int getMAX_VALUE() {
        return MAX_VALUE;
    }

    public void setMAX_VALUE(int MAX_VALUE) {
        this.MAX_VALUE = MAX_VALUE;
    }

    public void print(){
        System.out.printf("%d is printed by %s\n",counter,Thread.currentThread().getName());
        counter++;
    }
}
