package idv.kuma.chap02_1.refactored;

import java.util.List;

public class Game {

    private long startTime;
    private Player player;

    private List<Player> observers;

    private boolean inProgress = false;


    public Game(long startTime, Player player, List<Player> observers) {
        this.startTime = startTime;
        this.player = player;
        this.observers = observers;

    }

    public boolean start() {

        if (inProgress){
            printLineAndSendMessage("Game already in Progress", "game in progress");
            return false;
        }

        inProgress = true;

        return true;
    }

    private void printLineAndSendMessage(String game_already_in_progress, String game_in_progress) {
        printLine(game_already_in_progress);

        sendMessagesToObservers(game_in_progress);
    }

    private void printLine(String line) {
        System.out.println(line);
    }

    private void sendMessagesToObservers(String message) {
        for (Player observer : observers) {
            observer.sendMessage(message);
        }
    }


}
