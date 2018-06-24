package idv.kuma.chap05.bad;

public class ThreeDPackMan {

    int x, y, h, fatigue;

    public ThreeDPackMan(int fatigue) {
        this.fatigue = fatigue;
    }

    public void move(int xSteps, int ySteps, int hSteps, int fatigueConsumption) {
        this.x += xSteps;
        this.y += ySteps;
        this.h += hSteps;
        this.fatigue -= fatigueConsumption;
    }
}
