package Level2;

import java.util.LinkedList;
import java.util.Queue;

public class Process {
    public static void main(String[] args) {
        int[] Priorities = new int[] {2, 1, 3, 2};
        int location = 2;

        Queue<Integer> q = new LinkedList<Integer>();
            for (int i : Priorities){
                q.offer(i);    
            }
            while (!q.isEmpty()) {
                for (int i=0; i<Priorities.length;i++){
                    if (q.peek() == Priorities[i]){
                        q.poll();
                    }
                }
            }
        System.out.println(q);
    }
}
