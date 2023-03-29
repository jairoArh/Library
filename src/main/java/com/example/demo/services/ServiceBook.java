package com.example.demo.services;

import com.example.demo.entityes.Book;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ServiceBook {
    private Map<Integer, Book> books;

    public ServiceBook() {
        books = new HashMap<>();
    }

    public Book findById( Integer id ){

        Book book = books.get( id );

        return book;
    }

    public List<Book> getBooks() {
        List<Book> listBooks = new ArrayList<>();

        Set<Integer> keys = books.keySet();
        Iterator<Integer> it = keys.iterator();

        while( it. hasNext()){
            listBooks.add( books.get( it.next() ) );
        }

        return  listBooks;
    }

    public Book addBook( Book book ){
        if ( findById( book.getId()) == null){
            books.put( book.getId(), book );

            return findById( book.getId());
        }

        return null;
    }
}
