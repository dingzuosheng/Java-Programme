package qdl_aud_praktikum3;

import qdl.list.AbstractListTest;
import qdl.list.IList;

public class listtest extends AbstractListTest {

	@Override
	public <T> IList<T> get() {
		return new list<T>();
	}

}
