package edu.upb.ds.listsactivity;

import java.util.Iterator;

public interface ListInterface {

    /*
    essential operations
    */

    public boolean isEmpty(); //OK

    public int getSize(); //Ok

    public void clear(); //Ok

    public Object getHead();//Ok

    public Object getTail();//Ok

    public Object get(int index);//Ok

    public Object search(Object object);

    public boolean add(Object object);//Ok

    public void addTail(Object object);//Ok

    public void addEnd(Object object);//Ok

    public boolean insert(ListNode node, Object object);

    public boolean insert(Object ob, Object object);

    public boolean insertHead(Object object);//OK

    public boolean insertTail(Object object);

    public boolean set(ListNode node, Object object);

    public void remove(int position);//Ok

    public void removeTail(int position);//Ok

    /*
    expansion operations
     */

    public boolean contains(Object object);

    public boolean isEquals(Object object);

    public Iterator<ListNode> iterator();//Soso

    public Object[] toArray();//Ok

    public Object[] toArray(Object[] object);//Ok

    public Object getBeforeTo();

    public Object getBeforeTo(ListNode node);

    public Object getNextTo();

    public Object getNextTo(ListNode node);

    public List subList(ListNode from, ListNode to);

    public List sortList();

    public List mixList();

    public void printList();

    public ListNode rec(ListNode list);


}
//Developed by Pedro Gomez - ID:000396221
