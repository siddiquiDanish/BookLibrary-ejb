package com.ejbdemo;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class NewSessionBean
 */
@Stateless
public class LibrarySessionBean implements LibrarySessionBeanRemote {
	
	List<String> bookShelf;

    /**
     * Default constructor. 
     */
    public LibrarySessionBean() {
        // TODO Auto-generated constructor stub
    	bookShelf = new ArrayList<>();
    }

	@Override
	public void addBook(String bookName) {
		// TODO Auto-generated method stub
		bookShelf.add(bookName);
		
	}

	@Override
	public List<String> getBooks() {
		// TODO Auto-generated method stub
		return bookShelf;
	}

}
