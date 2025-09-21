public class main {
    public static void main(String[] args) {
        Counter counter = new Counter(10);
        OddPrinter oddPrinter = new OddPrinter(counter);
        EvenPrinter evenPrinter = new EvenPrinter(counter);
        Thread thread1 = new Thread(oddPrinter,"odd printer");
        Thread thread2 = new Thread(evenPrinter,"even printer");
        thread1.start();
        thread2.start();
    }
}