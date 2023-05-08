package com.jpcchaves.booksys.config.book;

import com.jpcchaves.booksys.core.dataprovider.book.AddBook;
import com.jpcchaves.booksys.core.usecases.book.impl.AddBookUseCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AddBookConfig {
    @Bean
    public AddBookUseCaseImpl addBookUseCase(AddBook addBook) {
        return new AddBookUseCaseImpl(addBook);
    }
}
