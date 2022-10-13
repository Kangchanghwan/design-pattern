package com.example.designpattern.template_methord_pattern;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TemplateTest {

  @Test
  @DisplayName("템플릿 메서드 패턴")
  void template(){

    Template<String> template = new Template<>() {
      @Override
      String template() {
        System.out.println("본문입니다.");
        return null;
      }
    };


    template.execute();

  }

}