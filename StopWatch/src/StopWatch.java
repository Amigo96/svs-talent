public class StopWatch implements Runnable {
    private boolean STARTED = false;
    private boolean STOPPED = true;
    private long seconds;

    public StopWatch() {
        this.seconds = 1;
    }

    public void startStopWatch() throws InterruptedException {
        this.STARTED = true;
        this.STOPPED = false;

        synchronized (this) {
            this.STARTED = true;
            this.notifyAll();
            System.out.println("method: startStopWatch() called!");
        }
    }

    public void stopStopWatch() {
        this.STOPPED = true;
        this.STARTED = false;

        synchronized (this) {
            this.STARTED = false;
        }
        System.out.println("method: stopStopWatch() called!");
    }

    public void resetStopWatch() {
        this.STOPPED = true;
        this.STARTED = false;
        this.seconds = 1;

        System.out.println("method: resetStopWatch() called!");
    }

    @Override
    public void run() {
        System.out.println("method: run() called!");
        while (true) {
            if (!STARTED) {
                try {
                    synchronized (this) {
                        wait();
                    }
                } catch (InterruptedException e) {
                }
            }
            System.out.println("tempSecond : " + seconds++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }

    public long getSeconds() {
        return seconds;
    }

    public void setSTARTED() {
        this.STARTED = !STARTED;
    }

    public boolean getSTARTED() {
        return this.STARTED;
    }

    public void setSTOPPED() {
        this.STOPPED = !STOPPED;
    }

    public boolean getSTOPPED() {
        return this.STOPPED;
    }


}
