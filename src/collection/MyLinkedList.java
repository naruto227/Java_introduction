package collection;

/**
 * Created by hzq on 16-10-28.
 */
public class MyLinkedList {
    private Node first;
    private Node last;  //记录当前节点

    private int size;

    //  往尾部追加元素
    public void add(Object o) {
        Node n = new Node();

        if (first == null) {
            n.setPrevious(null);
            n.setpNode(o);
            n.setpNext(null);
            first = n;
            last = n;
        } else {
//            直接往last节点后增加新的节点
            n.setPrevious(last);
            n.setpNode(o);
            n.setpNext(null);

            last.setpNext(n);   //之前的最后一个节点的下一指针，指向新加入的节点
            last = n;   //last指向最后一个节点
        }
        size++;
    }

    //    第几个位置插入元素
    public void add(int index, Object o) {
        Node temp = node(index);
        Node newNode = new Node();
        newNode.pNode = o;
        if (temp != null) {
            Node up = temp.previous;
            Node down = temp.pNext;
            up.pNext = newNode;
            newNode.previous = up;
            newNode.pNext = down;
            down.previous = newNode;

            size++;
        }
    }

    public int getSize() {
        return size;
    }

    public Object get(int index) {   //获得第几个元素
//        0 1 2 3 4
        rangeCheck(index);
        Node temp = node(index);
        if (temp != null) {
            return temp.pNode;
        }
        return null;
    }

    public Object remove(int index) {
        Node temp = node(index);
        if (temp != null) {
            Node up = temp.previous;
            Node down = temp.pNext;
            up.pNext = down;
            down.previous = up;
            size--;
        }
        return temp.pNode;
    }

    //  找到第index个节点
    private Node node(int index) {
//        Node temp = null;
//        if (first != null) {
//            temp = first;
        if(index < 0 || index >= size){
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
            /**
             * size:50  查找位置：2、47呢
             * index 跟 size/2 比较
             * [0,24]   [25,49]
             */
            if (index < (size >> 1)) {
                Node x = first;
                for (int i = 0; i < index; i++) {
                    x = x.pNext;
                }
                return x;
            } else {
                Node x = last;
                for (int i = size - 1; i >= 0; i--)
                    x = x.previous;
                return x;
            }

        }
//        LinkedList
//        return temp;
//    }

    private void rangeCheck(int index) {
        if (index < 0 || index >= size) {
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add("aaa");    //index = 0
        list.add("bbb");    //index = 1
        list.add("ccc");    //index = 2
        list.add("ddd");    //index = 3
        list.add("eee");
        list.add("fff");
        list.add("ggg");

        /*for ( i : list) {

        }*/
        System.out.println("get到的元素：" + list.get(1) + "\t还剩多少个元素：" + list.getSize());
        System.out.println("删除的节点：" + list.remove(2) + "\t还剩多少个元素：" + list.getSize());
    }
}

