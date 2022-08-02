package by.gulis.LibraryBoot.repositories;

import by.gulis.LibraryBoot.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BooksRepository extends JpaRepository<Book,Integer> {
    List<Book> findByNameStartingWith(String search);
}
