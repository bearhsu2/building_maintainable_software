package idv.kuma.chap02_2.better;

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

            GroupEstablisher groupEstablisher = new GroupEstablisher(numWaitings, waitingQueue);

            List<Integer> group = groupEstablisher.getGroup();
            numWaitings = groupEstablisher.getNumWaitings();

            establishedGroups.add(group);

            System.out.println("Group established: size = " + group.size());
        }
        System.out.println("Established groups: " + establishedGroups.size());
    }

    private class GroupEstablisher {
        private int numWaitings;
        private List<Integer> group;
        private Queue<Integer> waitingQueue;

        public GroupEstablisher(int numWaitings, Queue<Integer> waitingQueue) {
            this.waitingQueue = waitingQueue;
            this.numWaitings = numWaitings;
            group = new ArrayList<>();

            invoke();
        }

        public int getNumWaitings() {
            return numWaitings;
        }

        public List<Integer> getGroup() {
            return group;
        }

        public void invoke() {
            while (numWaitings > 0 && group.size() <= MAX_GROUP_SIZE) {
                int customer = waitingQueue.poll();
                group.add(customer);
                numWaitings--;
            }
        }
    }
}
