package idv.kuma.chap07.better;

public class ReaderFactory {

    public static Reader newBaseReader(int threads, int buffer) {
        return new Reader(threads, buffer, true, false);
    }


    public static Reader newUninterruptableReader(int threads, int buffer) {
        return new Reader(threads, buffer, false, false);

    }

    public static Reader newSingleThreadReader() {
        return new Reader(1, 0, true, false);
    }

    public static Reader newQuietReader(int threads, int buffer) {
        return new Reader(threads, buffer, true, true);
    }
}
