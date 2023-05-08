package com.jpcchaves.booksys.core.usecases.book.impl;

import com.jpcchaves.booksys.core.dataprovider.book.AddBook;
import com.jpcchaves.booksys.core.domain.Book;
import com.jpcchaves.booksys.core.usecases.book.AddBookUseCase;

public class AddBookUseCaseImpl implements AddBookUseCase {
    private final AddBook addBook;

    public AddBookUseCaseImpl(AddBook addBook) {
        this.addBook = addBook;
    }

    @Override
    public Book add(Book book) {
        Book newBook = addBook.add(book);
        return newBook;
    }
}
