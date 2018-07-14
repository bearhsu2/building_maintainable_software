package idv.kuma.chap07.better;

public class Application {


    public void execute() {

        Reader baseReader = ReaderFactory.newBaseReader(5, 10);
        Reader uninterruptableReader = ReaderFactory.newUninterruptableReader(5, 10);
        Reader singleThreadReader = ReaderFactory.newSingleThreadReader();
        Reader quietReader = ReaderFactory.newQuietReader(5,10);

        // do other things...
    }


}
