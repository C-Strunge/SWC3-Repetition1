public class Node <T> {
    private T data;
    private Node pointer;

    public Node(T data, Node pointer){
        this.data = data;
        this.pointer = pointer;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", pointer=" + pointer +
                '}';
    }
}
