public class NumberPrinter extends Thread implements Runnable {
    private Integer upperBoundNumber;

    public NumberPrinter(Integer upperBoundNumber) {
        this.upperBoundNumber = upperBoundNumber;
    }

    @Override
    public void run() {
        for (Integer i = 0; i < this.getUpperBoundNumber(); i++) {
            if (Thread.interrupted()) {
                System.out.println(" I'm another thread & I've been interrupted");
                break;
            }
            System.out.println("i = " + i);
        }
    }

    public Integer getUpperBoundNumber() {
        return this.upperBoundNumber;
    }
}
