package collection;

/**
 * Created by hzq on 16-10-28.
 */
//用来表示一个节点
public class Node {
    Node previous;  //上一个节点指针
    Object pNode;
    Node pNext;

    public Node() {
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public Object getpNode() {
        return pNode;
    }

    public void setpNode(Object pNode) {
        this.pNode = pNode;
    }

    public Node getpNext() {
        return pNext;
    }

    public void setpNext(Node pNext) {
        this.pNext = pNext;
    }
}
