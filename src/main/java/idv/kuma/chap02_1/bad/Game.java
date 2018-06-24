package idv.kuma.chap02_1.bad;

import java.util.List;

public class Game {

    private long startTime;
    private Player player;

    private List<Player> observers;

    private boolean inProgress = false;


    public Game(long startTime, Player player,List<Player> observers) {
        this.startTime = startTime;
        this.player = player;
        this.observers = observers;

    }

    public boolean start() {

        if (inProgress){
            System.out.println("Game already in Progress");

            for (Player observer : observers){
                observer.sendMessage("game in progress");
            }

            return false;
        }

        inProgress = true;

        return true;
    }


}
