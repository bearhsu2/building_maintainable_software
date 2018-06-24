package idv.kuma.chap05.better;

public class ThreeDPackMan {

    int x, y, h, fatigue;

    public ThreeDPackMan(int fatigue) {
        this.fatigue = fatigue;
    }
    
    public void move(Step step, int fatigueConsumption) {
        changePosition(step);
        changeFatigue(fatigueConsumption);
    }

    private void changeFatigue(int fatigueConsumption) {
        this.fatigue -= fatigueConsumption;
    }

    private void changePosition(Step step) {
        this.x += step.getxSteps();
        this.y += step.getySteps();
        this.h += step.gethSteps();
    }
}
