package com.example.out;

import org.springframework.stereotype.Component;

@Component
public class BookPersistenceAdapter implements SaveBookPort{


  @Override
  public boolean saveBook(String name) {
    return false;
  }
}
