package AdjacencyList;

public class Node
{
    static final int WHITE = 0;
    static final int BLACK = 1;

    int value;
    int color;
    Node next;

    Node(int value)
    {
        this.value = value;
        this.color = WHITE;
        this.next = null;
    }

    void setColor(int x)
    {
        this.color = x;
    }
}
