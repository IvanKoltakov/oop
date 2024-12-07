package att_2.task_7;

public class Node<T> {

    public T data;
    public Node<T> prev;
    public Node<T> next;

    Node(T data) {
        this.data = data;
    }
}

