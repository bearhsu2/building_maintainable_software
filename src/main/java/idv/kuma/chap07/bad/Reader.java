package idv.kuma.chap07.bad;

public class Reader {

    private int threads;
    private int buffer;

    private boolean interruptable;
    private boolean quietMode;

    public Reader(int threads, int buffer, boolean interruptable, boolean quietMode) {
        this.threads = threads;
        this.buffer = buffer;
        this.interruptable = interruptable;
        this.quietMode = quietMode;
    }

    public void read(String fileName) {
        // ...
        // Do the reading stuff...
        // ...
    }
}
