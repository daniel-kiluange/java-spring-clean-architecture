package com.example.service;

import org.example.usecase.in.CreateBookUseCase;
import org.springframework.stereotype.Service;

@Service
public class CreateBookService implements CreateBookUseCase {

  @Override
  public boolean createBook(String bookName) {
    return false;
  }
}
