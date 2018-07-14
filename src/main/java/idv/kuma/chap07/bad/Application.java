package idv.kuma.chap07.bad;

public class Application {




    public void execute(){

        Reader baseReader = new Reader(5, 10, true, false);
        Reader uninterruptableReader = new Reader(5, 10, false, false);
        Reader singleThreadReader = new Reader(1, 0, true, false);
        Reader quietReader = new Reader(5, 10, true, true);

        // do other things...
    }


}
