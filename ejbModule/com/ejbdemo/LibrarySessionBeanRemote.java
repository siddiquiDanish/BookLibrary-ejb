package com.ejbdemo;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface LibrarySessionBeanRemote {
	
	void addBook(String bookName);
	List getBooks();

}
