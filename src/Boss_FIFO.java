import java.util.Queue;

public class Boss_FIFO {
    private Queue toDoQueue;// у босса тоже есть ссылка на очередь из заданий

    public Boss_FIFO(Queue toDoQueue) {
        this.toDoQueue = toDoQueue;// даем ссылку на очередь в конструкторе
    }
    public void giveTask(String task){
        toDoQueue.add(task);// кладем задание в очередь
        System.out.println("Дал задачу " + task);
    }
}
