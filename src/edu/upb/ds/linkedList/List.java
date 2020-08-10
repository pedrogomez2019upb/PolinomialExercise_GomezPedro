package edu.upb.ds.listsactivity;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class List implements ListInterface,Iterable<ListNode>{

    public ListNode head;
    public ListNode tail;
    public ListNode inode;
    public int size;

    public List() {
        head = null;
        tail = null;
        size = 0;

    }

    public List(Object object){
        head= new ListNode(object);
        tail =head;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }


    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void clear() {
        head=null;
        tail=null;
    }

    @Override
    public Object getHead() {
        return null;
    }

    @Override
    public Object getTail() {
        return null;
    }

    @Override
    public Object get(int index) {
        int counter=0;
        ListNode temporalNode=head;
        while (counter<index){
            temporalNode=temporalNode.getNext();
            counter++;
        }
        return temporalNode.getObject();
    }

    @Override
    public Object search(Object object) {
        Iterator<ListNode> i = this.iterator();
        ListNode inode;
        while (i.hasNext()) {

            inode = i.next();
            if (inode.getObject().toString().equals(object.toString())) {
                return inode;
            }
        }
        return null;
    }

    @Override
    public boolean add(Object object)
    {
        /*
        if(head==null){
            head = new ListNode(object);
            tail = head;
        }
        else
        {
            ListNode temporalNode=head;
            ListNode newNode=new ListNode(object);
            newNode.linkNext(temporalNode);
            head=newNode;
        }
        size ++;
        */
        try {
            if(isEmpty()) {
                head=new ListNode(object);
                tail=head;
                size++;
            }else {
                tail.next=new ListNode(object);
                tail=tail.next;
                size++;
            }
            return true;

        }catch (Exception e) {
            return false;
        }
    }

    @Override
    public void addTail(Object object) {
        if(tail==null){
            tail = new ListNode(object);
            head = tail;
        }
        else
        {
            ListNode temporalNode=tail;
            ListNode newNode=new ListNode(object);
            newNode.linkNext(temporalNode);
            tail=newNode;
        }
        size ++;
    }

    @Override
    public void addEnd(Object object)
    {
        if(!isEmpty()){
            tail.next=new ListNode(object);
            tail=tail.next;
        }else {
            head=tail=new ListNode(object);
        }
        size++;
    }

    @Override
    public boolean insert(ListNode node, Object object) {
        return false;
    }

    @Override
    public boolean insert(Object ob, Object object) {
        try {
            if (ob != null) {
                ListNode inode = (ListNode) this.search(ob);
                if (inode.next == null) {
                    add(object);
                } else {
                    ListNode newNode = new ListNode(object);
                    newNode.next = inode.next;
                    inode.next = newNode;
                    size++;
                }
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean insertHead(Object object) {
        return false;
    }

    @Override
    public boolean insertTail(Object object) {
        try {
            if (isEmpty()) {
                head = new ListNode(object);
                tail = head;
                size++;
            } else {
                tail.next = new ListNode(object);
                tail = tail.next;
                size++;
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }


    @Override
    public boolean set(ListNode node, Object object) {
        return false;
    }

    @Override
    public void remove(int position)
    {
        ListNode aux = head;
        for (int i = 0; i < position - 1; i++)
        {
            aux = aux.getNext();
        }
        ListNode nNext = aux.getNext();
        aux.setNext(nNext.getNext());
        size--;
    }

    @Override
    public void removeTail(int position) {
        ListNode aux = head;
        for (int i = 0; i < position - 1; i++)
        {
            aux = aux.getNext();
        }
        ListNode nNext = aux.getNext();
        aux.setNext(nNext.getNext());
        size--;
    }

    @Override
    public boolean contains(Object object) {
        return false;
    }

    @Override
    public boolean isEquals(Object object) {
        return false;
    }

    @Override
    public Iterator<ListNode> iterator() {
        inode = head;
        Iterator<ListNode> i = new Iterator<ListNode>() {
            @Override
            public boolean hasNext() {
                return inode.next != null ? true : false;
            }

            @Override
            public ListNode next() {
                if (hasNext()) {
                    ListNode tmp = inode;
                    inode = inode.next;
                    return tmp;
                } else {
                    return null;
                }
            }
        };
        return i;
    }

    @Override
    public Object[] toArray() {
        Object[] array= new Object[size];
        ListNode node= head;
        for (int i=0; i<size; i++){
            array[i]=node;
            node= node.next;
        }
        return array;
    }

    @Override
    public Object[] toArray(Object[] object) {
        try {
            ListNode node = head;
            int sizeArray = object.length;
            int x = 0;
            object = new Object[size];
            object[0] = head.getObject();

            do {
                node = node.next;
                x++;
                object[x] = node.getObject();
            } while (x <= sizeArray);
            return object;
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public Object getBeforeTo() {
        return null;
    }


    public Object getBeforeTo(ListNode node) {
        return null;
    }

    @Override
    public Object getNextTo() {
        return null;
    }

    @Override
    public Object getNextTo(ListNode node) {
        return null;
    }

    @Override
    public List subList(ListNode from, ListNode to) {
        return null;
    }

    @Override
    public List sortList() {
        return null;
    }

    @Override
    public ListNode rec(ListNode node) {
        if(node.next ==null){
            System.out.println(node.toString());
        }
        else{
            System.out.println(node.toString());
            return rec(node.next);
        }
        return null;
    }

    @Override
    public void printList() {
        if (!isEmpty()) {
            ListNode aux = head;
            int i = 0;
            while (aux != null) {
                System.out.print(i + ".[ " + aux.getObject() + " ]" + " ->  ");
                aux = aux.getNext();
                i++;
            }
        }
    }

    @Override
    public List mixList() {
        List newList= new List();
        Object[] shuffle= toArray();
        Collections.shuffle(Arrays.asList(shuffle));
        for (int i=0; i<size; i++ ){
            newList.add(shuffle[i]);
        }
        return newList;
    }


}
//Developed by Pedro Gomez - ID:000396221
