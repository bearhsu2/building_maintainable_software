package idv.kuma.chap02_2.bad;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Distributor {
    public static final int MAX_GROUP_SIZE = 10;

    Queue<Integer> waitingQueue;
    private List<List<Integer>> establishedGroups = new ArrayList<>();

    public Distributor(Queue<Integer> waitingQueue) {
        this.waitingQueue = waitingQueue;
    }

    public void distribute(){
        int numWaitings = waitingQueue.size();

        while (numWaitings > 0){

            List<Integer> group = new ArrayList<>();

            while (numWaitings > 0 && group.size() <= MAX_GROUP_SIZE) {
                int customer = waitingQueue.poll();
                group.add(customer);
                numWaitings--;
            }

            establishedGroups.add(group);

            System.out.println("Group established: size = " + group.size());
        }
        System.out.println("Established groups: " + establishedGroups.size());
    }
}
