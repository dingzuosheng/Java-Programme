package qdl_aud_praktikum3;

import qdl.list.IList;
class Link<T>{
	T data;
	Link<T> next;
}
public class list<T> implements IList<T> {
	Link<T> start;
	Link<T> end;
	int size;

	@Override
	public int size() {
		int count = 0;
		Link<T> l=start;
		while(l!=null) {
			count++;
			l=l.next;
		}
		return count;
	}

	@Override
	public boolean isEmpty() {
		boolean erg;
		if(size()==0) {
			erg=true;
		}else {
			erg=false;
		}
		return erg;
	}

	@Override
	public void add(T data) {
		if(start == null) {
			start=end=new Link<T>();
			start.data=data;
		}else {
			end.next=new Link<T>();
			end.next.data=data;
			end=end.next;
		}
		
	}

	@Override
	public void addFront(T data) {
		
		
	}

	@Override
	public void addAll(IList<T> list) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insert(int index, T data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(T data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T get(int index) {
		if(index<0 || index>=size())
			 throw new RuntimeException("List index out of bounds");
		Link<T> l= start;
		for(int i=0;i<index;i++) {
			l=l.next;
		}
		return l.data;
	}

	@Override
	public boolean contains(T data) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public IList<T> split(int n) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void reverse() {
		// TODO Auto-generated method stub
		
	}

}
