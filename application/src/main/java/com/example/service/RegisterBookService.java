package com.example.service;

import com.example.out.SaveBookPort;
import org.example.entity.Book;
import org.example.usecase.out.RegisterBookCommand;
import org.example.usecase.out.RegisterBookUseCase;
import org.springframework.stereotype.Service;

@Service
public class RegisterBookService implements RegisterBookUseCase {

  private SaveBookPort saveBookPort;

  public RegisterBookService(SaveBookPort saveBookPort) {
    this.saveBookPort = saveBookPort;
  }

  @Override
  public Book registerBook(RegisterBookCommand command) {
    var result = saveBookPort.saveBook(command.bookName());
    return null;
  }
}