package idv.kuma.chap05.better;

public class Step {
    private final int xSteps;
    private final int ySteps;
    private final int hSteps;

    public Step(int xSteps, int ySteps, int hSteps) {
        this.xSteps = xSteps;
        this.ySteps = ySteps;
        this.hSteps = hSteps;
    }

    public int getxSteps() {
        return xSteps;
    }

    public int getySteps() {
        return ySteps;
    }

    public int gethSteps() {
        return hSteps;
    }
}
