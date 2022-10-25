package org.example.usecase.out;

import org.example.entity.Book;

public interface RegisterBookUseCase {

  Book registerBook(RegisterBookCommand command);

}
