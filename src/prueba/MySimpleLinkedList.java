package prueba;

import Iterator.MyIterator;
import Nodo.Node;

import java.util.Iterator;
public class MySimpleLinkedList<T> implements Iterable<T> {

    private Node<T> first;
    private int size;

    public MySimpleLinkedList() {
        this.first = null;
        this.size=0;
    }

    public void insertFront(T info) {
        Node<T> tmp = new Node<T>(info,null);
        tmp.setInfo(info);

        if(this.first==null){
            tmp.setNext(null);
            this.first= tmp;
        }else{
            tmp.setNext(this.first.getNext());
            this.first.setNext(tmp);
        }

        this.size++;
    }

    public T extractFront() {
        if((this.first!=null)&&(this.first.getNext()!=null)){
            this.first=this.first.getNext();
            size--;
        }
        return null;
    }

    public boolean isEmpty() {
        if(this.first!=null){
            return false;
        }
        return true;
    }

    public T get(int index) {
        Node tmp=this.first;
        if((index-1)<this.size){
            for(int i=0;i<index-1;i++){
                if(tmp.getNext()!=null){
                    tmp=tmp.getNext();
                }
            }
            return (T) tmp.getInfo();
        }
        return null;
    }

    public int size() {
        return this.size;
    }

    @Override
    public String toString() {
        Node tmp = this.first;
        for(int i=0; i<this.size;i++){
            System.out.print(tmp.getInfo()+" , ");
            tmp=tmp.getNext();
        }
        return null;

    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator<T>(this.first);
    }

}