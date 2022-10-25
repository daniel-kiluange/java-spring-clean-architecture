package com.example.in;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreateBookAdapter {

  private CreateBookPort createBookPort;

  public CreateBookAdapter(@Autowired CreateBookPort createBookPort) {
    this.createBookPort = createBookPort;
  }

  @PostMapping
  public boolean test(){
    return createBookPort.createBook("test");
  }


}
