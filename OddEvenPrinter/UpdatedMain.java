public class UpdatedMain {
    public static void main(String[] args) {
        Counter counter = new Counter(10);
        Printer oddPrinter = new Printer(counter,0);
        Printer evenPrinter = new Printer(counter,1);
        Thread thread1 = new Thread(oddPrinter,"odd printer");
        Thread thread2 = new Thread(evenPrinter,"even printer");
        thread1.start();
        thread2.start();
    }
}
