public class Runner {
    public static void main(String[] args) {
        Queue kolejka = new Queue(5);

        System.out.println(kolejka.isFull());
        System.out.println(kolejka.isEmpty());

        try {
            kolejka.enqueue(2);
            kolejka.enqueue(8);
            kolejka.enqueue(9);
            kolejka.enqueue(1);
        } catch (QueueFullException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(kolejka);

        System.out.println(kolejka.peek());

        try {
            kolejka.dequeue();
        } catch (QueueEmptyException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(kolejka);

        try {
            kolejka.enqueue(5);
        } catch (QueueFullException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(kolejka);
        System.out.println(kolejka.peek());
    }
}
