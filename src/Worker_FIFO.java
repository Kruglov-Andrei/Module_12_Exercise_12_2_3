import java.util.Queue;

public class Worker_FIFO {
    private Queue toDoQueue; // у рабочего есть ссылка на очередь из заданий

    public Worker_FIFO(Queue toDoQueue) {
        this.toDoQueue = toDoQueue; // даем ссылку на очередь в конструкторе
    }
    public void takeTask(){
        Object task = toDoQueue.poll();// вынимаем задание из очереди
        if (task != null){
            System.out.println("выполняю задачу: " + task);
        }
        else{
            System.out.println("Нет работы. Можно идти домой");
        }
    }
}
