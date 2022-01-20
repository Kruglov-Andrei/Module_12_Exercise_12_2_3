import java.util.Deque;

public class Boss_LIFO {
    private Deque toDoDeque;

    public Boss_LIFO(Deque toDoDeque) {
        this.toDoDeque = toDoDeque;
    }
    public void giveTask(String task){
        toDoDeque.add(task);
        System.out.println("Дал задачу " + task);
}
}
