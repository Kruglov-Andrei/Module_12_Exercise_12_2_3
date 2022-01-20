import java.util.ArrayDeque;
import java.util.Queue;

public class Main_FIFO {
    public static void main(String[] args) {
        int numberOfTasks = 5;// ограничим нашу очередь 5 задачами
        Queue toDoQueue = new ArrayDeque(numberOfTasks);// создаем очередь
        Boss_FIFO boss = new Boss_FIFO(toDoQueue); // создаем начальника с ссылкой на очередь
        Worker_FIFO worker = new Worker_FIFO(toDoQueue);// то же самое делаем с рабочим
        // в цикле начальник заполняет очередь заданиями
        for (int i = 1; i <= numberOfTasks; i++){
            boss.giveTask("Задание " + i);
        }
        System.out.println("Начальник закончил давать задание");
        // в цикле говорим рабочему взять задание из очереди и выполнить его
        // скажем ему взять на одно задание больше, чем есть в очереди
        for (int i = 1; i <= numberOfTasks + 1; i++){
            worker.takeTask();
        }
    }
}
