package com.jpcchaves.booksys.dataprovider;

import com.jpcchaves.booksys.core.dataprovider.book.AddBook;
import com.jpcchaves.booksys.core.domain.Book;
import com.jpcchaves.booksys.dataprovider.repositories.BookRepository;
import org.springframework.stereotype.Component;

@Component
public class AddBookImpl implements AddBook {

    private final BookRepository bookRepository;

    public AddBookImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Book add(Book book) {
        return bookRepository.save(book);
    }
}

