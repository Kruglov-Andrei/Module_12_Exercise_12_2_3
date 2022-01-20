import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;

public class Main_LIFO {
    public static void main(String[] args) {
        int numberOfTasks = 5;
        Deque toDoDeque = new ArrayDeque(numberOfTasks);
        Boss_LIFO boss_lifo = new Boss_LIFO(toDoDeque);
        Worker_LIFO worker_lifo = new Worker_LIFO(toDoDeque);
        for (int i = 1; i <= numberOfTasks; i++){
            boss_lifo.giveTask("Задание " + i);
        }
        System.out.println("Начальник закончил давать задание");
        for (int i = 1; i <= numberOfTasks + 1; i++){
            worker_lifo.takeTask();
        }
    }
}
