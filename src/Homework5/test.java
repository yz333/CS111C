package Homework5;

public class test {
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3, a);
        Node c = new Node(7, b);
        Node d = new Node(2, c);
        Node firstNode = d;
        Node currentNode = firstNode;
        currentNode.next = currentNode.next.next;
        System.out.println(currentNode.data);
    }
}
