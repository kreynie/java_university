public class Main {
    public static void main(String[] args) {
        System.out.println("Тестирование ArrayQueueModule");
        ArrayQueueModule.enqueue(1);
        ArrayQueueModule.enqueue(2);
        ArrayQueueModule.enqueue(3);

        System.out.println("Первый элемент: " + ArrayQueueModule.element());
        System.out.println("Удаленный элемент: " + ArrayQueueModule.dequeue());
        System.out.println("Размер очереди после удаления: " + ArrayQueueModule.size());

        ArrayQueueModule.clear();
        System.out.println("Размер очереди после очистки: " + ArrayQueueModule.size());
        System.out.println();

        System.out.println("Тестирование ArrayQueueADT");
        ArrayQueueADT queueADT = new ArrayQueueADT();
        ArrayQueueADT.enqueue(queueADT, 1);
        ArrayQueueADT.enqueue(queueADT, 2);
        ArrayQueueADT.enqueue(queueADT, 3);

        System.out.println("Первый элемент: " + ArrayQueueADT.element(queueADT));
        System.out.println("Удаленный элемент: " + ArrayQueueADT.dequeue(queueADT));
        System.out.println("Размер очереди после удаления: " + ArrayQueueADT.size(queueADT));

        ArrayQueueADT.clear(queueADT);
        System.out.println("Размер очереди после очистки: " + ArrayQueueADT.size(queueADT));
        System.out.println();

        System.out.println("Тестирование ArrayQueue");
        ArrayQueue queue = new ArrayQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Первый элемент: " + queue.element());
        System.out.println("Удаленный элемент: " + queue.dequeue());
        System.out.println("Размер очереди после удаления: " + queue.size());

        queue.clear();
        System.out.println("Размер очереди после очистки: " + queue.size());
    }
}
