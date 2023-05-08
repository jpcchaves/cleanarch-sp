package com.jpcchaves.booksys.dataprovider.repositories;

import com.jpcchaves.booksys.core.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
