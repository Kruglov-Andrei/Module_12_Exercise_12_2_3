import java.util.Deque;
import java.util.Queue;

public class Worker_LIFO {
    private Deque toDoDeque; // у рабочего есть ссылка на очередь из заданий

    public Worker_LIFO(Deque toDoDeque) {
        this.toDoDeque = toDoDeque; // даем ссылку на очередь в конструкторе
    }
    public void takeTask(){
        Object task = toDoDeque.pollLast();// вынимаем задание из конца очереди
        if (task != null){
            System.out.println("выполняю задачу: " + task);
        }
        else{
            System.out.println("Нет работы. Можно идти домой");
        }
    }
}
